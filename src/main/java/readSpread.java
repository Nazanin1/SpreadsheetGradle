import java.io.*;
import java.util.List;

/**
 * Created by nazan on 6/12/2017.
 */
public class readSpread {
    public static  void main(String[] args)throws Exception{
        String csvFile = "C:/Users/nazan/Desktop/webhoseToJson/Test.csv";
        FileWriter fw = new FileWriter("C:/Users/nazan/Desktop/webhoseToJson/Test1.csv");
        fw.append("article_url");
        BufferedReader br = null;
        String line = "";
        String[] line2;


        try {
            br = new BufferedReader(new FileReader(csvFile));
            //br.readLine();
            while ((line = br.readLine()) != null){
                line2 = line.trim().split(",");
                System.out.println(line2[0] + line2[1] + line2[2] + line2[3]);

                fw.append(line2[0]);
                fw.append("\n");
                //This is test.

            }
            fw.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
