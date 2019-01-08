package com.garage.usagedata.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.usagedata.bean.Data_useptrn3monsretv;
import com.garage.usagedata.bean.useptrn3monsretv_pk;
import com.garage.usagedata.repository.useptrn3monsretvRepository;

@RestController
@RequestMapping("/usage/useptrn3monsretv")
public class useptrn3monsretvController {

	@Autowired
	useptrn3monsretvRepository repository;
	
	@GetMapping("/{svccontid}/{retvym}")
	public ResponseEntity<Data_useptrn3monsretv> getData(@PathVariable("svccontid") String svccontid, @PathVariable("retvym") String retvym) {
		
		Optional<Data_useptrn3monsretv> data = repository.findById(new useptrn3monsretv_pk(svccontid, retvym));
		
		// db에 있는 경우
		if (data.isPresent()) {
			return new ResponseEntity<>(data.get(), HttpStatus.OK);
		} 
		// db에 없는 경우. 
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/create")
	public Data_useptrn3monsretv createData(@Valid @RequestBody Data_useptrn3monsretv data) {
		System.out.println("Create Data : " + data.toString() + "...");

		return repository.save(data);
	}
	
	@PutMapping("/{svccontid}/{retvym}")
	public ResponseEntity<Data_useptrn3monsretv> updateData(@PathVariable("svccontid") String svccontid, @PathVariable("retvym") String retvym, @RequestBody Data_useptrn3monsretv data) {
		System.out.println("Update Data with ID = " + svccontid + ", " + retvym + "...");

		Optional<Data_useptrn3monsretv> findedData = repository.findById(new useptrn3monsretv_pk(svccontid, retvym));
		if (findedData.isPresent()) {
			Data_useptrn3monsretv savedData = findedData.get();
			
			savedData.setVctlktotqant(data.getVctlktotqant());
			savedData.setNtnlvctlktotqnt(data.getNtnlvctlktotqnt());
			savedData.setIntlvctlktotqnt(data.getIntlvctlktotqnt());
			savedData.setNtnlinnetvctlkqnt(data.getNtnlinnetvctlkqnt());
			savedData.setNtnloutnetvctlkqnt(data.getNtnloutnetvctlkqnt());
			savedData.setDatapacktqnt(data.getDatapacktqnt());
			savedData.setSmsuseqnt(data.getSmsuseqnt());			
			
			Data_useptrn3monsretv updatedData = repository.save(savedData);
			return new ResponseEntity<>(updatedData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{svccontid}/{retvym}")
	public ResponseEntity<String> deleteData(@PathVariable("svccontid") String svccontid, @PathVariable("retvym") String retvym) {
		System.out.println("Delete Data with ID = " + svccontid + ", " + retvym + "...");

		try {
			repository.deleteById(new useptrn3monsretv_pk(svccontid, retvym));
		} catch (Exception e) {
			return new ResponseEntity<>("Fail to delete!", HttpStatus.EXPECTATION_FAILED);
		}

		return new ResponseEntity<>("Data has been deleted!", HttpStatus.OK);
	}
	
}
