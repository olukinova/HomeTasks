package hometask13;

public class Appartment {

    String city;
    int year;
    int bedRooms;
    int floor;

     Appartment (String houseCity, int yearBuilt, int bedRoomsNumber, int aptFloor) { // static cannot be applied for the constructor
        city = houseCity;
        year = yearBuilt;
        bedRooms = bedRoomsNumber;
        floor = aptFloor;
    }

    public static void main(String[] args) {
        Appartment h1 = new Appartment("Cedar Park", 1995, 4, 5);
    }
}
