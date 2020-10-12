package agencia;

public  class Factura implements Cobrable{
	private double monto;
	
	public Factura() {
		super();
	}
	
	public Factura (double monto) {
		this.monto = monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	@Override
	public  double getPrecio() {
		return this.monto;
	}

	public void registrarEnAgencia(Agencia agencia) {
		agencia.registrarPago(this);
	}
}
