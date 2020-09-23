package agencia;

public  class Factura {
	private double monto;
	
	public Factura() {
	}
	
	public Factura (double monto) {
		this.monto = monto;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public  double montoAPagar() {
		return monto;
	}
}
