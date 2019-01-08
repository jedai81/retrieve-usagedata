package com.garage.usagedata.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(datasvcdrctlyuseqntlist_pk.class)
@Table(name = "datasvcdrctlyuseqntlist")
public class Data_datasvcdrctlyuseqntlist implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "svccontid")
	private String svccontid;
	
	@Id
	@Column(name = "retvdt")
	private String retvdt;
	
	@Column(name = "prodefctstdate")
	private String prodefctstdate;
	
	@Column(name = "prodefctfnsdate")
	private String prodefctfnsdate;
	
	@Column(name = "prodid")
	private String prodid;
	
	@Column(name = "prodnm")
	private String prodnm;
	
	@Column(name = "ntnloutnetvctlkqnt")
	private String ntnloutnetvctlkqnt;
	
	@Column(name = "billmidctgcd")
	private String billmidctgcd;
	
	@Column(name = "billmidctgnm")
	private String billmidctgnm;
	
	@Column(name = "totuseqnt")
	private String totuseqnt;
	
	@Column(name = "nnratuseqnt")
	private String nnratuseqnt;
	
	@Column(name = "ratuseqnt")
	private String ratuseqnt;
	
	@Column(name = "ratamt")
	private String ratamt;
	
	@Column(name = "svctarif")
	private String svctarif;
	
	@Column(name = "bigidiv")
	private String bigidiv;
	
	protected Data_datasvcdrctlyuseqntlist() {
	}

	

	public String getSvccontid() {
		return svccontid;
	}



	public void setSvccontid(String svccontid) {
		this.svccontid = svccontid;
	}



	public String getRetvdt() {
		return retvdt;
	}



	public void setRetvdt(String retvdt) {
		this.retvdt = retvdt;
	}



	public String getProdefctstdate() {
		return prodefctstdate;
	}



	public void setProdefctstdate(String prodefctstdate) {
		this.prodefctstdate = prodefctstdate;
	}



	public String getProdefctfnsdate() {
		return prodefctfnsdate;
	}



	public void setProdefctfnsdate(String prodefctfnsdate) {
		this.prodefctfnsdate = prodefctfnsdate;
	}



	public String getProdid() {
		return prodid;
	}



	public void setProdid(String prodid) {
		this.prodid = prodid;
	}



	public String getProdnm() {
		return prodnm;
	}



	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}



	public String getNtnloutnetvctlkqnt() {
		return ntnloutnetvctlkqnt;
	}



	public void setNtnloutnetvctlkqnt(String ntnloutnetvctlkqnt) {
		this.ntnloutnetvctlkqnt = ntnloutnetvctlkqnt;
	}



	public String getBillmidctgcd() {
		return billmidctgcd;
	}



	public void setBillmidctgcd(String billmidctgcd) {
		this.billmidctgcd = billmidctgcd;
	}



	public String getBillmidctgnm() {
		return billmidctgnm;
	}



	public void setBillmidctgnm(String billmidctgnm) {
		this.billmidctgnm = billmidctgnm;
	}



	public String getTotuseqnt() {
		return totuseqnt;
	}



	public void setTotuseqnt(String totuseqnt) {
		this.totuseqnt = totuseqnt;
	}



	public String getNnratuseqnt() {
		return nnratuseqnt;
	}



	public void setNnratuseqnt(String nnratuseqnt) {
		this.nnratuseqnt = nnratuseqnt;
	}



	public String getRatuseqnt() {
		return ratuseqnt;
	}



	public void setRatuseqnt(String ratuseqnt) {
		this.ratuseqnt = ratuseqnt;
	}



	public String getRatamt() {
		return ratamt;
	}



	public void setRatamt(String ratamt) {
		this.ratamt = ratamt;
	}



	public String getSvctarif() {
		return svctarif;
	}



	public void setSvctarif(String svctarif) {
		this.svctarif = svctarif;
	}



	public String getBigidiv() {
		return bigidiv;
	}



	public void setBigidiv(String bigidiv) {
		this.bigidiv = bigidiv;
	}



}
