package personasYMascotasTest;

import java.util.ArrayList;
import java.util.Date;

import personasYMascotas.*;
import java.util.List;

class test {

	
	public static void main(String[] args) {
		List<Nombrable> list = new ArrayList<Nombrable>();
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


}
