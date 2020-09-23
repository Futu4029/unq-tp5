package supermercado;

public class Producto {
	private Double precio;
	private int stock; 
	
	public Producto(Double precio, int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void stockCheck() {
		
		if (stock>0) {
			this.restarStock();
		}
	}
	
	public void restarStock() {
		this.stock = stock -1;
	}
}
