package domain;
/**
 * Клас який описує редактора
 * @author maks
 */
public class Editor extends Artist {
/**
 * Конструктор класа Editor при якому ввели шість змінні
 * @param electronicEditing наявність уміння роботи з текстом
 * @param skiils навички
 * @param name ім'я
 * @param jobTitle посада 
 * @param level розряд
 * @param dept відділ
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * Конструктор класа Editor при якому ввели дві змінні
 * @param electronicEditing наявність уміння роботи з текстом
 * @param skiils навички
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/**
 *  Конструктор класа Editor при якому ввели одну змінну
 * @param electronicEditing наявність уміння роботи з текстом
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор класа Editor при якому не ввели не одної змінної
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
