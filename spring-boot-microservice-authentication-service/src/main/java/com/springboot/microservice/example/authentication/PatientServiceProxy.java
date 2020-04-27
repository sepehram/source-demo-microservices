package com.springboot.microservice.example.authentication;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "patient-service", url="localhost:8050")
public interface PatientServiceProxy {
	
	@GetMapping("/patient/id/{id}")
	public String getPatientMedHistByID(@PathVariable("id") Long id);
	
	@GetMapping("/patient/name/{name}")
	public String getPatientMedHistByName(@PathVariable("name") String name);
	
	@GetMapping("/disease/{disease}")
	public String getAllPatientsWithDisease(
			@PathVariable("disease") String disease);
	
	@GetMapping("/patient")
	public String getAllPatients();
}
