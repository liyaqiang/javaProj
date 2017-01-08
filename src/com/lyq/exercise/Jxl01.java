package com.lyq.exercise;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

class Jxl01 {

	public static void main(String[] args) {
		//写excel
		try {
			WritableWorkbook workbook = Workbook.createWorkbook(new File("F:\\java\\out.xls"));
			WritableSheet sheet = workbook.createSheet("testsheep", 0);
			
			//九九乘法表
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					//添加单元格，格式（列，行，内容）
					sheet.addCell(new Label(j-1,i-1,j + "*" + i + "=" + String.valueOf(i*j)));
				}
			}
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//读excel
		try {
			Workbook wb = Workbook.getWorkbook(new File("F:\\java\\out.xls"));
			Sheet[] sh = wb.getSheets();
			
			if(sh != null){
				for(int x=0;x<sh.length;x++){
					Sheet s = sh[x];
					int columns = s.getColumns();
					int rows = s.getRows();
					System.out.println("列：" + columns + "行：" + rows);
					
					if(columns>0 || rows>0){
						for(int i=0;i<rows;i++){
							for(int j=0;j<columns;j++){
								System.out.print(s.getCell(j, i).getContents() + "  ");	//输出单元格内容
							}
							System.out.println();
						}
					}
				}
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
