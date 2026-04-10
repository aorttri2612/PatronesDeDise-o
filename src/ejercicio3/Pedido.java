package ejercicio3;

public class Pedido {
	String cliente;
	String direccion;
	String telefono;
	String email;
	String observaciones;

	private Pedido(Builder builder) {

		this.direccion = builder.direccion;
		this.email = builder.email;
		this.cliente = builder.cliente;
		this.telefono = builder.telefono;
		this.observaciones = builder.observaciones;

	}

	@Override
	public String toString() {
		return "Pedido{" + "cliente='" + cliente + '\'' + ", direccion='" + direccion + '\'' + ", telefono='" + telefono
				+ '\'' + ", email='" + email + '\'' + ", observaciones='" + observaciones + '\'' + '}';
	}

	public static class Builder {

		String cliente;
		String direccion;
		String telefono;
		String email;
		String observaciones;

		public Builder(String cliente, String direccion) {
			this.cliente = cliente;
			this.direccion = direccion;
		}

		public Builder setTelefono(String telefono) {
			this.telefono = telefono;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setObservaciones(String observaciones) {
			this.observaciones = observaciones;
			return this;
		}

		public Pedido build() {
			return new Pedido(this);
		}

	}

}
