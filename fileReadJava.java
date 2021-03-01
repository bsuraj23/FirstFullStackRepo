package JavaPack1;
import java.io.*;
import java.util.*;

public class fileReadJava {

    public static void main(String[] args) {

        try {
            File fobj = new File("C:\\Users\\garma20\\Desktop\\testing_siri\\java\\readFileExample.txt");
            Scanner scanobj = new Scanner(fobj);
            while(scanobj.hasNextLine()) {
                String dataInFile = scanobj.nextLine();
                System.out.print(dataInFile + "\n");
            }
            scanobj.close();
        } catch (FileNotFoundException e) {

            System.out.println("error");
            e.printStackTrace();

        }

    }
}
