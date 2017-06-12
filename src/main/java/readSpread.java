import java.io.*;

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


        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] line2 = line.trim().split(",");
                fw.append(line2[0]);
                fw.append("\n");
                //This is test.
                System.out.println(line2[3]);
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
