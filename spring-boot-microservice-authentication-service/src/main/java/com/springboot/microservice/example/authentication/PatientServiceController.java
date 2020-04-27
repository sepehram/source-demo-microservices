package com.springboot.microservice.example.authentication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientServiceController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PatientServiceProxy proxy;
	
	@GetMapping("/medical-history/id/{id}")
	public String retrievePatientByID(@PathVariable("id") Long id) {
		String resp = proxy.getPatientMedHistByID(id);
		logger.info("Response from patient-service: " + resp);
		return resp;
	}
	
	@GetMapping("/medical-history/name/{name}")
	public String retrievePatientByName(@PathVariable("name") String name) {
		String resp = proxy.getPatientMedHistByName(name);
		logger.info("Response from patient-service: " + resp);
		return resp;
	}
	
	@GetMapping("/medical-history/disease/{disease}")
	public String retrieveAllPatientsWithDisease(
			@PathVariable("disease") String disease) {
		String resp = proxy.getAllPatientsWithDisease(disease);
		logger.info("Response from patient-service: " + resp);
		return resp;
	}
	
	@GetMapping("/medical-history/patients")
	public String retrieveAllPatients() {
		String resp = proxy.getAllPatients();
		logger.info("Response from patient-service: " + resp);
		return resp;
	}
	
	

}
