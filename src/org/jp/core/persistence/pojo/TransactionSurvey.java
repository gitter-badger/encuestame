package org.jp.core.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * TransactionSurvey generated by hbm2java
 */
public class TransactionSurvey implements java.io.Serializable {

	private Long id;
	private String session;
	private int uid;
	private String tranSql;
	private Date horaFecha;
	private String pagina;

	public TransactionSurvey() {
	}

	public TransactionSurvey(String session, int uid, String tranSql,
			Date horaFecha, String pagina) {
		this.session = session;
		this.uid = uid;
		this.tranSql = tranSql;
		this.horaFecha = horaFecha;
		this.pagina = pagina;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTranSql() {
		return this.tranSql;
	}

	public void setTranSql(String tranSql) {
		this.tranSql = tranSql;
	}

	public Date getHoraFecha() {
		return this.horaFecha;
	}

	public void setHoraFecha(Date horaFecha) {
		this.horaFecha = horaFecha;
	}

	public String getPagina() {
		return this.pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}
