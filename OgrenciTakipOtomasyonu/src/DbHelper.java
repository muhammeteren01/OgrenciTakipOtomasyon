
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
   private String userName = "";      //buraya kendi username inizi girin
    private String password = "";   //burayada kendi possword unuzu girin
    private String dbUrl = ""; // Buraya kendi data base atdesinizi giriniz
    
    public Connection getConnection() throws SQLException{
         return DriverManager.getConnection(dbUrl,userName,password);
    }
     public void showErrorMessege(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error cod : " + exception.getErrorCode());
    }
}
