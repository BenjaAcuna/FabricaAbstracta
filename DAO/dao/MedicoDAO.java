package dao;

import model.Medico;

public interface MedicoDAO extends CRUD<Medico>{

	void curar();

}