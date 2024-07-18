package ext;

import dao.IDao;

public class DaoImplv2 implements IDao {

	@Override
	public double getData() {
		// webservice version
		System.out.println("Web Service version");
		double data=12;
		return data;
	}

}
