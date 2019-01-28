enum Type {
    Person, Kid, Police, Teacher;
}


public class Person {
    protected String Name;
    protected int Age;
    protected int PhoneNumber;
    protected static int lastNumber = 1111111;
    protected Type type;

    public Person() {
        Name = "Joe";
        Age = 30;
        PhoneNumber = lastNumber;
        lastNumber++;
        type = Type.Person;
    }

    public Person(String name, int age) {
        Name = name;
        if (age < 1 || age > 150) {
            System.out.printf("Invalid age value, age of %s set to 30 (default).\n", name);
            Age = 30;
        }
        else {
            Age = age;
        }
        PhoneNumber = lastNumber;
        lastNumber++;
    }

    public String toString() {
        return String.format("Name: " + Name + "\nAge: " + Age + "\nPhone Number: " + PhoneNumber);
    }

    public String getName() {
        return Name;
    }

    public Type getType() {
        return type;
    }
}