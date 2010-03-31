/*
 ************************************************************************************
 * Copyright (C) 2001-2009 encuestame: system online surveys Copyright (C) 2009
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */

package org.encuestame.core.persistence.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CatLocationType.
 *
 * @author Picado, Juan juan@encuestame.org
 * @since October 17, 2009
 * @version $Id$
 */
@Entity
@Table(name = "cat_location_type")
public class CatLocationType {

    private Long locationTypeId;
    private String locationTypeDescription;
    private Integer locationTypeLevel;

    /**
     * @return locationTypeId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loc_id_type", unique = true, nullable = false, length = 10)
    public Long getLocationTypeId() {
        return this.locationTypeId;
    }

    /**
     * @param locationTypeId locationTypeId
     */
    public void setLocationTypeId(Long locationTypeId) {
        this.locationTypeId = locationTypeId;
    }

    /**
     * @return locationTypeDescription
     */
    @Column(name = "description")
    public String getLocationTypeDescription() {
        return this.locationTypeDescription;
    }

    /**
     * @param locationTypeDescription locationTypeDescription
     */
    public void setLocationTypeDescription(String locationTypeDescription) {
        this.locationTypeDescription = locationTypeDescription;
    }

    /**
     * @return locationTypeLevel
     */
    @Column(name = "level")
    public Integer getLocationTypeLevel() {
        return this.locationTypeLevel;
    }

    /**
     * @param locationTypeLevel locationTypeLevel
     */
    public void setLocationTypeLevel(Integer locationTypeLevel) {
        this.locationTypeLevel = locationTypeLevel;
    }

}