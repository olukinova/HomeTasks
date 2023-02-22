package hometask17;

public class Computer {
    int RAM;
    int storage;
    String OS;


    void playVideo() {
        System.out.println("Computer plays video");
    }
    void storeData() {
        System.out.println("Computer stores data");
    }
    void browseInternet() {
        System.out.println("Browse the internet");
    }
}

class Apple extends Computer {
    @Override
    void playVideo(){
        System.out.println("Apple plays video via iVideo");
    }

    @Override
    void storeData() {
        System.out.println("Apple stores your data but the data storage volume cannot be extended");
    }

    @Override
    void browseInternet() {
        System.out.println("Apple browses internet via Safari");
    }

    void editVideos() {
        System.out.println("Editing movies on iMovies");
    }
    void installApp() {
        System.out.println("Installing the apps from AppStore");
    }
}

class HP extends Computer {
    @Override
    void playVideo(){
        System.out.println("HP plays video via VTSplayer");
    }

    @Override
    void storeData() {
        System.out.println("HP stores your data and the data storage volume can be easily extended");
    }

    @Override
    void browseInternet() {
        System.out.println("HP browses internet via Google Chrome or Edge");
    }

    void installApplication() {
        System.out.println("You can install any app on me!");
    }
}

class Task1 {

    public static void main(String[] args) {

        Computer[] computers = {new Apple(), new HP()};

    for (Computer computer: computers) {
        computer.playVideo();
        computer.browseInternet();
        computer.storeData();
        System.out.println("*************");
    }

    }
}


// How to execute methods that were not inherited

class Task2 {

    public static void main(String[] args) {

        Computer[] computers = {new Apple(), new HP()};

        for (Computer computer: computers) { // we have to convert var computer into Apple type
            computer.playVideo();
            computer.browseInternet();
            computer.storeData();

            if(computer instanceof Apple) {
                Apple apple = (Apple) computer;
                apple.installApp();
                apple.playVideo();
            } else if (computer instanceof HP) {
                HP hp = (HP) computer;
                hp.installApplication();
            }


            //Apple apple = (Apple) computer;
            // apple.installApp(); // bad idea to use this code in the loop//
            // apple.playVideo(); // bad idea to use this code in the loop
            System.out.println("*************");
        }

    }
}
