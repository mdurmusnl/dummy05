import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourses/drivers/chromedriver.exe");

        WebDriver dr = new ChromeDriver();
        dr.get("https://www.google.com");

    }

}
