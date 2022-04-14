package paquete;

import strategy.AntivirusAvanzado;
import strategy.Contexto;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}

}