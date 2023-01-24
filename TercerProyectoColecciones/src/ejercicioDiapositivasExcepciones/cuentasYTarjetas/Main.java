package ejercicioDiapositivasExcepciones.cuentasYTarjetas;

import java.time.LocalDate;

import clasesExcepciones.FechaInvalidaException;
import clasesExcepciones.LongitudStringInvalidaException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Creo objetos
			Cuenta cuenta1 = new Cuenta("IBAN-0000-1111-2222-3333", "Helena Martinez Duro");
			Credito credito1 = new Credito(LocalDate.of(2026, 11, 23), "ES001122334455", "Helena Martinez Duro");
			Debito debito1 = new Debito(LocalDate.of(2028, 10, 30), "ES998877665544", "Helena Martinez Duro");
			
			System.out.println("Estado inicial --------------------------------------");
			//Asocio cuentas para poder funcionar y muestro por consola
			credito1.setmCuentaAsociada(cuenta1);
			debito1.setmCuentaAsociada(cuenta1);
			System.out.println(cuenta1.toString());
			System.out.println(credito1.toString());
			System.out.println(debito1.toString());
			
			//Meto dinero en ambos que necesitan un limite
			credito1.setmCredito(10000);
			cuenta1.ingresar("Ahorros de mi vida", 25000);
			
			System.out.println("Estado tras cargar dinero --------------------------------------");
			System.out.println(cuenta1.toString());
			System.out.println(credito1.toString());
			System.out.println(debito1.toString());
			
			cuenta1.ingresar("Nomina Enero", 1170.36);
			cuenta1.retirar("Pago impuesto SS", 400);
			
			System.out.println("Cuenta tras operar --------------------------------------");
			System.out.println(cuenta1.toString());
			
			debito1.ingresar(50.75);
			debito1.retirar(1500);
			debito1.pagoEnEstablecimiento("Compra de pantalones", 15.99);
			
			System.out.println("Debito tras operar --------------------------------------");
			System.out.println(debito1.toString());
			
			credito1.ingresar(1000);
			credito1.ingresar(566);
			credito1.ingresar(90.99);
			credito1.retirar(5000);
			credito1.pagoEnEstablecimiento("Entrada coche", 4500);
			credito1.retirar(10000); 
			//credito1.retirar(1000);//-- Esto da excepcion ya que superamos el limite de credito
			
			System.out.println("Credito tras operar --------------------------------------");
			System.out.println(credito1.toString());
			
			credito1.liquidar(1, 2023);
			
			System.out.println("Estado de todo tras liquidar credito --------------------------------------");
			System.out.println(cuenta1.toString());
			System.out.println(credito1.toString());
			System.out.println(debito1.toString());
			
		} catch (NullPointerException npe) {
			System.err.println(npe.getMessage());
		} catch (LongitudStringInvalidaException lsie) {
			System.err.println(lsie.getMessage());
		} catch (FechaInvalidaException fie) {
			System.err.println(fie.getMessage());
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error inesperado:");
			e.printStackTrace();
		}
	}

}
