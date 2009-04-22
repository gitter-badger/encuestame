package org.jp.core.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

/**
 * SecGroupPermission generated by hbm2java
 */
public class SecGroupPermission implements java.io.Serializable {

	private SecGroupPermissionId id;
	private SecPermission secPermission;
	private SecGroups secGroups;
	private Boolean state;

	public SecGroupPermission() {
	}

	public SecGroupPermission(SecGroupPermissionId id,
			SecPermission secPermission, SecGroups secGroups) {
		this.id = id;
		this.secPermission = secPermission;
		this.secGroups = secGroups;
	}

	public SecGroupPermission(SecGroupPermissionId id,
			SecPermission secPermission, SecGroups secGroups, Boolean state) {
		this.id = id;
		this.secPermission = secPermission;
		this.secGroups = secGroups;
		this.state = state;
	}

	public SecGroupPermissionId getId() {
		return this.id;
	}

	public void setId(SecGroupPermissionId id) {
		this.id = id;
	}

	public SecPermission getSecPermission() {
		return this.secPermission;
	}

	public void setSecPermission(SecPermission secPermission) {
		this.secPermission = secPermission;
	}

	public SecGroups getSecGroups() {
		return this.secGroups;
	}

	public void setSecGroups(SecGroups secGroups) {
		this.secGroups = secGroups;
	}

	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

}
