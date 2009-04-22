package org.jp.core.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * SurveyType generated by hbm2java
 */
public class SurveyType implements java.io.Serializable {

	private Integer stid;
	private int version;
	private String description;
	private String labelGraphic;
	private Date date;
	private String template;
	private String redirectPage;
	private Integer numberCopy;
	private int idState;
	private String hash;
	private String public_;

	public SurveyType() {
	}

	public SurveyType(int idState, String public_) {
		this.idState = idState;
		this.public_ = public_;
	}

	public SurveyType(String description, String labelGraphic, Date date,
			String template, String redirectPage, Integer numberCopy,
			int idState, String hash, String public_) {
		this.description = description;
		this.labelGraphic = labelGraphic;
		this.date = date;
		this.template = template;
		this.redirectPage = redirectPage;
		this.numberCopy = numberCopy;
		this.idState = idState;
		this.hash = hash;
		this.public_ = public_;
	}

	public Integer getStid() {
		return this.stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabelGraphic() {
		return this.labelGraphic;
	}

	public void setLabelGraphic(String labelGraphic) {
		this.labelGraphic = labelGraphic;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getRedirectPage() {
		return this.redirectPage;
	}

	public void setRedirectPage(String redirectPage) {
		this.redirectPage = redirectPage;
	}

	public Integer getNumberCopy() {
		return this.numberCopy;
	}

	public void setNumberCopy(Integer numberCopy) {
		this.numberCopy = numberCopy;
	}

	public int getIdState() {
		return this.idState;
	}

	public void setIdState(int idState) {
		this.idState = idState;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPublic_() {
		return this.public_;
	}

	public void setPublic_(String public_) {
		this.public_ = public_;
	}

}
