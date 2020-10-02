package agencia;

public class Producto implements Cobrable{
	private Double precio;
	private int stock; 
	
	public Producto(Double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public boolean stockCheck() {
		return stock>0;
	}
	
	public void restarStock() {
		if (stockCheck()) {
			stock = stock -1;
		}
	}
	
	public double registrarPago() {
		restarStock();
		return getPrecio();
	}
}
