package Callculator.view;

import Callculator.controller.ICalculator;
import Callculator.controller.IViewResult;
// The class is designed to output the result
public class ViewResult implements IViewResult {
    @Override
    public void showResult(ICalculator calculator) {
        System.out.println("The result of the operation: " + calculator.getCalc());
    }
}
