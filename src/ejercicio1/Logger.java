package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Logger {

	private static Logger instancia;

	public static Logger getInstancia() {
		if (instancia == null) {
			instancia = new Logger();
		}
		return instancia;
	}

	private List<String> mensajes;

	private Logger() {

		mensajes = new ArrayList<>();

	}

	public void registrar(String mensaje) {
		mensajes.add(mensaje);
	}

	public void mostrarLogs() {
		for(::)
	}

}
