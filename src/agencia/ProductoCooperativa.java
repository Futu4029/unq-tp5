package agencia;

public class ProductoCooperativa extends Producto {
	private Double descuento;
	
	public ProductoCooperativa(Double precio, int stock, Double descuento) {
		super(precio, stock);
		this.descuento = descuento;
	}
	
	@Override
	public Double getPrecio() {
		Double precio = super.getPrecio();
		return precio * (1 - descuento/100);
	}
	
	public Double  getDescuento() {
		return descuento;
	}
}
