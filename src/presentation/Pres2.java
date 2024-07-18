package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;

public class Pres2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// Dynamic instanciation for DI

			Scanner sc=new Scanner(new File("config.txt"));
			
			String daoClassName=sc.nextLine();
			//System.out.println(daoClassName);
			Class cDao=Class.forName(daoClassName);
			//Object o=cDao.newInstance();
			IDao dao=(IDao)cDao.newInstance();
			System.out.println(dao.getData());
			
			//metier
			String metierClassName=sc.nextLine();
			Class cMetier=Class.forName(metierClassName);
			IMetier metier= (IMetier) cMetier.newInstance();
			
			//Method 
			Method method=cMetier.getMethod("setDao", IDao.class);
			method.invoke(metier, dao);
			
			System.out.println(metier.calcul());
			
	
      
	}

}
