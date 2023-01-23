package ejercicioDiapositivasHerencia.herenciaFormas;

import ejercicioDiapositivasHerencia.composicionFormas.Punto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo puntos
		Punto p1 = new Punto(9,9);
		Punto p2 = new Punto(5,5);
		Punto p3 = new Punto(8,2);
		
		//Genero objetos con sus distintos constructores
		Cuadrado cuadrado1 = new Cuadrado(5, 0, 1);
		Circulo circulo1 = new Circulo(7, 2, 3);
		Triangulo triangulo1 = new Triangulo(14, 10, 4, 4);
		Cuadrado cuadrado2 = new Cuadrado(5, p1);
		Circulo circulo2 = new Circulo(7, p2);
		Triangulo triangulo2 = new Triangulo(14, 10, p3);
		
		//Muestro el objetivo inicial del ejercicio Formas
		System.out.println(cuadrado1.dibujar());
		System.out.println("El area del cuadrado es " + cuadrado1.calcularArea() + " cm cuadrados");
		System.out.println(circulo1.dibujar());
		System.out.println("El area del circulo es " + circulo1.calcularArea() + " cm cuadrados");
		System.out.println(triangulo1.dibujar());
		System.out.println("El area del triangulo es " + triangulo1.calcularArea() + " cm cuadrados");
		
		//Muestro las coordenadas de cada objeto
		cuadrado1.mostrarPuntoOrigen();
		circulo1.mostrarPuntoOrigen();
		triangulo1.mostrarPuntoOrigen();
		
		cuadrado2.mostrarPuntoOrigen();
		circulo2.mostrarPuntoOrigen();
		triangulo2.mostrarPuntoOrigen();
	}

}
