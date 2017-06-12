import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nazan on 6/12/2017.
 */
public class readSpread {
    public static  void main(String[] args){
        String csvFile = "C:/Users/nazan/Desktop/webhoseToJson/csvTest.csv";
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] line2 = line.split(",");
                System.out.println(line2[0]);
            }

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
