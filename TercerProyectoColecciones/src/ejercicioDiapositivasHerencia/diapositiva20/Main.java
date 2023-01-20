package ejercicioDiapositivasHerencia.diapositiva20;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado = new Cuadrado(5);
		Circulo circulo = new Circulo(7);
		Triangulo triangulo = new Triangulo(14, 10);
		
		System.out.println(cuadrado.dibujar());
		System.out.println("El area del cuadrado es " + cuadrado.calcularArea() + " cm cuadrados");
		System.out.println(circulo.dibujar());
		System.out.println("El area del circulo es " + circulo.calcularArea() + " cm cuadrados");
		System.out.println(triangulo.dibujar());
		System.out.println("El area del triangulo es " + triangulo.calcularArea() + " cm cuadrados");
	}

}
