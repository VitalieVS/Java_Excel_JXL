import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


public class Main {
    private String inputFile;
    @Test
    public void excelFile() throws IOException, WriteException {
        ReadFile reader = new ReadFile();
        reader.setInputFile("D:\\test.xls");
        reader.read();
    }
}
