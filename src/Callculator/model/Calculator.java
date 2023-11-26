package Callculator.model;

import Callculator.controller.ICalculator;
/*
Логика калькулятора.
 */
public class Calculator implements ICalculator {
    @Override
    public double getCalc(){
        IpromptNum ipromptNum = new PromptNum();
        IpromptAction ipromptAction = new PromptAction();
        double num1 = ipromptNum.getNum();
        double num2 = ipromptNum.getNum();
        char operation = ipromptAction.getAction();
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("На ноль делить нельзя! Попробуйте снова.");
                    result = getCalc();
                }else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Операция не распознана, попробуйте снова!");
                result = getCalc();
        }
        return result;
    }

}
