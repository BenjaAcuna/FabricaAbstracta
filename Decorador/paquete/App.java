package paquete;

import decorador.BlindajeDecorador;
import interf.ICuentaBancaria;
import model.Cuenta;
import interf2.CuentaAhorro;

public class App {
    public static void main(String[]  args){
        Cuenta c = new Cuenta(1, "MitoCode");

        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }
}