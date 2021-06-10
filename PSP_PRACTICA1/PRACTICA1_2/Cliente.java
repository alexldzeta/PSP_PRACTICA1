package PRACTICA1_2;

public class Cliente extends Thread { 
	
	private Cartera cartera; //INSTANCIAMOS LA CARTERA
	
	public Cliente(Cartera cartera) { //METEMOS UNA CARTERA EN EL CONSTRUCTOR DE CLIENTE PARA QUE NOS HAGA LAS OPERACIONES
		
		this.cartera = cartera; //LA IGUALAMOS A NUESTRA VARIABLE
		
	}
	
	public void run() {
		
		try {
		
		sleep(1000); //DORMIMOS 1 SEGUNDO POR OPERACION
		cartera.incrementar(); //USAMOS EL METODO INCREMENTAR DE LA CLASE CARTERA
		System.out.println(("El cliente ha añadido dinero a la cartera")); 
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	}
	

}
