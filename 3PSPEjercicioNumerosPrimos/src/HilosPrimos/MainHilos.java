package HilosPrimos;

import java.util.Scanner;

public class MainHilos {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el primer numero");
	int num1 = Integer.parseInt(sc.nextLine());
	System.out.println("Introduce el segundo numero");
	int num2 = Integer.parseInt(sc.nextLine());
	System.out.println("Introduce el tercer numero");
	int num3 = Integer.parseInt(sc.nextLine());
	
	HiloThread hilo1 = new HiloThread(num1);
	HiloThread hilo2 = new HiloThread(num2);
	HiloThread hilo3 = new HiloThread(num3);
	
	hilo1.start();
	hilo2.start();
	hilo3.start();
	
	}

}
