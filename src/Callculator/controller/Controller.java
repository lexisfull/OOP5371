package Callculator.controller;

import Callculator.model.Calculator;
import Callculator.view.ViewResult;
/*
Контроллер получает результаты от модели и передает на представление.
 */
public class Controller{
    ICalculator icalculator = new Calculator();
    IViewResult iViewResult = new ViewResult();
    public void getResult() {
        iViewResult.showResult(icalculator);
    }
}
