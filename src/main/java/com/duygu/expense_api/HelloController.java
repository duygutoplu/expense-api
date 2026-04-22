package com.duygu.expense_api;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Duygu";
    }

    @GetMapping("/expense")
    public Expense getExpense() {
        Expense e = new Expense();
        e.title = "Coffee";
        e.amount = 50;
        return e;
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() {
        List<Expense> list = new ArrayList<>();

        Expense e1 = new Expense();
        e1.title = "Coffee";
        e1.amount = 50;

        Expense e2 = new Expense();
        e2.title = "Taxi";
        e2.amount = 120;

        list.add(e1);
        list.add(e2);

        return list;
    }

    @PostMapping("/expense")
    public Expense createExpense(@RequestBody Expense expense) {
        return expense;
    }
}