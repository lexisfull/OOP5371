package TaskGenerallizations1;
//Создайте обобщенный класс Box, который будет представлять собой коробку,
//способную хранить объекты разных типов. Класс Box должен иметь поле для хранения объекта
//и соответствующие геттеры и сеттеры.
//Создайте метод printBoxContents, который принимает объект класса Box и выводит на экран
//содержимое этой коробки. Обратите внимание, что этот метод должен работать с любым типом
//объекта, хранящегося в Box. Используйте обобщенные методы для достижения этой цели.

public class Box<T> {
//  Generalized class field.
    private T obj;
//  Created getters and setters for the field.
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
//  I display the contents of the box on the screen
    public void printBoxContents(Box<T> box){
        System.out.println(box.getObj());
    }
}
