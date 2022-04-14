package conexion;

import inter.IConexion;

public class ConexionVacia implements IConexion{
    
    public void conectar(){
        //Aqui puede ir codigo JDBC
        System.out.println("NO SE ESPECIFICO PROVEEDOR");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR");
        
    }
}