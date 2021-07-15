package controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Application;
import service.AppService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="/api/v1")
public class ApplicationController {
	final AppService appService;

	public ApplicationController(AppService appService) {
		this.appService = appService;
	}
	
	@PostMapping(path="/addApplication")
	public ResponseEntity<Application> createApplication(@RequestBody Application newApplication) {//just like adding a new app
		appService.createApplication(newApplication);
		return new ResponseEntity<Application>(newApplication,HttpStatus.OK);
	}
	
	@DeleteMapping(path="deleteApplication/{number}")
	public ResponseEntity<Application> deleteApplication(@PathVariable int number) {
		Application app=appService.findApplicationById(number);
		appService.deleteApplication(app);
		return new ResponseEntity<Application>(app,HttpStatus.OK);
	}
	
	@PutMapping(path="/updateApplication")
	public ResponseEntity<Application> updateApplication(@RequestBody Application newApplication) {
		appService.updateApplication(newApplication);
		return new ResponseEntity<Application>(newApplication,HttpStatus.OK);
	}
	
	@GetMapping(path="/findAll")
	public ResponseEntity<List<Application>> findAllApplications(){
		List<Application> apps=appService.findAllApplications();
		return new ResponseEntity<List<Application>>(apps,HttpStatus.OK);
	}
	
	@GetMapping(path="findById/{number}")
	public ResponseEntity<Application> findApplicationById(@PathVariable int number) {
		Application app=appService.findApplicationById(number);
		return new ResponseEntity<Application>(app,HttpStatus.OK);
	}
	
}
