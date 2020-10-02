package agencia;

public  class Factura implements Cobrable{
	private double monto;
	private Agencia agenciaRecaudadora;
	
	public Factura() {
		super();
	}
	
	public Factura (double monto) {
		this.monto = monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public  double registrarPago() {
		return monto;
	}
}
