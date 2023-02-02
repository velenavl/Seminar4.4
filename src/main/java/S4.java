import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class S4 {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        String str = "";
        try {
//            Записываем файл db.sql, который потом прочитаем ридером
//            FileWriter writer = new FileWriter("db.sql");
//            writer.append("Привет!");
//            writer.flush(); //завершение

            // прочитали файл db.sql

            FileReader reader = new FileReader("db.sql");
            while (reader.ready()) {
                str += (char)reader.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] strings = str.split("\r\n");
        System.out.println(str);
    }
}
