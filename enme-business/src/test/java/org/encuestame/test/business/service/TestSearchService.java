/*
 ************************************************************************************
 * Copyright (C) 2001-2011 encuestame: system online surveys Copyright (C) 2011
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */
package org.encuestame.test.business.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.apache.lucene.queryParser.ParseException;
import org.encuestame.core.search.GlobalSearchItem;
import org.encuestame.core.service.imp.SearchServiceOperations;
import org.encuestame.persistence.domain.Comment;
import org.encuestame.persistence.domain.question.Question;
import org.encuestame.persistence.domain.security.Account;
import org.encuestame.persistence.domain.security.UserAccount;
import org.encuestame.persistence.domain.tweetpoll.TweetPoll;
import org.encuestame.persistence.exception.EnMeNoResultsFoundException;
import org.encuestame.test.business.security.AbstractSpringSecurityContext;
import org.encuestame.utils.categories.test.DefaultTest;
import org.encuestame.utils.enums.TypeSearchResult;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Lucene Search service test case.
 * @author Picado, Juan juanATencuestame.org
 */
@Category(DefaultTest.class)
public class TestSearchService extends AbstractSpringSecurityContext {

    /**
     *
     */
    @Autowired
    private SearchServiceOperations searchServiceOperations;

    /*
     *
     */
    @Test
    public void testQuickService() throws IOException, EnMeNoResultsFoundException, ParseException{
        
    	final Account account = createAccount();
        final UserAccount userAccount = getSpringSecurityLoggedUserAccount();
        
        createHashTag("nicaragua");
        final Question question = createQuestion("Has scala great future as program language?", account);
        createQuestion("What is your favorite program language?", account);
		
        final TweetPoll tp = createTweetPoll(1234567L, true, true, true, true,
				null, null, new Date(), false, account, question, null);
        
        createComment("I dont have favorite programs", 30L, tp, null, null,
				userAccount, 25L, new Date());
        
        createComment("I dont have  favorite languages", 25L, tp, null, null,
				userAccount, 15L, new Date());
		 
        
        flushIndexes();
        
        List<TypeSearchResult> resultsAllowed = new ArrayList<TypeSearchResult>();
        resultsAllowed.add(TypeSearchResult.QUESTION);
        resultsAllowed.add(TypeSearchResult.ATTACHMENT);
        resultsAllowed.add(TypeSearchResult.HASHTAG);
        resultsAllowed.add(TypeSearchResult.TWEETPOLL);
        resultsAllowed.add(TypeSearchResult.COMMENT	);
        
	
       
        final Map<String, List<GlobalSearchItem>> d1 = this.searchServiceOperations.quickSearch("ni", "English", 0, 10, 10, resultsAllowed);
        final List<GlobalSearchItem> hashtag = d1.get("tags"); 
        Assert.assertEquals(hashtag.size(), 1);
        
        final Map<String, List<GlobalSearchItem>> d2 = this.searchServiceOperations.quickSearch("future", "English", 0, 10, 10, resultsAllowed);
        final List<GlobalSearchItem> questions = d2.get("questions"); 
        Assert.assertEquals(questions.size(), 1);
        //TODO: continue with  poll, profile, 
		
        
        final Map<String, List<GlobalSearchItem>> c1 = this.searchServiceOperations.quickSearch("favorite", "Spanish", 0, 10, 10, resultsAllowed);
        final List<GlobalSearchItem> comments = c1.get("comments"); 
        Assert.assertEquals(comments.size(), 2);
    }



}
