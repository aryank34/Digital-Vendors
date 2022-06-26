
import java.util.*;
import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class csvFile_to_MySQL {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn;
        Statement stmt;
        //ResultSet rs = null;

        try {
            String userName = "root";
            String password = "aryan7";
            String url = "jdbc:mysql://localhost:3306/power2fly";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established\n");
            
            Path pathToFile = Paths.get("books.csv");
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII);
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(";");
                stmt = conn.createStatement();
                
                attributes[0] = attributes[0].substring(1, attributes[0].length() - 1);
                attributes[1] = attributes[1].substring(1, attributes[1].length() - 1);
                stmt.execute("insert into books values(\""+attributes[0]+"\",\""+attributes[1]+"\");");
                line = br.readLine();
                System.out.println("Added");
            }
            System.out.println("Completed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
