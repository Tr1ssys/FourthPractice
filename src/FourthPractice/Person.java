package FourthPractice;

public class Person {
    private String fullName;
    private int age;
    public void move(){
        System.out.println(fullName +" идёт.");
    }
    public void talk(){
        System.out.println(fullName +" Говорит.");
    }
    public Person(){
        this.fullName = "Самый стандартный Человек";
        this.age = 45;
    }
    public Person(int age, String fullName){
        this.fullName = fullName;
        this.age = age;
    }
}
