import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW02 {
    public static void main(String[] args) {
        // 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы.
        // Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"

        String text = "";
        try {
            //FileWriter writer = new FileWriter("HW02.sql");

            FileReader fileReader = new FileReader("HW02.sql");

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
