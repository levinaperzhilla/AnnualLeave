package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entities.Application;
import repository.AppRepository;

@Service
public class ApplicationService implements AppService {
	
	final AppRepository appRepository;
	
	public ApplicationService(AppRepository appRepository) {
		this.appRepository = appRepository;
	}

	public Application createApplication(Application newApplication) {//just like adding a new app
		return appRepository.createApplication(newApplication);
	}
	
	public void deleteApplication(Application app) {
		appRepository.deleteApplication(app);
	}
	
	public Application updateApplication(Application newApplication) {
		return appRepository.updateApplication(newApplication);
	}
	
	public List<Application> findAllApplications(){
		return appRepository.findAllApplications();
	}
	
	public Application findApplicationById(int number) {
		return appRepository.findApplicationById(number);
	}
}
