import org.junit.Test;
import java.io.IOException;


public class Main {
    @Test
    public void read() throws IOException {
        ReadFile reader = new ReadFile();
        reader.setInputFile("D:\\test.xls");
        reader.read();
    }

    @Test
    public void write() throws IOException {
        WriteFile writer = new WriteFile();
        writer.setInputFile("D:\\write.xls");
        writer.writeFile();
    }
}
