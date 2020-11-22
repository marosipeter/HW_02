package HW_03;

public class Employee extends Person{

    private String job;
    private Level level;


    public String getJob() {
        return job;
    }

    public Level getLevel() {
        return level;
    }

    public Employee(String firstName, String lastName, int age, String job, Level level) {
        super(firstName, lastName, age);
        this.job = job;
        this.level = level;
    }

    public Employee(Person person, String job, Level level){
        this(person.getFirstName(), person.getLastName(), person.getAge(),job,level);

    }

    @Override
    public String toString() {
        return super.toString() + " And is a " + this.level.getNameJob() + " level " + this.job + "." ;
    }


}
