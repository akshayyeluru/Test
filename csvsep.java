import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CsvReader 
{
 public static void main(String a[])
 {
    String seperator =",";
	String line="";
	String file="E:\csv flj.csv";
	 try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
	 {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] csv_flj = line.split(seperator);

                System.out.println("FirstName [code= " + csv_flj[1] + " , Last_name=" + csv_flj[2] + "]" );

            }

        } 
		
		catch (IOException e) {
            e.printStackTrace();
        }

    }
	
 
 }
	
	
}
