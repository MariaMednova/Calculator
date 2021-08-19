package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Сalculator  {
    private static Object Exception;

    public static void main(String[] args) {
        calculator();
    }
    public static void calculator() {
        System.out.println("введите aрифмитическое выражение в формате - 2 плюс 3:  ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String[] expressionArray = expression.split(" ");
        double first=0;
        double second=0;
        try {
            first = Double.parseDouble(expressionArray[0]);
            second = Double.parseDouble(expressionArray[2]);
        } catch (NumberFormatException number) {
            System.out.println("Неккоректный формат числа введите еще раз");
            number.printStackTrace();
            return;
        }
        printResultMathOperation(expressionArray[1],first,second);
    }
    public static void printResultMathOperation(String s, double arg1, double arg2) {
        double result = 0;
        if (s.equalsIgnoreCase(MathOperation.PLUS.mathNameRussian)) {
            result = arg1 + arg2;
        } else if (s.equalsIgnoreCase(MathOperation.MINUS.mathNameRussian))
        { result = arg1 - arg2;}
    else if (s.equalsIgnoreCase(MathOperation.MULTIPLY.mathNameRussian))
    {
        result = arg1 * arg2;
    }
    else if (s.equalsIgnoreCase(MathOperation.DIVIDE.mathNameRussian)){
               if (arg2!=0.0){
                    result = arg1 / arg2;}
               else {
                   try {
                       throw (Throwable) Exception;
                   } catch (Throwable throwable) {
                       System.out.println("Деление на ноль");
                       throwable.printStackTrace();
                       return;
                   }
                }
                }
    else {System.out.println("Введена некорректаная математическая операция, попробуйте еще раз"); return;}

       System.out.printf("Результат арифмитичесого выражение: %f %s %f = %f",arg1,s,arg2,result);
    }



    }

