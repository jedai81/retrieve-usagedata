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

import com.garage.usagedata.bean.Data_aplypplprodinfodto;
import com.garage.usagedata.repository.aplypplprodinfodtoRepository;

@RestController
@RequestMapping("/usage/aplypplprodinfodto")
public class aplypplprodinfodtoController {

	@Autowired
	aplypplprodinfodtoRepository repository;
	
	@GetMapping("/{svccontid}/{retvdt}")
	public ResponseEntity<Data_aplypplprodinfodto> getData(@PathVariable("svccontid") String svccontid) {
		
		Optional<Data_aplypplprodinfodto> data = repository.findById(svccontid);
		
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
	public Data_aplypplprodinfodto createData(@Valid @RequestBody Data_aplypplprodinfodto data) {
		System.out.println("Create Data : " + data.toString() + "...");

		return repository.save(data);
	}
	
	@PutMapping("/{svccontid}/{retvdt}")
	public ResponseEntity<Data_aplypplprodinfodto> updateData(@PathVariable("svccontid") String svccontid, @RequestBody Data_aplypplprodinfodto data) {
		System.out.println("Update Data with ID = " + svccontid + "...");

		Optional<Data_aplypplprodinfodto> findedData = repository.findById(svccontid);
		if (findedData.isPresent()) {
			Data_aplypplprodinfodto savedData = findedData.get();
			
			// TODO : 전달받은 data 값을 savedData에 대입하여 update 처리 필요 
//예,			savedData.setProdefctstdate(data.getProdefctstdate());
			
			Data_aplypplprodinfodto updatedData = repository.save(savedData);
			return new ResponseEntity<>(updatedData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{svccontid}/{retvdt}")
	public ResponseEntity<String> deleteData(@PathVariable("svccontid") String svccontid) {
		System.out.println("Delete Data with ID = " + svccontid + "...");

		try {
			repository.deleteById(svccontid);
		} catch (Exception e) {
			return new ResponseEntity<>("Fail to delete!", HttpStatus.EXPECTATION_FAILED);
		}

		return new ResponseEntity<>("Data has been deleted!", HttpStatus.OK);
	}
	
}
