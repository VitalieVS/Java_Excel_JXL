import jxl.write.*;
import org.junit.Test;
import java.io.IOException;


public class Main {
    @Test
    public void excelFile() throws IOException, WriteException {
        ReadFile reader = new ReadFile();
        reader.setInputFile("D:\\test.xls");
        reader.read();
    }
}
