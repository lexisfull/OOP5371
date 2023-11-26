package Callculator;

import Callculator.controller.Controller;
/*
Программа написана с использованием интерфейсов для обеспечения гибкости и
для обеспечения простоты поддержки и расширения.
 */
public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.getResult();
    }
}
