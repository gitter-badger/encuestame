package org.jp.core.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * QuestionColettion generated by hbm2java
 */
public class QuestionColettion implements java.io.Serializable {

	private Integer idQColection;
	private String desColeccion;
	private int uid;
	private Date fechaCreaccion;

	public QuestionColettion() {
	}

	public QuestionColettion(String desColeccion, int uid, Date fechaCreaccion) {
		this.desColeccion = desColeccion;
		this.uid = uid;
		this.fechaCreaccion = fechaCreaccion;
	}

	public Integer getIdQColection() {
		return this.idQColection;
	}

	public void setIdQColection(Integer idQColection) {
		this.idQColection = idQColection;
	}

	public String getDesColeccion() {
		return this.desColeccion;
	}

	public void setDesColeccion(String desColeccion) {
		this.desColeccion = desColeccion;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Date getFechaCreaccion() {
		return this.fechaCreaccion;
	}

	public void setFechaCreaccion(Date fechaCreaccion) {
		this.fechaCreaccion = fechaCreaccion;
	}

}
