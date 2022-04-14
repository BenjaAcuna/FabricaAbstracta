package interf2;


import interf.ICuentaBancaria;
import model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {
    
    public void abrirCuenta(Cuenta c){
        System.out.println("=====================================");
        System.out.println("Se abrio una cuenta Corriente");
        System.out.println("Cliente: " + c.getCliente());
    }
}