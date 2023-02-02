import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex01 {
    public static void main(String[] args) {
        //Cоздать текстовый файл, потом его считать
        String text = "";
        try {
            FileWriter fileWriter = new FileWriter("bd.sql", true);
            //fileWriter.append("Hello, world!");
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader("bd.sql");

            while(fileReader.ready()){
                text += (char)fileReader.read();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        System.out.println(text);

    }
}
