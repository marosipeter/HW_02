package HW_03;

public class Student extends Person{

    private String faculty;
    private Level level;


    public String getFaculty() {
        return faculty;
    }

    public Level getLevel() {
        return level;
    }

    public Student(String firstName, String lastName, int age, String faculty, Level level) {
        super(firstName, lastName, age);
        this.faculty = faculty;
        this.level = level;
    }

    public Student(Person person, String faculty, Level level){
        this(person.getFirstName(), person.getLastName(), person.getAge(),faculty,level);

    }

    @Override
    public String toString() {
        return super.toString() + " And is a " + this.level.getNameStudy() + " at the faculty of " + this.faculty + "." ;
    }
}
