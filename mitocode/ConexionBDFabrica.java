package mitocode;

import Impl.ConexionOracle;
import Impl.ConexionPostgreSQL;
import Impl.ConexionSQLServer;
import Impl.ConexionVacia;
import Inter.FabricaAbstracta;
import Inter.IConexionBD;
import Inter.IConexionREST;
import Impl.ConexionMySQL;

public class ConexionBDFabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
