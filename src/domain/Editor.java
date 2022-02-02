package domain;
/**
 * клас описывает редактора
 * @author Егор
 */
public class Editor extends Artist {
/**
 * функциональный конструктор класа
 * @param electronicEditing возможность редактировать на пк
 * @param skiils умения
 * @param name имя
 * @param jobTitle название работы
 * @param level уровень умения
 * @param dept глубина уровня
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
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
