package SolidPrincipal.Solid;
// Все дeйствия выполняются в одном классе, нарушение Single Responsibility Principle (Принцип единственной ответственности).
// Нет гибкости, сложность в расширении, сложность в переиспользовании кода.
public class Employee {
    private String name;
    private String address;

    public void calculateSalary() {
        // Расчет зарплаты сотрудника
    }

    public void saveEmployeeData() {
        // Сохранение данных сотрудника в базу данных
    }
}
