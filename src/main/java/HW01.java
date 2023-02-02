import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW01 {
    public static void main(String[] args) {
        // 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
          String str = "";
          try {
              FileWriter writer = new FileWriter("HW01.sql");
              writer.append("Задание № 1");
              writer.flush();

              FileReader reader = new FileReader("HW01.sql");
              while (reader.ready()) {
                  str += (char)reader.read();
              }
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
        System.out.println(str);
    }
}
