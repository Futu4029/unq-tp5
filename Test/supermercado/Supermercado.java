package supermercado;
import static org.junit.jupiter.api.Assertions.*;
import agencia.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class Supermercado {
	private Producto arroz;
	private ProductoCooperativa arrozC;
	private Caja caja;
	private Factura edesurChorros;
	private Impuesto impAlBuenSeñor;
	private ArrayList<Producto> listaDeCompras = new ArrayList <Producto>();
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto(10.5, 10);
		arrozC = new ProductoCooperativa(10.0, 20, 10.0);
		caja = new Caja();
		edesurChorros = new Servicio(100.0, 2500.0);
		impAlBuenSeñor = new Impuesto(666.6);
		listaDeCompras.add(arroz);
		listaDeCompras.add(arrozC);
	}
	@Test
	void registrarPago() {
		caja.vender(listaDeCompras);
		assertEquals(19.5, caja.totalRegistrado());
		caja.vender(arroz);
		assertEquals(caja.totalRegistrado(), 30.0);
	}
	@Test
	void controlDeStock() {
		caja.vender(listaDeCompras);
		assertEquals(arroz.getStock(), 9);
		assertEquals(arrozC.getStock(), 19);
	}
	
	@Test
	void cobrarFactura() {
		caja.registrarPago(edesurChorros);
		assertEquals(caja.totalRegistrado(), 250000.0);
	}
	
	@Test
	void cobrarImpuesto() {
		caja.registrarPago(impAlBuenSeñor);
		assertEquals(caja.totalRegistrado(), 666.6);
	}
	
	@Test
	void cobrosVarios() {
		caja.registrarPago(impAlBuenSeñor);
		caja.registrarPago(impAlBuenSeñor);
		assertEquals(caja.totalRegistrado(), 1333.2);
	}

}
