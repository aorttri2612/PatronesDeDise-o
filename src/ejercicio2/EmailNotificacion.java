package ejercicio2;

public class EmailNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("Enviando EMAIL: %s", mensaje);
	}

}
