package ejercicio2;

public class SmsNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("Enviando sms: %s", mensaje);
	}

}
