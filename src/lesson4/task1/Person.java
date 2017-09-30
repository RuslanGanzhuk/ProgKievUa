package lesson4.task1;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean sex;

    public Person(String firstName, String lastName, int age, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public void getInfo(){
        System.out.println("Person: " + " Name: " + firstName + "\nLast Name: " + lastName
                           + "\nage: " + age + "\nsex: " + sex);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                " ,firstName='" + firstName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}'+ '\n';
    }
}
