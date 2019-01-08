package com.garage.usagedata.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aplypplprodinfodto")
public class Data_aplypplprodinfodto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "svccontid")
	private String svccontid;
	
	@Column(name = "trmnposblyn")
	private String trmnposblyn;
	
	@Column(name = "prodid")
	private String prodid;
	
	@Column(name = "prodnm")
	private String prodnm;
	
	@Column(name = "prodtypecd")
	private String prodtypecd;
	
	@Column(name = "prodindcchage")
	private String prodindcchage;
	
	@Column(name = "adtninfocnt")
	private String adtninfocnt;
	
	@Column(name = "adtnwrkjobcnt")
	private String adtnwrkjobcnt;
	
	@Column(name = "mlgaplytypecd")
	private String mlgaplytypecd;
	
	@Column(name = "efctstdt")
	private String efctstdt;
	
	@Column(name = "efctfnsdt")
	private String efctfnsdt;
	
	@Column(name = "bndlprodcomposiyn")
	private String bndlprodcomposiyn;
	
	@Column(name = "prodtmdftgyn")
	private String prodtmdftgyn;
	
	@Column(name = "prodhstseq")
	private String prodhstseq;
	
	@Column(name = "odercmpityn")
	private String odercmpityn;
	
	@Column(name = "prodsbscaftchgposbldate")
	private String prodsbscaftchgposbldate;
	
	@Column(name = "asignnomaxcascnt")
	private String asignnomaxcascnt;
	
	@Column(name = "famttariflmpsmeth")
	private String famttariflmpsmeth;
	
	@Column(name = "prodsbsctrmncd")
	private String prodsbsctrmncd;
	
	protected Data_aplypplprodinfodto() {
		
	}

	public String getSvccontid() {
		return svccontid;
	}

	public void setSvccontid(String svccontid) {
		this.svccontid = svccontid;
	}

	public String getTrmnposblyn() {
		return trmnposblyn;
	}

	public void setTrmnposblyn(String trmnposblyn) {
		this.trmnposblyn = trmnposblyn;
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

	public String getProdtypecd() {
		return prodtypecd;
	}

	public void setProdtypecd(String prodtypecd) {
		this.prodtypecd = prodtypecd;
	}

	public String getProdindcchage() {
		return prodindcchage;
	}

	public void setProdindcchage(String prodindcchage) {
		this.prodindcchage = prodindcchage;
	}

	public String getAdtninfocnt() {
		return adtninfocnt;
	}

	public void setAdtninfocnt(String adtninfocnt) {
		this.adtninfocnt = adtninfocnt;
	}

	public String getAdtnwrkjobcnt() {
		return adtnwrkjobcnt;
	}

	public void setAdtnwrkjobcnt(String adtnwrkjobcnt) {
		this.adtnwrkjobcnt = adtnwrkjobcnt;
	}

	public String getMlgaplytypecd() {
		return mlgaplytypecd;
	}

	public void setMlgaplytypecd(String mlgaplytypecd) {
		this.mlgaplytypecd = mlgaplytypecd;
	}

	public String getEfctstdt() {
		return efctstdt;
	}

	public void setEfctstdt(String efctstdt) {
		this.efctstdt = efctstdt;
	}

	public String getEfctfnsdt() {
		return efctfnsdt;
	}

	public void setEfctfnsdt(String efctfnsdt) {
		this.efctfnsdt = efctfnsdt;
	}

	public String getBndlprodcomposiyn() {
		return bndlprodcomposiyn;
	}

	public void setBndlprodcomposiyn(String bndlprodcomposiyn) {
		this.bndlprodcomposiyn = bndlprodcomposiyn;
	}

	public String getProdtmdftgyn() {
		return prodtmdftgyn;
	}

	public void setProdtmdftgyn(String prodtmdftgyn) {
		this.prodtmdftgyn = prodtmdftgyn;
	}

	public String getProdhstseq() {
		return prodhstseq;
	}

	public void setProdhstseq(String prodhstseq) {
		this.prodhstseq = prodhstseq;
	}

	public String getOdercmpityn() {
		return odercmpityn;
	}

	public void setOdercmpityn(String odercmpityn) {
		this.odercmpityn = odercmpityn;
	}

	public String getProdsbscaftchgposbldate() {
		return prodsbscaftchgposbldate;
	}

	public void setProdsbscaftchgposbldate(String prodsbscaftchgposbldate) {
		this.prodsbscaftchgposbldate = prodsbscaftchgposbldate;
	}

	public String getAsignnomaxcascnt() {
		return asignnomaxcascnt;
	}

	public void setAsignnomaxcascnt(String asignnomaxcascnt) {
		this.asignnomaxcascnt = asignnomaxcascnt;
	}

	public String getFamttariflmpsmeth() {
		return famttariflmpsmeth;
	}

	public void setFamttariflmpsmeth(String famttariflmpsmeth) {
		this.famttariflmpsmeth = famttariflmpsmeth;
	}

	public String getProdsbsctrmncd() {
		return prodsbsctrmncd;
	}

	public void setProdsbsctrmncd(String prodsbsctrmncd) {
		this.prodsbsctrmncd = prodsbsctrmncd;
	}
	
	

}

