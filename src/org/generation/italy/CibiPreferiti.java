package org.generation.italy;


public class CibiPreferiti {
	
	public static void main(String[] args) {
		
		String[] piattiPreferiti = { "pizza", "carbonara", "lasagne", "tiramis�", "frittata", "mozzarella", "pasta alla vodka", "scaloppine", "millefoglie", "spaghetti ale vongole" };
		
		System.out.println("La mia lista contiene " + piattiPreferiti.length + " elementi");
		System.out.println("Il mio piatto preferito: " + piattiPreferiti[0]);
		System.out.println("Il mio piatto un p� meno preferito: " + piattiPreferiti[piattiPreferiti.length-1]);
		//bonus
		System.out.println("Il mio piatto in mediana �: " + piattiPreferiti[piattiPreferiti.length/2] );
		
	}
}
