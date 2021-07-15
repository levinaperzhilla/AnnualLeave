package service;

import org.springframework.stereotype.Service;

import entities.Raport;
import repository.RaportRepository;

@Service
public class RaportService implements RaportServiceInterface {
	
	final RaportRepository raport;
	
	public RaportService(RaportRepository raport) {
		this.raport = raport;
	}

	public Raport createRaport(Raport newRaport) {
		return raport.createRaport(newRaport);
	}
	
	public void deleteRaport(int id) {
		raport.deleteRaport(id);
	}
	
	public Raport findRaportById(int id) {
		return raport.findRaportById(id);
	}

}
