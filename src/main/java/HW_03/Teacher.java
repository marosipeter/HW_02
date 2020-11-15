package HW_03;

public class Teacher extends Person{

    private String subject;

    public Teacher(String subject, String name, int age) {
        super(name, age);
        this.subject = subject;
    }

    public void hello(){
        System.out.println("Hello teacher!");
    }

    public static void szia(){
        System.out.println("Szia teacher!");
    }

    public String toString(){
        System.out.println("To String teacher!");
        return "a";
    }

    public void teach(){
        System.out.println("I am teaching");
    }

}
