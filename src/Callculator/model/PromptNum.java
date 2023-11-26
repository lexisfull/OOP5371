package Callculator.model;

import java.util.Scanner;
/*
Класс для получения значений чисел
 */
public class PromptNum implements IpromptNum{
    @Override
    public double getNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num = 0;
        int temp;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else if (scanner.hasNextInt()) {
            temp = scanner.nextInt();
            num = temp;
        }
        return num;
    }
}
