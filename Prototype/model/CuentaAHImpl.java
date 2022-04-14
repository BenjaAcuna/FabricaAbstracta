package model;

import inter.ICuenta;

public class CuentaAHImpl implements ICuenta{
    
    private String tipo;
    private double monto;

    public CuentaAHImpl(){
        tipo = "AHORRO";
    }

    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;

        try{
            cuenta = (CuentaAHImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuenta;
    }

    public String toString(){
        return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}