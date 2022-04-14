package paquete;

import dao.CRUD;
import dao.PersonaDAOImpl;
import model.Persona;

public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("MitoCode");
		dao.registrar(per);
	}

}