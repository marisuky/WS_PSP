package HilosPrimos;

import java.util.Date;

public class HiloThread extends Thread{

	boolean esPrimo=true;
	long miliSegundos;
	int n;
	public boolean EsPrimo() {
		return esPrimo;
	}
	public void setEsPrimo(boolean esPrimo) {
		this.esPrimo = esPrimo;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public long getMiliSegundos() {
		return miliSegundos;
	}
	public void setMiliSegundos(int miliSegundos) {
		this.miliSegundos = miliSegundos;
	}
	public HiloThread(int n) {
		super();
		this.n = n;
	}
	
	@Override
	public void run() {
		Date tiempoStart=new Date();
			int contador = 2;
		  while ((esPrimo) && (contador!=n)){
		    if (n % contador == 0)
		      esPrimo = false;
		    contador++;
		  }
		  if(esPrimo) {
			  System.out.println(+n+" es primo");
		  }else {
			  System.out.println(+n+" no es primo");
		  }
		  Date tiempoFin=new Date();
		  tiempoEjec(tiempoStart,tiempoFin);
		  System.out.println("El hilo "+Thread.currentThread().getName()+" se ha ejecutado en "+miliSegundos + "ms");
	}
	
	public void tiempoEjec(Date tiempoStart, Date tiempoFin) {
		long fin = tiempoFin.getTime();
		long ini = tiempoStart.getTime();
		miliSegundos=fin-ini;
	}


}
