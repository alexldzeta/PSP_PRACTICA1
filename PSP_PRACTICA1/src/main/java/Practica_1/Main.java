package Practica_1;


public class Main {

	public static void main(String[] args) {
		
		Thread_ejercicio1 T1; //INSTANCIAMOS LA CLASE THREAD
		
		for(int z = 0; z < 100; z++) { //HACEMOS UN FOR PARA QUE CREE 100 HILOS
			
			T1 = new Thread_ejercicio1(); //CREAMOS UN NUEVO HILO DE LA CLASE THREADEJERCICIO1
			T1.start(); //Y LO INICIAMOS CON EL START CORRESPONDIENTE AL RUN
		}

	}

}
