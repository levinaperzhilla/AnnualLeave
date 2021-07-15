package repository;

import java.util.List;

import org.springframework.stereotype.Component;

import entities.Application;

@Component
public interface AppRepository {

	Application createApplication(Application newApplication);
	void deleteApplication(Application app);
	Application updateApplication(Application newApplication);
	List<Application> findAllApplications();
	Application findApplicationById(int number);

}