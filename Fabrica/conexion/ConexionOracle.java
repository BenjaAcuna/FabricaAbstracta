package conexion;

import inter.IConexion;

public class ConexionOracle implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConexionOracle(){
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    public void conectar(){
        //Aqui puede ir codigo JDBC
        System.out.println("Se conecto a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de Oracle");
        
    }
}