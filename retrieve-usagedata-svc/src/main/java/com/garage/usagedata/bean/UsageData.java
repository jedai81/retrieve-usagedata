package com.garage.usagedata.bean;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@RedisHash("usagedata")
public class UsageData {

	@Id
    private String svcNo;
    private String usageData;
    private LocalDateTime refreshTime;

    public UsageData(String svcNo, String usageData, LocalDateTime refreshTime) {
        this.svcNo = svcNo;
        this.usageData = usageData;
        this.refreshTime = refreshTime;
    }

    public void refresh(String usageData, LocalDateTime refreshTime){
        if(refreshTime.isAfter(this.refreshTime)){ // 저장된 데이터보다 최신 데이터일 경우
        	this.usageData = usageData;
            this.refreshTime = refreshTime;
        }
    }

	public String getSvcNo() {
		return svcNo;
	}

	public String getUsageData() {
		return usageData;
	}

	public LocalDateTime getRefreshTime() {
		return refreshTime;
	}  
    
    @Override
    public String toString() {
    	return "svcNo:" + svcNo + ", usageData:" + usageData + ", refreshTime:" + refreshTime.toString();
    }
    
}
