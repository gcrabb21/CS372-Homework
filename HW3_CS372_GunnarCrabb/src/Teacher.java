
public class Teacher extends Person implements Employee {

    private int GradeLevel;
    private String Certification;
    private int StartID = 5555;

    public Teacher() {
        Name = "Teacher";
        Age = 40;
        GradeLevel = 12;
        Certification = "General Education Instrctor";
        type = Type.Teacher;
    }

    public Teacher(String name, int age, int grade, String cert) {
        Name = name;
        Age = age;
        GradeLevel = grade;
        Certification = cert;
        type = Type.Teacher;
    }

    public Boolean Employed(Employee p) {
        return true;
    }

    public int Pay() {
        return 1200;
    }

    public int ID() {
        StartID++;
        return StartID-1;
    }

    public Boolean atWorkBuilding() {
        return true;
    }

    public String toString() {
        return String.format("Name: %s\nAge: %d\nPhone Number: %d\nTeacher of grade %d\nteaching as a %s.", Name, Age, PhoneNumber, GradeLevel, Certification);
    }


}