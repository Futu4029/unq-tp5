package personasYMascotasTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Test;
import personasYMascotas.*;
import java.util.LinkedList;

class pYMtest {

	
	public static void main(String[] args) {
		LinkedList<Persona> list = new LinkedList<Persona>();
		Persona jose = new Persona("Jose", new Date(1990, 3, 31));
		Persona xavi = new Persona("Xavi", new Date(1980, 1, 4));
		Mascota ranga = new Mascota("Ranga", "Collie");
		Mascota bombon = new Mascota("Bombon", "Collie");
		
		list.add(jose);
		list.add(xavi);
		list.add(ranga);
		list.add(bombon);
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getNombre());
		}
	}

	public void setUp() {

	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
