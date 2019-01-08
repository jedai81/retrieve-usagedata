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

import com.garage.usagedata.bean.Data_datasvcdrctlyuseqntlist;
import com.garage.usagedata.bean.datasvcdrctlyuseqntlist_pk;
import com.garage.usagedata.repository.datasvcdrctlyuseqntlistRepository;

@RestController
@RequestMapping("/usage/datasvcdrctlyuseqntlist")
public class datasvcdrctlyuseqntlistController {

	@Autowired
	datasvcdrctlyuseqntlistRepository repository;
	
	@GetMapping("/{svccontid}/{retvdt}")
	public ResponseEntity<Data_datasvcdrctlyuseqntlist> getData(@PathVariable("svccontid") String svccontid, @PathVariable("retvdt") String retvdt) {
		
		Optional<Data_datasvcdrctlyuseqntlist> data = repository.findById(new datasvcdrctlyuseqntlist_pk(svccontid, retvdt));
		
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
	public Data_datasvcdrctlyuseqntlist createData(@Valid @RequestBody Data_datasvcdrctlyuseqntlist data) {
		System.out.println("Create Data : " + data.toString() + "...");

		return repository.save(data);
	}
	
	@PutMapping("/{svccontid}/{retvdt}")
	public ResponseEntity<Data_datasvcdrctlyuseqntlist> updateData(@PathVariable("svccontid") String svccontid, @PathVariable("retvdt") String retvdt, @RequestBody Data_datasvcdrctlyuseqntlist data) {
		System.out.println("Update Data with ID = " + svccontid + ", " + retvdt + "...");

		Optional<Data_datasvcdrctlyuseqntlist> findedData = repository.findById(new datasvcdrctlyuseqntlist_pk(svccontid, retvdt));
		if (findedData.isPresent()) {
			Data_datasvcdrctlyuseqntlist savedData = findedData.get();
			
			savedData.setProdefctstdate(data.getProdefctstdate());
			savedData.setProdefctfnsdate(data.getProdefctfnsdate());
			savedData.setProdid(data.getProdid());
			savedData.setProdnm(data.getProdnm());
			savedData.setNtnloutnetvctlkqnt(data.getNtnloutnetvctlkqnt());
			savedData.setBillmidctgcd(data.getBillmidctgcd());
			savedData.setBillmidctgnm(data.getBillmidctgnm());
			savedData.setTotuseqnt(data.getTotuseqnt());
			savedData.setNnratuseqnt(data.getNnratuseqnt());
			savedData.setRatuseqnt(data.getRatuseqnt());
			savedData.setRatamt(data.getRatamt());
			savedData.setSvctarif(data.getSvctarif());
			savedData.setBigidiv(data.getBigidiv());			
			
			Data_datasvcdrctlyuseqntlist updatedData = repository.save(savedData);
			return new ResponseEntity<>(updatedData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{svccontid}/{retvdt}")
	public ResponseEntity<String> deleteData(@PathVariable("svccontid") String svccontid, @PathVariable("retvdt") String retvdt) {
		System.out.println("Delete Data with ID = " + svccontid + ", " + retvdt + "...");

		try {
			repository.deleteById(new datasvcdrctlyuseqntlist_pk(svccontid, retvdt));
		} catch (Exception e) {
			return new ResponseEntity<>("Fail to delete!", HttpStatus.EXPECTATION_FAILED);
		}

		return new ResponseEntity<>("Data has been deleted!", HttpStatus.OK);
	}
	
}
