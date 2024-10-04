package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	
	public static void skrivUt(int[] tabell) {
		int tabellUtført[] = tabell;
		
		for(int i = 0; i < tabellUtført.length; i++) {
			System.out.println("Index: " + i + " er: "+ tabellUtført[i]);
		}
	}

	// b)
	
	public static String tilStreng(int[] tabell) {
		String result = "[";

	    for (int i = 0; i < tabell.length; i++) {
	        result += tabell[i];
	        if (i < tabell.length - 1) {
	            result += ",";
	        }
	    }

	    result += "]";
	    return result;
	}

	// c)
	
	public static int summer(int[] tabell) {
		int tabellSjekkes[] = tabell;
		int total = 0;
		
		for(int i = 0; i < tabellSjekkes.length; i++) {
			int num = tabellSjekkes[i];
			total = total + num;
		}
		
		return total;
	}

	// d)
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int i = 0;

		while (!finnes && i < tabell.length) {
			if (tall != tabell[i]) {
				i++;
			} else if (tall == tabell[i]) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	
	public static int posisjonTall(int[] tabell, int tall) {
		int tabellSjekkes[] = tabell;
		int num = tall;
		int posisjon = -1;

		for (int i = 0; i < tabellSjekkes.length; i++) {
			if (tabellSjekkes[i] == num) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	// f)
	
	public static int[] reverser(int[] tabell) {
		int intTabell[] = tabell;
		int reversert[] = new int[tabell.length];
		int tabellLengde = intTabell.length - 1;
		int j = 0;
		
		for(int i = tabellLengde; i >=0; i--) {
			reversert[j] = intTabell[i];
			j++;
		}
		return reversert;
	}

	// g)
	
	public static boolean erSortert(int[] tabell) {
		int tabellSjekkes[] = tabell;
		boolean sortert = true;
		int lengde = tabellSjekkes.length - 1;
	
		for (int i = 0; i < lengde; i++) {
			if (tabellSjekkes[i] > tabellSjekkes[i + 1]) {
				sortert = false;
			} 
		}
		return sortert;
	}

	// h)
	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde = tabell1.length + tabell2.length; 
	    int[] sammensatt = new int[lengde]; 

	    for (int i = 0; i < tabell1.length; i++) {
	        sammensatt[i] = tabell1[i];
	    }

	    for (int i = 0; i < tabell2.length; i++) {
	        sammensatt[tabell1.length + i] = tabell2[i];
	    }

	    return sammensatt;
	}
}
