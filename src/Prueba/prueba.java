package Prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba {

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DIANA\\Downloads\\Geckodrivers-master\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.choucairtesting.com");

    }
}
