package PRACTICA1_2;

public class Worker extends Thread { //LO MISMO QUE CON LA CLASE CLIENTE PERO AQUI USAMOS EL METODO DECREMENTAR
	
	private Cartera cartera;
	
	public Worker(Cartera cartera) {
		
		this.cartera = cartera;
		
	}
	
	public void run() {
		
		try {
			
			sleep(1000);
			cartera.decrementar();
			System.out.println("El Worker ha decrementado dinero de la cartera ");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
