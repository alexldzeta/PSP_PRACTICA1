package PRACTICA1_2;

public class Main {

	public static void main(String[] args) {
		
		Cartera cartera = new Cartera(0); //CREAMOS UNA NUEVA CARTERA CON 0 DE DINERO
		
		for (int z = 0; z < 10; z++) { //UN BUCLE FOR PARA QUE HAGA 10 OPERACIONES
			
			new Cliente(cartera).start();
			
			new Worker(cartera).start();
			
		}

		try {
			cartera.sleep(10000); //DORMIMOS EL HILO 10 SEGUNDOS PARA QUE NOS DIGA EL RESULTADO TOTAL
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Cantidad de dinero actual en la cartera es: " + cartera.getDinero() + "€"); //MOSTRAMOS EL DINERO TOTAL DE LA CARTERA DESPUES DE LAS OPERACIONES
		
	}

}
