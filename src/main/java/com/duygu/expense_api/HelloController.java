package com.duygu.expense_api;

import org.springframework.web.bind.annotation.GetMapping;
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
}