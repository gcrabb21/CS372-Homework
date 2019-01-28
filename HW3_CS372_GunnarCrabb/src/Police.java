enum Role {
    Patrol, Sargent, Captain, Chief;
}

public class Police extends Person implements Employee {

    private int StartID = 1000;
    private Role role;

    public Police() {
        Name = "Cop";
        Age = 25;
        role = Role.Patrol;
        type = Type.Police;
    }

    public Police(String name, int age, Role r) {
        Name = name;
        Age = age;
        role = r;
        type = Type.Police;
    }

    public Boolean Employed(Employee p) {
        return true;
    }

    public int ID() {
        StartID++;
        return StartID-1;
    }

    public Boolean atWorkBuilding() {
        if (role == Role.Patrol || role == Role.Sargent) {
            return false;
        }
        else if (role == Role.Captain || role == Role.Chief) {
            return true;
        }
        else {
            return false;
        }
    }

    public int Pay() {
        if (role == Role.Patrol) {
            return 1500;
        }
        else if (role == Role.Sargent) {
            return 2000;
        }
        else if (role == Role.Captain) {
            return 3000;
        }
        else if (role == Role.Chief) {
            return 5000;
        }
        else {
            return 0;
        }
    }

    public String toString() {
        return String.format("Name: %s\nAge: %d\nPhone Number: %d\nPolice officer filling the role as %s.", Name, Age, PhoneNumber, role);
    }

}