package supermercado;
import static org.junit.jupiter.api.Assertions.*;
import agencia.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Supermercado {
	private Producto arroz;
	private ProductoCooperativa arrozC;
	private Caja caja;
	private Factura edesurChorros;
	private Impuesto impuesto;
	private ArrayList<Cobrable> listaDeCompras = new ArrayList <Cobrable>();
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto(10.5, 10);
		arrozC = new ProductoCooperativa(10.0, 20, 10.0);
		caja = new Caja();
		edesurChorros = new Servicio(30.0, 2.0);
		impuesto = new Impuesto(10);
		listaDeCompras.add(arroz);
		listaDeCompras.add(arrozC);
	}
	@Test
	void registrarPago() {
		caja.registrar(listaDeCompras);
		assertEquals(19.5, caja.montoAPagar());
		caja.registrar(arroz);
		assertEquals(10.5, caja.montoAPagar());
	}
	@Test
	void controlDeStock() {
		caja.registrar(listaDeCompras);
		caja.montoAPagar();
		assertEquals(9, arroz.getStock());
		assertEquals(19, arrozC.getStock());
	}
	
	@Test
	void cobrarImpuesto() {
		caja.registrar(impuesto);
		assertEquals(10, caja.montoAPagar());
	}
	
	@Test
	void cobrosVarios() {
		caja.registrar(impuesto);
		caja.registrar(impuesto);
		caja.registrar(edesurChorros);
		assertEquals(80.0, caja.montoAPagar());
	}

}
