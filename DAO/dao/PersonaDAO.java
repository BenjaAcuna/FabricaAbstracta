package dao;

import model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

	void mostrarNombre();
	
}