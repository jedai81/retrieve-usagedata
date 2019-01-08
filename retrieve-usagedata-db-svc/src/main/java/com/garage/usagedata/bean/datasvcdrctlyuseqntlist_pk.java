package com.garage.usagedata.bean;

import java.io.Serializable;

public class datasvcdrctlyuseqntlist_pk implements Serializable {

	private static final long serialVersionUID = 1L;

	private String svccontid;
	
	private String retvdt;
	
	public datasvcdrctlyuseqntlist_pk() {
		
	}
	
	public datasvcdrctlyuseqntlist_pk(String svccontid, String retvdt) {
		this.svccontid = svccontid;
		this.retvdt = retvdt;
	}
	
}
