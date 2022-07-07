package ExtentReport;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.text.html.HTMLDocument;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C://Users//ryadav01//Documents//Excelsheets//ExcelData.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        int sheets = wb.getNumberOfSheets();
        System.out.println(sheets);

        XSSFSheet sheet = null;
        for (int i = 0; i < sheets; i++){

            if (wb.getSheetName(i).equalsIgnoreCase("Sheet1")) {
                 sheet = wb.getSheetAt(i);

            }
    }
                Iterator<Row> rows=sheet.iterator();
                Row firstrow=rows.next();

                Iterator<Cell>ce=firstrow.cellIterator();




              /* int k=0;
                int column=0;
                while(ce.hasNext())
                {
                    Cell c=ce.next();
                   if(c.getStringCellValue().equalsIgnoreCase("Naam")){
                      column=k;
                      System.out.println(c.getStringCellValue());
                    }
                    k++;
                }*/
        int index=0;
               while (ce.hasNext()){
                   Cell c= ce.next();
                   if(c.getStringCellValue().equalsIgnoreCase("Naam")) {
                       System.out.println(c.getColumnIndex());
                       index = c.getColumnIndex();
                   }
                   }
              System.out.println(index);

                while (rows.hasNext()) {
                    Row r1 = rows.next();//Ram
                    //System.out.println(r1.getCell(column).getStringCellValue());

                    if (r1.getCell(index).getStringCellValue().equalsIgnoreCase("Shyam")) {

                        Iterator<Cell> ce1 = r1.cellIterator();
                        Cell c2=ce1.next();

                      //  Cell c = null;
                        while (ce1.hasNext()) {
                            c2 = ce1.next();
                            System.out.println(c2.getStringCellValue());

                        }
                    }

                }




        }
    }
//}
