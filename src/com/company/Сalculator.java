package com.company;

import java.util.Scanner;

public class Сalculator  {

    public static void calculator() {
        System.out.println("введите aрифмитическое выражение в формате - 2 плюс 3:  ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String[] expressionArray = expression.split(" ");
        int first=0;
        int second=0;
        try {
            first = Integer.parseInt(expressionArray[1]);
            second = Integer.parseInt(expressionArray[2]);
        } catch (NumberFormatException number) {
            System.out.println("Неккоректный формат числа введите еще раз");
            number.printStackTrace();
        }
        try {
            MathOperation.valueOf(expressionArray[2]);
        } catch (IllegalArgumentException e) {
            System.out.println("Введена некорректаная математическая операция, попробуйте еще раз");
            e.printStackTrace();
        }
        printResultMathOperation(expressionArray[2],first,second);
    }
    public static void printResultMathOperation(String s, int arg1, int arg2) {
        int result = 0;
        if (s.equalsIgnoreCase(MathOperation.PLUS.mathNameRussian)) {
            result = arg1 + arg2;
        } else if (s.equalsIgnoreCase(MathOperation.MINUS.mathNameRussian))
        { result = arg1 - arg2;}
    else if (s.equalsIgnoreCase(MathOperation.MULTIPLY.mathNameRussian))
    {
        result = arg1 * arg2;
    }
    else if (s.equalsIgnoreCase(MathOperation.DIVIDE.mathNameRussian)){
                try {
                    result = arg1 / arg2;
                } catch (ArithmeticException a) {
                    a.printStackTrace();
                    System.out.println("Деление на ноль");
                }
                }

       System.out.printf("Результат арифмитичесого выражение %d %s %d = %d",arg1,s,arg2,result);
    }



    }

