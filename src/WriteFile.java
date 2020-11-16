import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.IOException;

public class WriteFile {
    private String inputFile;
    public void writeFile() throws IOException {
        try {
            WritableWorkbook wb = Workbook.createWorkbook(new File(inputFile));
            WritableSheet sheet = wb.createSheet("Sheet1",0);

            WritableCell cell = new Label(0,0,"Bottle");
            WritableCell cell1 = new Label(0,1,"650 gold");

            sheet.addCell(cell);
            sheet.addCell(cell1);

            wb.write();
            wb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }
}
