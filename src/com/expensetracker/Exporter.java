package com.expensetracker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Exporter {

    public static void exportToCSV(List<Expense> expenses, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Category,Amount,Description,Date\n");
            for (Expense expense : expenses) {
                writer.write(String.format("%s,%f,%s,%s\n", 
                        expense.getCategory(), 
                        expense.getAmount(), 
                        expense.getDescription(),
                        expense.getDate().toString()));
            }
        }
    }
}
