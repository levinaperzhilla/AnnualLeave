package controller;

import org.springframework.web.bind.annotation.RestController;

import entities.Raport;
import service.RaportServiceInterface;

@RestController
public class RaportController {
	
	final RaportServiceInterface raportService;

	public RaportController(RaportServiceInterface raportService) {
		this.raportService = raportService;
	}
	
	public Raport createRaport(Raport newRaport) {
		return raportService.createRaport(newRaport);
	}
	
	public void deleteRaport(int id) {
		raportService.deleteRaport(id);
	}
	
	public Raport findRaportById(int id) {
		return raportService.findRaportById(id);
	}
	

}
