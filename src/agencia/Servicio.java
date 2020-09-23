package agencia;

public class Servicio extends Factura{
	private double costoUnidad;
	private double unidadConsumida;
	
	public Servicio(double costoUnidad, double unidadConsumida) {
		this.costoUnidad = costoUnidad;
		this.unidadConsumida = unidadConsumida;
	}
	
	@Override
	public double montoAPagar() {
		return costoUnidad * unidadConsumida;
	}
}
