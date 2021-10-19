package com.company;

public class OperationService {

    public static String calculate(Number first, Number second, String operator) throws Exception{
        int result;

        switch (operator){
            case "+":
                result = first.getNumeric() + second.getNumeric();
                break;
            case "-":
                result = first.getNumeric() - second.getNumeric();
                break;
            case "*":
                result = first.getNumeric() * second.getNumeric();
                break;
            case "/":
                    result = first.getNumeric() / second.getNumeric();
                break;
            default:
                throw new Exception("Не правильно введен символ операции, используйте только +, -, *, /");
        }

        if (first.getType() == NumberType.ROMAN) {
            return NumberService.toRomanNumber(result);
        } else return String.valueOf(result);
    }

}
