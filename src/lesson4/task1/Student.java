package lesson4.task1;

public class Student extends Person {

    private String univercity;
    private String faculty;
    private int groupNumber;

    public Student(String firstName, String lastName, int age, boolean sex, String univercity, String faculty, int groupNumber) {
        super(firstName, lastName, age, sex);
        this.univercity = univercity;
        this.faculty = faculty;
        this.groupNumber = groupNumber;
    }

    public Student() {
    }

    @Override
    public void getInfo(){
        System.out.println("Student: " + "Last name: " +this.getLastName()+"\nFirst name: "
                +this.getFirstName()+ "\nUnivercity: " + univercity + "\nFaculty: " + faculty + "\nGroup: " + groupNumber);
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

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

}
