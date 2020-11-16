import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ModifyText {
    private String requested;
    private String inputFile;

    public void modify() throws IOException {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0);

            for (int j = 0; j < sheet.getColumns(); j++) {
                for (int i = 0; i < sheet.getRows(); i++) {
                    Cell cell = sheet.findCell(requested);
                    //cell.

                }
            }

            Cell cell = sheet.findCell(requested);
            System.out.println(cell);
            System.out.println(cell.getRow());
            System.out.println(cell.getRow());

            } catch (BiffException biffException) {
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
