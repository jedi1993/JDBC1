import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String dataBaseAdress = "localhost";
        String dataBaseName = "digital_inovation_one";
        String user = "root";
        String password = "root";

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAdress).append("/")
                .append(dataBaseName);

        String connectionURL = sb.toString();

        try(Connection conn = DriverManager.getConnection(connectionURL,user,password)) {
            System.out.println("Sucesso ao conectar no banco MySQL");
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}

