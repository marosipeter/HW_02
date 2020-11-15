package HW_03;

public class Main {

    public static void main(String... args){

        Teacher sanyi = new Teacher("foldrajz", "Sanyi", 23);

        sanyi.toString();
        sanyi.getName();
        ((Teacher) sanyi).teach();
//        Person.szia();
//        Teacher.szia();
//        Person gyula = new Person("Gyula", 24);
//        gyula.hello();


    }
}
