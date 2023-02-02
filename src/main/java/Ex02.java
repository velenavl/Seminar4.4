import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        // В существующем файле исправить - имена сократить до инициалов

        String text = "";
        try {
            FileReader fileReader = new FileReader("bd.sql");

            while(fileReader.ready()){
                text += (char)fileReader.read();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        String [] str = text.split("\r\n");

        for (int i = 0; i < str.length; i++) {
            String [] sb = str[i].split(" ");
            System.out.println(sb[0] + " " + sb[1].charAt(0) + "." + sb[2].charAt(0)+ "." + " " + sb[3] + " " + sb[4]);
        }
    }
}
