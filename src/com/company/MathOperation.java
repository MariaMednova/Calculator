package com.company;

public enum MathOperation {
    PLUS ("плюс"),
    MINUS ("минус"),
    DIVIDE ("делить"),
    MULTIPLY ("умножить");

    String mathNameRussian;
            private  MathOperation(String mathNameRussian ) {
                this.mathNameRussian=mathNameRussian;
            }

}

