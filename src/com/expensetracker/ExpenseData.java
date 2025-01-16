package com.expensetracker;

import java.util.ArrayList;
import java.util.List;

public class ExpenseData {
    private List<Expense> expenses;

    public ExpenseData() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public double getTotalAmount() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }
}
