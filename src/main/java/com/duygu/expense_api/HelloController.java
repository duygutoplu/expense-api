package com.duygu.expense_api;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int nextId = 3;
    private List<Expense> expenses = new ArrayList<>();

    public HelloController() {
        Expense e1 = new Expense();
        e1.id = 1;
        e1.title = "Coffee";
        e1.amount = 50;

        Expense e2 = new Expense();
        e2.id = 2;
        e2.title = "Taxi";
        e2.amount = 120;

        expenses.add(e1);
        expenses.add(e2);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Duygu";
    }

    @GetMapping("/expense")
    public Expense getExpense() {
        return expenses.get(0);
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        return expenses;
    }

    @PostMapping("/expense")
    public Expense createExpense(@RequestBody Expense expense) {
        expense.id = nextId;
        nextId = nextId + 1;
        expenses.add(expense);
        return expense;
    }
}