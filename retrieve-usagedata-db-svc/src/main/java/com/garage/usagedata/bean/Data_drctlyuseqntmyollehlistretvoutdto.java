package com.garage.usagedata.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drctlyuseqntmyollehlistretvoutdto")
public class Data_drctlyuseqntmyollehlistretvoutdto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "unitsvcgroupcd")
	private String unitsvcgroupcd;
	
	@Column(name = "scrnlnd")
	private String scrnlnd;
	
	@Column(name = "cfwdfreeqnt")
	private String cfwdfreeqnt;
	
	@Column(name = "tmonfreeqnt")
	private String tmonfreeqnt;
	
	@Column(name = "totfreeqnt")
	private String totfreeqnt;
	
	@Column(name = "freeuseqnt")
	private String freeuseqnt;
	
	@Column(name = "typeind")
	private String typeind;
	
	@Column(name = "unitsvcgrouphnglnm")
	private String unitsvcgrouphnglnm;
	
	@Column(name = "lasttlktod")
	private String lasttlktod;
	
	protected Data_drctlyuseqntmyollehlistretvoutdto() {
		
	}

	public String getUnitsvcgroupcd() {
		return unitsvcgroupcd;
	}

	public void setUnitsvcgroupcd(String unitsvcgroupcd) {
		this.unitsvcgroupcd = unitsvcgroupcd;
	}

	public String getScrnlnd() {
		return scrnlnd;
	}

	public void setScrnlnd(String scrnlnd) {
		this.scrnlnd = scrnlnd;
	}

	public String getCfwdfreeqnt() {
		return cfwdfreeqnt;
	}

	public void setCfwdfreeqnt(String cfwdfreeqnt) {
		this.cfwdfreeqnt = cfwdfreeqnt;
	}

	public String getTmonfreeqnt() {
		return tmonfreeqnt;
	}

	public void setTmonfreeqnt(String tmonfreeqnt) {
		this.tmonfreeqnt = tmonfreeqnt;
	}

	public String getTotfreeqnt() {
		return totfreeqnt;
	}

	public void setTotfreeqnt(String totfreeqnt) {
		this.totfreeqnt = totfreeqnt;
	}

	public String getFreeuseqnt() {
		return freeuseqnt;
	}

	public void setFreeuseqnt(String freeuseqnt) {
		this.freeuseqnt = freeuseqnt;
	}

	public String getTypeind() {
		return typeind;
	}

	public void setTypeind(String typeind) {
		this.typeind = typeind;
	}

	public String getUnitsvcgrouphnglnm() {
		return unitsvcgrouphnglnm;
	}

	public void setUnitsvcgrouphnglnm(String unitsvcgrouphnglnm) {
		this.unitsvcgrouphnglnm = unitsvcgrouphnglnm;
	}

	public String getLasttlktod() {
		return lasttlktod;
	}

	public void setLasttlktod(String lasttlktod) {
		this.lasttlktod = lasttlktod;
	}	
}

