package ejercicio1;

public class Main {

	public static void main(String[] args) {

		ServicioUsuarios servicioUsuarios = new ServicioUsuarios();
		ServicioPedidos servicioPedidos = new ServicioPedidos();

		servicioUsuarios.prueba();
		servicioPedidos.ejecutar();

		Logger logger = Logger.getInstancia();
		logger.mostrarLogs();
	}
}
