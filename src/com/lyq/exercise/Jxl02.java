package com.lyq.exercise;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Jxl02 {

	public static void main(String[] args) {
		WritableWorkbook wb;
		try {
			wb = Workbook.createWorkbook(new File("F:\\java\\out2.xls"));
			WritableSheet sheet = wb.createSheet("testsheep", 0);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
