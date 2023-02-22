package hometask13;

public class House {
    String city;
    int year;
    int bedRooms;

    public House (String houseCity, int yearBuilt, int bedroomNumbers) {
        city = houseCity;
        year = yearBuilt;
        bedRooms = bedroomNumbers;

    }

    public static void main(String[] args) {
        House h1 = new House("Cedar Park", 1995, 4);
    }
}
