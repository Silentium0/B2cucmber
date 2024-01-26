package com.loop.utilitues;


public class TestExcel {

    public static void main(String[] args) {

        ExcelUtils excelUtils = new ExcelUtils("C:\\Users\\sergi\\OneDrive\\Desktop\\Book1.xlsx", "Sheet1");
        System.out.println(excelUtils.getCellData(0, 1));


    }
}

