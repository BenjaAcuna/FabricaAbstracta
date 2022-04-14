package paquete;

import dao.ConexionMySQL;
import dao.ConexionPostgre;
import dao.IConexion;
import dao.PersonaDAO;
import dao.PersonaDAOImpl;

public class App {

	public static void main(String[] args) {
		IConexion cx1 = new ConexionMySQL("mitocode", "7482", "localhost");				
		
		IConexion cx2 = new ConexionPostgre("mitocode", "7482", "192.168.1.1");
		
		PersonaDAO dao = new PersonaDAOImpl();
		dao.setConexion(cx1);
		
		dao.listarTodos();
		
	}
}