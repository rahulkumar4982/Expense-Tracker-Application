package com.expensetracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.io.IOException;

public class Controller {

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private TableView<Expense> expenseTable;

    @FXML
    private Button saveButton;

    private ExpenseData expenseData = new ExpenseData();

    @FXML
    private void initialize() {
        categoryComboBox.getItems().addAll("Food", "Transportation", "Entertainment", "Other");
    }

    @FXML
    private void handleAddExpense(ActionEvent event) {
        String category = categoryComboBox.getValue();
        double amount = Double.parseDouble(amountTextField.getText());
        String description = descriptionTextArea.getText();
        LocalDate date = dateDatePicker.getValue();

        Expense expense = new Expense(category, amount, description, date);
        expenseData.addExpense(expense);

        expenseTable.getItems().setAll(expenseData.getExpenses());
    }

    @FXML
    private void handleExportCSV(ActionEvent event) throws IOException {
        Exporter.exportToCSV(expenseData.getExpenses(), "expenses.csv");
    }
}
