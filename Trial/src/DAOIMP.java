import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.util.List;
import javax.swing.JOptionPane;

public  class DAOIMP implements productDAO {
	public void insert_product(product Product){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_new", "root", "");
			PreparedStatement psmt = conn.prepareStatement("insert into product values (?,?,?,?,?)");
			psmt.setString(1, Product.getidproduct());
			psmt.setString(2, Product.gettype());
			psmt.setString(3, Product.getmanfact());
			psmt.setString(4, Product.getprodate());
			psmt.setString(5, Product.getexpdate());
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "product was successfully added");
			}
			else {
				JOptionPane.showMessageDialog(null, "product was not added");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	//public product getproduct(String manfact){
	//	product result = new product(type,manfact);
	//	Class.forName("com.mysql.jdbc.Driver");
		//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_new", "root", "");
		//Statement stmt = conn.createStatement();
	   // ResultSet rs = stmt.executeQuery("SELECT ...");//put your select here
	//	return result;
	//}
//	public List<product> getproducts(String manfact){
//		
//	}
	/*
    public List<product> delete_product(String idproduct)
    {
    	 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_new", "root", "");
    	 String query = "delete from users where id = ?";
         PreparedStatement preparedStmt = conn.prepareStatement(query);
         preparedStmt.setString(1, "");

         // execute the preparedstatement
         preparedStmt.execute();
         conn.close();
		return List<product> ;
    	
    }


*/
}
