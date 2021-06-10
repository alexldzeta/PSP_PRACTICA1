package PRACTICA1_2;

public class Cartera extends Thread {

	private float dinero = 0; //CREMAOS LA VARIABLE DINERO PARA QUE COMIENCE CON 0€ Y VAYA SUMANDO

	// ---------------- getters y setters SUS RESPECTIVOS GETTER Y SETTER PARA SABER POSTERIORMENTE EL DINERO

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	public Cartera(float dinero) { //POR EL CONSTRUCTOR DE CARTERA EN EL MAIN LE PASAMOS UN DINERO INICIAL

		super();
		this.dinero = dinero;

	}

	public void incrementar() { //METODO DE INCREMENTAR DINERO EN LA CARTERA

		dinero += (float) Math.floor(Math.random() * 100); //CON EL MATH RANDOM SUMAMOS NUMEROS ALEATORIOS ENTRE 0 Y 100

		try {
			sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Ha incrementado el dinero");

	}

	public void decrementar() { //LO MISMO QUE EL ANTERIOR PERO RESTADOLE EL DINERO

		dinero -= (float) Math.floor(Math.random() * 50); //EN ESTE CASO POR 50 PARA QUE HAYA MENOS POSIBILIDADES DE QUEDARTE EN NEGATIVO

		try {
			sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Ha decrementado el dinero");

	}

}
