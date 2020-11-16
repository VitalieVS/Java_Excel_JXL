import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;

public class ModifyText {
    private String requested;
    private String inputFile;

    public void modify() throws IOException {
        try {
            WritableWorkbook w = Workbook.createWorkbook(new File(requested));
           // WritableSheet sheet = (WritableSheet) w.getSheet(0);
            System.out.println(w.getSheet("Sheet1"));
            WritableSheet sheet = w.getSheet(0);

            for (int j = 0; j < sheet.getColumns(); j++) {
                for (int i = 0; i < sheet.getRows(); i++) {
                    Cell cell = sheet.getCell(j, i);
                    if (cell.getContents().equals(requested)) {
                        WritableCell replaceWith = new Label(j, i,"lala");
                        sheet.addCell(replaceWith);
                        w.write();
                    }
                }
            }
            w.close();
            } catch (WriteException biffException) {
            biffException.printStackTrace();
        }
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }
}
