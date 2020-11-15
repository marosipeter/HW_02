package HW_03;

public abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public abstract void hello() ;

    public static void szia(){
        System.out.println("Szia Person!");
    }


}
