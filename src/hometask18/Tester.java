package hometask18;

public class Tester {

    public static void main(String[] args) {

        WebDriver [] drivers = {new ChromeDriver("Chrome"),
        new FireFoxDriver("FireFox")};

        for(WebDriver driver: drivers) {
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }

    }

}
