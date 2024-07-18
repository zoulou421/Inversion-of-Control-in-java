package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {

	public static void main(String[] args) {
		/*
		 * Dependency Injection by Static Instanciation 
		 */
		MetierImpl metier=new MetierImpl();
		DaoImpl dao=new DaoImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());

	}

}
