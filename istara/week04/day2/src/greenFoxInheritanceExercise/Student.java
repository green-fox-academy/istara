package greenFoxInheritanceExercise;

public class Student extends Person{
    String previousOrganization;
    int skipDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skipDays = 0;
    }

    public Student() {
        this.previousOrganization = "The School of Life";
        this.skipDays = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skipDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skipDays += numberOfDays;
    }
}