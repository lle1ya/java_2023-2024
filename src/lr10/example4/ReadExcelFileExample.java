package lr10.example4;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "D:\\Work\\Java\\java_2023-2024\\example4.xlsx";

        try (FileInputStream inputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            XSSFSheet sheet = workbook.getSheet("������");

            if (sheet == null) {
                System.out.println("���� '������' �� ������ � ����� Excel.");
                return;
            }

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("��������� ������ ��� ������ ����� Excel: " + e.getMessage());
            e.printStackTrace();
        }
    }
}