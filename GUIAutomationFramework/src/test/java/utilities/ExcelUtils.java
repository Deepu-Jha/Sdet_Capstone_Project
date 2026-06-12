package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(
            String filePath,
            int rowNum,
            int colNum) throws Exception {

        FileInputStream fis =
                new FileInputStream(filePath);

        XSSFWorkbook workbook =
                new XSSFWorkbook(fis);

        XSSFSheet sheet =
                workbook.getSheetAt(0);

        Row row =
                sheet.getRow(rowNum);

        String data =
                row.getCell(colNum).toString();

        workbook.close();

        return data;
    }
}