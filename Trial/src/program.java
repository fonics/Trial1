
public class program {
	public static void main(String[] args) {
		product testpro = new product("francois", "victor");
		testpro.setidproduct("1111124");
		testpro.setprodate("2015-05-30");
		testpro.setexpdate("2018-10-30");
		DAOIMP newtest = new DAOIMP();
		newtest.insert_product(testpro);
		
		/*
		product testpro = new product("111112");
		DAOIMP newtest = new DAOIMP();
		newtest.insert_product(testpro);
		*/
				
	}

}
