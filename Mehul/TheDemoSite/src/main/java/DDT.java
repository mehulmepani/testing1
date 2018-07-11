import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DDT {
    //DDT


    public static String DDT_Method(){
       FileInputStream file = null;
       XSSFWorkbook workbook = null;

        try {
            file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
        }
        catch (FileNotFoundException e)

        {
            workbook = null;
        }
        try {
            workbook = new XSSFWorkbook(file);
        }
        catch (IOException e){

        }

        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell cell = sheet.getRow(0).getCell(0);
        System.out.println(cell.getStringCellValue());
        String username =


        return cell.getStringCellValue();

    }

}
