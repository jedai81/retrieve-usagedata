package com.garage.usagedata.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.usagedata.bean.UsageData;
import com.garage.usagedata.repository.UsageDataRedisRepository;

@RestController
@RequestMapping("/usage")
public class UsageDataController {
	
	@Autowired
	UsageDataRedisRepository usageDataRedisRepository;

	
	@GetMapping("/mobile/{svcNo}")
	public ResponseEntity<UsageData> getMobileUsageData(@PathVariable("svcNo") String svcNo) {

		Optional<UsageData> usageData = usageDataRedisRepository.findById(svcNo);
		
		// cache에 있는 경우
		if (usageData.isPresent()) {
			return new ResponseEntity<>(usageData.get(), HttpStatus.OK);
		} 
		// cache에 없는 경우. 
		else {
			// TODO DB 조회 서비스 호출로 기능 변경 필요. 현재는 그냥 자료 없음 처리
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
