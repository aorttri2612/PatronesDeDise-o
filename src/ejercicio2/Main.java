package ejercicio2;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NotificacionFactory factory = new NotificacionFactory();

		System.out.println("Tipo de notificación:");
		System.out.println("1 - EMAIL");
		System.out.println("2 - SMS");
		System.out.println("3 - PUSH");

		int opcion = sc.nextInt();

		TipoNotificacion tipo = null;

		switch (opcion) {
		case 1 -> tipo = TipoNotificacion.EMAIL;
		case 2 -> tipo = TipoNotificacion.SMS;
		case 3 -> tipo = TipoNotificacion.PUSH;
		default -> System.out.println("Opción no válida");
		}

		if (tipo != null) {
			sc.nextLine(); // limpiar buffer
			System.out.print("Mensaje: ");
			String mensaje = sc.nextLine();

			Notificacion notificacion = factory.crearNotificacion(tipo);
			notificacion.enviar(mensaje);
		}
	}
}