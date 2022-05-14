package FourthPractice;

public class Person {
    private String fullName;
    private int age;
    public void move(){
        System.out.println(fullName +" walks.");
    }
    public void talk(){
        System.out.println(fullName +" talks.");
    }
    public Person(){
        this.fullName = "Most average man";
        this.age = 45;
    }
    public Person(int age, String fullName){
        this.fullName = fullName;
        this.age = age;
    }
}
