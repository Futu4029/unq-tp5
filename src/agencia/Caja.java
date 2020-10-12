package agencia;
import java.util.ArrayList;
import java.util.List;

public class Caja{
	private List<Cobrable> registro = new ArrayList<Cobrable>();
	private Agencia agenciaDeCobro;
	public Caja() {
		super();
	}
	
	public Caja(ArrayList<Cobrable> lista, Agencia agencia) {
		registro = lista;
		this.agenciaDeCobro = agencia;
	}
	
	public void registrar(Cobrable cob) {
		registro.add(cob);
		cob.registrarEnAgencia(agenciaDeCobro);
	}
	
	public void registrar(ArrayList<Cobrable> lista) {
		lista.stream().forEach(cob -> registrar(cob));
	}
	
	public double montoAPagar() {
		double monto = registro.stream().mapToDouble(cob -> cob.getPrecio()).sum();
		registro.clear();
		return monto;	
	}
	
	
}
