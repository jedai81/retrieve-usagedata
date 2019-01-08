package com.garage.usagedata.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "custlogininfolistdto")
public class Data_custlogininfolistdto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "custid")
	private String custid;
	
	@Column(name = "nstpcustid")
	private String nstpcustid;
	
	@Column(name = "iciscustid")
	private String iciscustid;
	
	@Column(name = "itgcustclascd")
	private String itgcustclascd;
	
	@Column(name = "custptcltypecd")
	private String custptcltypecd;
	
	@Column(name = "custldfynotypec")
	private String custldfynotypec;
	
	@Column(name = "custldfyno")
	private String custldfyno;
	
	@Column(name = "custtypecd")
	private String custtypecd;
	
	protected Data_custlogininfolistdto() {
		
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getNstpcustid() {
		return nstpcustid;
	}

	public void setNstpcustid(String nstpcustid) {
		this.nstpcustid = nstpcustid;
	}

	public String getIciscustid() {
		return iciscustid;
	}

	public void setIciscustid(String iciscustid) {
		this.iciscustid = iciscustid;
	}

	public String getItgcustclascd() {
		return itgcustclascd;
	}

	public void setItgcustclascd(String itgcustclascd) {
		this.itgcustclascd = itgcustclascd;
	}

	public String getCustptcltypecd() {
		return custptcltypecd;
	}

	public void setCustptcltypecd(String custptcltypecd) {
		this.custptcltypecd = custptcltypecd;
	}

	public String getCustldfynotypec() {
		return custldfynotypec;
	}

	public void setCustldfynotypec(String custldfynotypec) {
		this.custldfynotypec = custldfynotypec;
	}

	public String getCustldfyno() {
		return custldfyno;
	}

	public void setCustldfyno(String custldfyno) {
		this.custldfyno = custldfyno;
	}

	public String getCusttypecd() {
		return custtypecd;
	}

	public void setCusttypecd(String custtypecd) {
		this.custtypecd = custtypecd;
	}	
	

}

