import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		final String IP_SERVER = "localhost";
		final int PORT = 2021;

		System.out.println("------------Aplicacion Servidor------------");
		System.out.println("-------------------------------------------");

		Socket socketConexion = null;
		ServerSocket servidorSocket = null;
		PrintStream salida = null;
		InputStreamReader entrada = null;

		try {
			servidorSocket = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(PORT);
			servidorSocket.bind(direccion);

			while (true) {
				System.out.println("Esperando peticion...");
				socketConexion = servidorSocket.accept();

				entrada = new InputStreamReader(socketConexion.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);

				// El servidor se detiene aquí hasta que el cliente escriba algo
				String stringRecibido = bf.readLine();
				// TODO LO QUE LLEGA DEL CLIENTE Y LO QUE LE MANDE AL SERVIDOR SON STRING
				System.out.println("SERVIDOR: El cliente ha hecho la siguiente peticion: " + stringRecibido);
				String[] operadores = stringRecibido.split("-");
				int iNumero1 = Integer.parseInt(operadores[0]);
				int iNumero2 = Integer.parseInt(operadores[1]);
				int opcion = Integer.parseInt(operadores[2]);
				int resultado = 0;
				switch (opcion) {
				case 1:
					resultado = iNumero1 + iNumero2;
					break;
				case 2:
					resultado = iNumero1 - iNumero2;
					break;
				case 3:
					resultado = iNumero1 * iNumero2;
					break;
				case 4:
					resultado = iNumero1 / iNumero2;
					break;

				}
				salida = new PrintStream(socketConexion.getOutputStream());
				salida.println(resultado);
			}

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			salida.close();
			try {
				entrada.close();
				socketConexion.close();
				servidorSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
