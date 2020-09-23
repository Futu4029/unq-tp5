package supermercado;
import java.util.ArrayList;
import agencia.*;

public class Caja implements Agencia{
	private ArrayList<Producto> registroDeProductos = new ArrayList<Producto>();
	private ArrayList<Double> registroDePagos = new ArrayList<Double>();
	private Factura ultimaFacturacion = new Factura();
	private double montoAPagar;
	
	public Caja() {
		super();
	}
	
	public Caja(ArrayList<Producto> lista) {
		registroDeProductos = lista;
	}
	
	public void registrar(Producto a) {
		montoAPagar = montoAPagar + a.getPrecio();
		registroDeProductos.add(a);
	}
	
	public Double getMontoAPagar() {
		return montoAPagar;	
	}
	
	private void generarFactura(double monto) {
		ultimaFacturacion.setMonto(monto);
	}
	
	public void registrarPago(Factura factura) {
		registroDePagos.add(factura.montoAPagar());
		registroDeProductos.forEach(producto -> producto.stockCheck());
		registroDeProductos.clear();
		montoAPagar = 0;
	}
	
	public double totalRegistrado() {
		double total = registroDePagos.stream().mapToDouble(cobro -> cobro.doubleValue()).sum();
		return total;
	}
	
	public void vender(ArrayList<Producto> listaDeCompras) {
		listaDeCompras.stream().forEach(producto -> registrar(producto));
		generarFactura(montoAPagar);
		registrarPago(ultimaFacturacion);
	}
	
	public void vender(Producto producto) {
		registrar(producto);
		generarFactura(montoAPagar);
		registrarPago(ultimaFacturacion);
	}
	
	
}
