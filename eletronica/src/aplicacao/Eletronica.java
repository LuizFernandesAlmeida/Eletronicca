
package aplicacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Eletronica{

	public static void main(String[] args) {
		Connection connection = null; 

		try { 

		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/eletronica","root","lu.99867067"); 

		System.out.println("Conexão realizada com sucesso."); 
		
		} catch (SQLException ex) { 

		    

		    System.out.println("SQLException: " + ex.getMessage()); 

		    System.out.println("SQLState: " + ex.getSQLState()); 

		   System.out.println("VendorError: " + ex.getErrorCode()); 

		} 
	}
}

	