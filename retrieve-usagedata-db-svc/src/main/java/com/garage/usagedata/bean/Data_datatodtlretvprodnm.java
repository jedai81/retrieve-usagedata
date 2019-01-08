package com.garage.usagedata.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datatodtlretvprodnm")
public class Data_datatodtlretvprodnm implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "svccd")
	private String svccd;
	
	@Column(name = "prodnm")
	private String prodnm;
	
	@Column(name = "prodseq")
	private String prodseq;
	
	@Column(name = "efctstdate")
	private String efctstdate;
	
	@Column(name = "efctfnsdate")
	private String efctfnsdate;
	
	@Column(name = "tmonprvqnt")
	private String tmonprvqnt;
	
	@Column(name = "cfwdprvqnt")
	private String cfwdprvqnt;
	
	@Column(name = "useqnt")
	private String useqnt;
	
	protected Data_datatodtlretvprodnm() {
		
	}

	public String getSvccd() {
		return svccd;
	}

	public void setSvccd(String svccd) {
		this.svccd = svccd;
	}

	public String getProdnm() {
		return prodnm;
	}

	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}

	public String getProdseq() {
		return prodseq;
	}

	public void setProdseq(String prodseq) {
		this.prodseq = prodseq;
	}

	public String getEfctstdate() {
		return efctstdate;
	}

	public void setEfctstdate(String efctstdate) {
		this.efctstdate = efctstdate;
	}

	public String getEfctfnsdate() {
		return efctfnsdate;
	}

	public void setEfctfnsdate(String efctfnsdate) {
		this.efctfnsdate = efctfnsdate;
	}

	public String getTmonprvqnt() {
		return tmonprvqnt;
	}

	public void setTmonprvqnt(String tmonprvqnt) {
		this.tmonprvqnt = tmonprvqnt;
	}

	public String getCfwdprvqnt() {
		return cfwdprvqnt;
	}

	public void setCfwdprvqnt(String cfwdprvqnt) {
		this.cfwdprvqnt = cfwdprvqnt;
	}

	public String getUseqnt() {
		return useqnt;
	}

	public void setUseqnt(String useqnt) {
		this.useqnt = useqnt;
	}	
}

