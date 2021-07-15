package repository;

import entities.Raport;

public interface RaportRepositoryInterface {

	Raport createRaport(Raport newRaport);
	void deleteRaport(int id);
	Raport findRaportById(int id);

}