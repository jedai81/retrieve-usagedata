package com.garage.usagedata.bean;

import java.io.Serializable;

public class useptrn3monsretv_pk implements Serializable {

	private static final long serialVersionUID = 1L;

	private String svccontid;
	
	private String retvym;
	
	public useptrn3monsretv_pk() {
		
	}
	
	public useptrn3monsretv_pk(String svccontid, String retvym) {
		this.svccontid = svccontid;
		this.retvym = retvym;
	}
	
}
