package com.mitechnologies.helper;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mitechnologies.model.Empleado;



public class Excel {
	
	private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    
    private List<Empleado> listEmpleados;
     





	public Excel(List<Empleado> listEmpleados) {
        this.listEmpleados = listEmpleados;
        workbook = new XSSFWorkbook();
    }
 
	
	
	
	
	
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Empleados CDMX");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "Número", style);      
        createCell(row, 1, "Nombre", style);       
        createCell(row, 2, "Ventiladores Buenos", style);    
        createCell(row, 3, "Ventiladores Malos", style);
        createCell(row, 4, "Total", style);
         
    }
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
     
    private void writeDataLines() {
        int rowCount = 1;
 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
                 
        for (Empleado emp : listEmpleados) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, emp.getNumero(), style);
            createCell(row, columnCount++, emp.getNombre(), style);
            createCell(row, columnCount++, emp.getBuenos(), style);
            createCell(row, columnCount++, emp.getMalos(), style);
            createCell(row, columnCount++, emp.getTotal(), style);
             
        }
    }
     
    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();
         
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
         
    }
} 