package hometask13;

public class Address {
    String city;
    String country;
    int zipCode;
    String street;
    int houseNum;


    Address(String userCity, String userCountry, int userZipCode, String userStreet, int userHouseNumber) {
        city = userCity;
        country = userCountry;
        zipCode = userZipCode;
        street = userStreet;
        houseNum = userHouseNumber;
    }

    Address (){

    }

    public static void main(String[] args) {
        Address ad1 = new Address("Cedar Park", "USA", 78613, "Stenson Drive", 2608);
        Address ad2 = new Address();

        System.out.print(ad1.city + " " + ad1.country + " " + ad1.street + " " + ad1.houseNum + " " + ad1.zipCode + "***");
        System.out.print(ad2.city + " " + ad2.country + " " + ad2.street + " " + ad2.houseNum + " " + ad2.zipCode);
    }
}
