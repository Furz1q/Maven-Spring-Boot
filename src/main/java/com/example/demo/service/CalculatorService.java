package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";}

    public String plus (Integer num1, Integer num2){
        if (num1 == null || num2 == null){
            return "Введите оба значения";
        }
        int result = num1 + num2;
        return "Результат = " + num1 +  " + " + num2 + " = " + result;
    }

    public String minus (int num1, int num2){
        int result = num1 - num2;
        return "Результат = " + num1 +  " - " + num2 + " = " + result;
    }

    public String multiply (int num1, int num2){
        int result = num1 * num2;
        return "Результат = " + num1 +  " * " + num2 + " = " + result;
    }

    public String divide (int num1, int num2){
        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        int result = num1 / num2;
        return "Результат = " + num1 +  " / " + num2 + " = " + result;
    }


}
