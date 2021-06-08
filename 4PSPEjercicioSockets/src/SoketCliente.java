import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SoketCliente {

	public static final int SUMAR = 1;
	public static final int RESTAR = 2;
	public static final int MULTIPLICAR = 3;
	public static final int DIVIDIR = 4;

	static Scanner sc = new Scanner(System.in);
	public static int opcion;

	public static int mostrarMenu() {
		System.out.println("SELECCIONA LA OPERACIÓN A REALIZAR");
		System.out.println(SUMAR + " SUMAR");
		System.out.println(RESTAR + " RESTAR");
		System.out.println(MULTIPLICAR + " MULTIPLICAR");
		System.out.println(DIVIDIR + " DIVIDIR");

		opcion = Integer.parseInt(sc.nextLine());
		return opcion;
	}

	public static void main(String[] args) {

		final int PUERTO = 2021;
		final String ip = "localhost";

		System.out.println("------------Aplicacion Cliente------------");
		System.out.println("------------------------------------------");

		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;

		InetSocketAddress direccion = new InetSocketAddress(ip, PUERTO);
		Scanner sc = new Scanner(System.in);

		try {
			boolean continuar = true;
			do {

				socketCliente = new Socket();
				socketCliente.connect(direccion);

				System.out.println("Conexion establecida... a " + ip + " por el puerto " + PUERTO);
				opcion = mostrarMenu();
				
				entrada = new InputStreamReader(socketCliente.getInputStream());
				// lo que se envia al servidor
				salida = new PrintStream(socketCliente.getOutputStream());
				// lo que devuelve el servidor

				System.out.println("ELIGE EL PRIMER NÚMERO");

				String numero1 = sc.nextLine();
				System.out.println("ELIGE EL SEGUNDO NÚMERO");

				String numero2 = sc.nextLine();
				String eleccion = "";
				switch (opcion) {
				case 1: {
					eleccion = "SUMA";
					break;
				}
				case 2: {
					eleccion = "RESTA";
					break;
				}
				case 3: {
					eleccion = "MULTIPLICACIÓN";
					break;
				}
				case 4: {
					eleccion = "DIVISIÓN";
					break;
				}
				}

				System.out.println("Su operacion " + eleccion + " ha sido procesada");
				String operandos = numero1 + "-" + numero2 + "-" + opcion;
				salida.println(operandos);

				BufferedReader bf = new BufferedReader(entrada);

				String linea_recibida = bf.readLine();
				System.out.println("El servidor ha respondido: " + linea_recibida);

				System.out.println("Gracias por utilizar este Servidor");
				String sContinuar = sc.nextLine();
				if (sContinuar.equalsIgnoreCase("n")) {
					continuar = false;
				
				}
		}while (continuar);
				
			
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			salida.close();
			sc.close();
			try {
				entrada.close();
				socketCliente.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
	
}
