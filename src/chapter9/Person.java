package chapter9;

public class Person {
    private String names;
    private int age;
    private String gender;

    public Person(){
        System.out.println("This is person class default constructor");
    }

    public Person(String name){
        System.out.println("This is person 2nd constructor");
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




}
