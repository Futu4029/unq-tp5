package agencia;
import java.util.ArrayList;
import java.util.List;

public class Caja{
	private List<Cobrable> registro = new ArrayList<Cobrable>();
	
	public Caja() {
		super();
	}
	
	public Caja(ArrayList<Cobrable> lista) {
		registro = lista;
	}
	
	public void registrar(Cobrable cob) {
		registro.add(cob);
	}
	
	public void registrar(ArrayList<Cobrable> lista) {
		lista.stream().forEach(cob -> registrar(cob));
	}
	
	public double montoAPagar() {
		double monto = registro.stream().mapToDouble(cob -> cob.registrarPago()).sum();
		registro.clear();
		return monto;	
	}
	
	
}
