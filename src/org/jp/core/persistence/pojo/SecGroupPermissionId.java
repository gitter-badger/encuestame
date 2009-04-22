package org.jp.core.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

/**
 * SecGroupPermissionId generated by hbm2java
 */
public class SecGroupPermissionId implements java.io.Serializable {

	private int idPermission;
	private int groupId;

	public SecGroupPermissionId() {
	}

	public SecGroupPermissionId(int idPermission, int groupId) {
		this.idPermission = idPermission;
		this.groupId = groupId;
	}

	public int getIdPermission() {
		return this.idPermission;
	}

	public void setIdPermission(int idPermission) {
		this.idPermission = idPermission;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SecGroupPermissionId))
			return false;
		SecGroupPermissionId castOther = (SecGroupPermissionId) other;

		return (this.getIdPermission() == castOther.getIdPermission())
				&& (this.getGroupId() == castOther.getGroupId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPermission();
		result = 37 * result + this.getGroupId();
		return result;
	}

}
