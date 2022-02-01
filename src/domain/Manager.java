package domain;
/**
 * Класс який описує менеджера
 * @author 1
 */
public class Manager extends Employee {
/**
 * Конструктор класа Manager
 * @param employees масив робітників якими керує менеджер
 * @param name ім'я
 * @param jobTitle посада
 * @param level розряд
 * @param dept відділ
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
