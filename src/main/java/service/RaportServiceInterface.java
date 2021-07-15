package service;

import org.springframework.stereotype.Component;

import entities.Raport;

@Component
public interface RaportServiceInterface {

	Raport createRaport(Raport newRaport);
	void deleteRaport(int id);
	Raport findRaportById(int id);

}