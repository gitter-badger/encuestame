package org.jp.core.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

/**
 * SurveyTime generated by hbm2java
 */
public class SurveyTime implements java.io.Serializable {

	private SurveyTimeId id;
	private int elapsedTime;
	private int quitflag;

	public SurveyTime() {
	}

	public SurveyTime(SurveyTimeId id, int elapsedTime, int quitflag) {
		this.id = id;
		this.elapsedTime = elapsedTime;
		this.quitflag = quitflag;
	}

	public SurveyTimeId getId() {
		return this.id;
	}

	public void setId(SurveyTimeId id) {
		this.id = id;
	}

	public int getElapsedTime() {
		return this.elapsedTime;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public int getQuitflag() {
		return this.quitflag;
	}

	public void setQuitflag(int quitflag) {
		this.quitflag = quitflag;
	}

}
