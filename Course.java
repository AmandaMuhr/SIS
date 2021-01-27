public class Course {
    protected String name; // String containing the name of the course
    protected double grade; // String containing the grade.

    //////////////////
    // Constructors //
    //////////////////

    public Course(String name, double grade) {
        setName(name);
        setGrade(grade);
    }

    ///////////////////////
    // GETTERS & SETTERS //
    ///////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //////////////
    // METHODS //
    /////////////

}
