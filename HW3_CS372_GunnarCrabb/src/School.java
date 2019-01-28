
public class School extends Building{
    private String Occupants[] = new String[20];
    private int numOccupants = 0;

    public School() {
        name = "School";
    }
    
    public School(String Name) {
    	name = Name;
    }

    public void populate(Person person) {
        if (person.getType() == Type.Kid || person.getType() == Type.Teacher) {
            Occupants[numOccupants] = person.getName();
            numOccupants++;
        }
    }

    public void showOccupants() {
        if (numOccupants == 0) {
            System.out.printf("School is empty.\n");
        }
        else {
            for (int i = 0; i < numOccupants; i++) {
                System.out.printf("%s is in School\n", Occupants[i]);
            }
        }
    }



}