package Callculator.model;

import java.util.Scanner;
/*
Класс для получения значения операции с проверкой на количество символов
 */
public class PromptAction implements IpromptAction{
    @Override
    public char getAction(){
        System.out.println("Enter operation: ");
        char operation;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else {
            System.out.println("Вы допустили ошибку при вводе операции, попробуйте еще раз");
            scanner.next();
            operation = getAction();
        }
        return operation;
    }
}
