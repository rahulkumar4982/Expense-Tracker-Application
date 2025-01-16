package com.expensetracker;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javafx.scene.layout.BorderPane;

public class Charts {

    public static BorderPane createExpenseChart(ExpenseData data) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        data.getExpenses().forEach(expense -> 
            dataset.addValue(expense.getAmount(), expense.getCategory(), expense.getDate().toString())
        );

        JFreeChart chart = ChartFactory.createBarChart(
                "Expense Breakdown", 
                "Category", 
                "Amount", 
                dataset
        );
        
        ChartPanel chartPanel = new ChartPanel(chart);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(chartPanel);
        return borderPane;
    }
}
