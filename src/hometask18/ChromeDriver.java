package hometask18;

public class ChromeDriver implements WebDriver{

    String browserName;
    ChromeDriver(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public void openBrowser() {
        System.out.println(browserName + " opens window");
    }

    @Override
    public void closeBrowser() {
        System.out.println(browserName + " closes window");
    }

    @Override
    public void maximizeWindow() {
        System.out.println(browserName + " maximizes window");
    }

    @Override
    public void findElement() {
        System.out.println(browserName + " finds element");
    }
}
