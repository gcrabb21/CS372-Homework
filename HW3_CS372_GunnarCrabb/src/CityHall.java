
public class CityHall extends Building{
    private String Occupants[] = new String[20];
    private int numOccupants = 0;


    public CityHall() {
        name = "City Hall";
    }
    
    public CityHall(String Name) {
    	name = Name;
    }

    public void populate(Person person) {
        if (person.getType() == Type.Police) {
            Occupants[numOccupants] = person.getName();
            numOccupants++;
        }
    }

    public void showOccupants() {
        if (numOccupants == 0) {
            System.out.printf("City Hall is empty.\n");
        }
        else {
            for (int i = 0; i < numOccupants; i++) {
                System.out.printf("%s is in City hall.\n", Occupants[i]);
            }
        }
    }

}