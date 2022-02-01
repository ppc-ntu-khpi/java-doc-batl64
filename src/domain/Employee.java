package domain;
/**
 * Клас який описує співробітників компанії в програмі
 * @author maks
 */
public class Employee {
    /**
     * Метод заповнення зміних інформацією про співробітників
     * @return рядок з інформації про співробітників
     */

    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
/**
 * Конструктор класу Employee
 * @param name ім'я співробітника
 * @param jobTitle Посада
 * @param level розряд чи категорія
 * @param dept відділ
 */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
/**
 * Присвоєння ID робітника
 */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
/**
 * Присвоює назву посади робітника
 * @param job 
 */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
/**
 * повертає назву посади робітника
 * @return 
 */
    public String getJobTitle() {
        return jobTitle;
    }
/**
 * Повертає ім'я робітника
 * @return 
 */
    public String getName() {
        return name;
    }

    /**
     * Присвоює розряд чи категорію робітника
     * @param level 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * Повертає категорію чи розряд робітника
 * @return 
 */
    public int getLevel() {
        return level;
    }
/**
 * Повертає відділ робітника
 * @return 
 */
    public String getDept() {
        return dept;
    }
/**
 * Присвоює відділ робітника
 * @param dept 
 */
    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * Присвоює ім'я робітника
 * @param name 
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
