package personasYMascotas;
import java.util.Date;

public class Persona implements Nombrable{
	private String nombre;
	private Date fechaNacimiento;
	
	public Persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Date getBirthday() {
		return fechaNacimiento;
	}
	
	public int age() {
		int age = getBirthday().getYear() - new Date().getYear();
		return age;
	}
	
	public boolean esMayor(Persona persona1, Persona persona2) {
		return persona1.age()> persona2.age();
	}
}
