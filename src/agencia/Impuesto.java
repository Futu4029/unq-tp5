package agencia;

public class Impuesto extends Factura{
	private String detalle;
	
	public Impuesto(double tasa) {
		super(tasa);
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public String setDetalle(String mensaje) {
		return this.detalle = mensaje;
	}

}
