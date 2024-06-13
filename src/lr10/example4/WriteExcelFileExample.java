package lr10.example4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.SocketHandler;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("������");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("�����");
        headerRow.createCell(1).setCellValue("��������������");
        headerRow.createCell(2).setCellValue("���������");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("�����");
        dataRow1.createCell(1).setCellValue("����: ����������, �����: ������ �.�.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("���������");
        dataRow2.createCell(1).setCellValue("���������: Intec Core i5, ����������� ������: ");
        dataRow2.createCell(2).setCellValue(25000.0);

        String filePath = "D:\\Work\\Java\\java_2023-2024\\example4.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("������ �������� � ����: " + filePath);
    }
}
