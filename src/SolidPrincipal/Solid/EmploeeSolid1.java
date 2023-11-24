package SolidPrincipal.Solid;
/*
Single Responsibility Principle (Принцип единственной ответственности).
Каждый класс не сет свою ответственность, выполняя одну конкретную задачу.
 */
public class EmploeeSolid1 {
    private String name;
    private String address;

    public void calculateSalary() {
        // Расчет зарплаты сотрудника
    }
}
class EmployeeRepository {
    public void saveEmployeeData(Employee employee) {
        // Сохранение данных сотрудника в базу данных
    }
}
