package com.garage.usagedata.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(useptrn3monsretv_pk.class)
@Table(name = "useptrn3monsretv")
public class Data_useptrn3monsretv implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "svccontid")
	private String svccontid;
	
	@Id
	@Column(name = "retvym")
	private String retvym;
	
	@Column(name = "vctlktotqant")
	private String vctlktotqant;
	
	@Column(name = "ntnlvctlktotqnt")
	private String ntnlvctlktotqnt;
	
	@Column(name = "intlvctlktotqnt")
	private String intlvctlktotqnt;
	
	@Column(name = "ntnlinnetvctlkqnt")
	private String ntnlinnetvctlkqnt;
	
	@Column(name = "ntnloutnetvctlkqnt")
	private String ntnloutnetvctlkqnt;
	
	@Column(name = "datapacktqnt")
	private String datapacktqnt;
	
	@Column(name = "smsuseqnt")
	private String smsuseqnt;
	
	protected Data_useptrn3monsretv() {
	}

	public String getSvccontid() {
		return svccontid;
	}

	public void setSvccontid(String svccontid) {
		this.svccontid = svccontid;
	}

	public String getRetvym() {
		return retvym;
	}

	public void setRetvym(String retvym) {
		this.retvym = retvym;
	}

	public String getVctlktotqant() {
		return vctlktotqant;
	}

	public void setVctlktotqant(String vctlktotqant) {
		this.vctlktotqant = vctlktotqant;
	}

	public String getNtnlvctlktotqnt() {
		return ntnlvctlktotqnt;
	}

	public void setNtnlvctlktotqnt(String ntnlvctlktotqnt) {
		this.ntnlvctlktotqnt = ntnlvctlktotqnt;
	}

	public String getIntlvctlktotqnt() {
		return intlvctlktotqnt;
	}

	public void setIntlvctlktotqnt(String intlvctlktotqnt) {
		this.intlvctlktotqnt = intlvctlktotqnt;
	}

	public String getNtnlinnetvctlkqnt() {
		return ntnlinnetvctlkqnt;
	}

	public void setNtnlinnetvctlkqnt(String ntnlinnetvctlkqnt) {
		this.ntnlinnetvctlkqnt = ntnlinnetvctlkqnt;
	}

	public String getNtnloutnetvctlkqnt() {
		return ntnloutnetvctlkqnt;
	}

	public void setNtnloutnetvctlkqnt(String ntnloutnetvctlkqnt) {
		this.ntnloutnetvctlkqnt = ntnloutnetvctlkqnt;
	}

	public String getDatapacktqnt() {
		return datapacktqnt;
	}

	public void setDatapacktqnt(String datapacktqnt) {
		this.datapacktqnt = datapacktqnt;
	}

	public String getSmsuseqnt() {
		return smsuseqnt;
	}

	public void setSmsuseqnt(String smsuseqnt) {
		this.smsuseqnt = smsuseqnt;
	}

	
}
