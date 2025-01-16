package com.expensetracker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class ExpenseTableModel {
    private ObservableList<Expense> expenses;

    public ExpenseTableModel() {
        this.expenses = FXCollections.observableArrayList();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public ObservableList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(ObservableList<Expense> expenses) {
        this.expenses = expenses;
    }
}
