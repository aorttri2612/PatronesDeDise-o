package ejercicio3;

public class Main {

	public static void main(String[] args) {

		Pedido pedidoBasico = new Pedido.Builder("Juan Pérez", "Calle Real 5").build();

		Pedido pedidoCompleto = new Pedido.Builder("Ana López", "Avenida Andalucía 12").setTelefono("123456789")
				.setEmail("ana@email.com").setObservaciones("Entregar por la tarde").build();

		System.out.println("Pedido básico:");
		System.out.println(pedidoBasico);

		System.out.println();

		System.out.println("Pedido completo:");
		System.out.println(pedidoCompleto);
	}

}
