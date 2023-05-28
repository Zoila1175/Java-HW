package Class22;

public abstract class WebDriver {

   abstract void openBrowser();
   abstract void loadURL(String url);
   abstract void performTesting();
    abstract void closeBrowser();
}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading website on Google Chrome");

    }

    @Override
    void performTesting() {
        System.out.println("Testing website on Google Chrome");

    }

    @Override
    void closeBrowser() {
        System.out.println("Closing website on Google Chrome");

    }
}
