package Practica_1;

public class Thread_ejercicio1 extends Thread { //EXTENDEMOS DE THREAD YA QUE QUEREMOS USAR HILOS
	
	public void run() { //USAMOS EL MÉTODO RUN DE LA CLASE THREAD
		
		int randomnum = (int) Math.floor(Math.random()*5+1); //EN LA VARIABLE RANDOMNUM METEMOS LA FUNCION RANDOM PARA QUE NOS GENERE NUMEROS ALEATORIOS ENTRE 0 Y 5
		
		System.out.println("Hola soy el hilo: " + getName() + " y me pongo a dormir " + randomnum + " segundos."); //CON LA FUNCION GETNAME COGEMOS EL ID DEL THREAD
		
		try {
			
			sleep(randomnum*1000); //PONEMOS A DORMIR EL HILO CON LOS NUMERO GENERADOS CON EL MATH RANDOM Y LO MULTIPLICAMOS POR 1000 YA QUE ESTA EN MILISEGUNDOS
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Soy el hilo: " + getName() + " y he terminado de dormir");
		
	}
	

}
