package conexion;

import inter.IConexion;

public class ConexionPostgreSQL implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionPostgreSQL(){
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    public void conectar(){
        //Aqui puede ir codigo JDBC
        System.out.println("Se conecto a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de PostgreSQL");
        
    }
}

