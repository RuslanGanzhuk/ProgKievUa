package lesson4.task1;

public class Student extends Person{

    private String univercity;
    private String faculty;
    private Group group;

    public Student(String firstName, String lastName, int age, boolean sex, String univercity, String faculty, Group group) {
        super(firstName, lastName, age, sex);
        this.univercity = univercity;
        this.faculty = faculty;
        this.group = group;

    }

    public Student() {
    }


    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString(){
        return super.toString() + " Univercity: " + univercity + "Faculty: " + faculty + " group: " + group.getId();
    }


}
