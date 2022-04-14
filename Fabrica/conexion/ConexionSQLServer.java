package conexion;

import inter.IConexion;

public class ConexionSQLServer implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionSQLServer(){
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "root";
        this.contrasena = "123";
    }

    public void conectar(){
        //Aqui puede ir codigo JDBC
        System.out.println("Se conecto a SQLServer");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de SQLServer");
        
    }
}