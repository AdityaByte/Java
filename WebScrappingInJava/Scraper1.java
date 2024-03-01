// Example 1 -> 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumInJava {
    public static void main(String[] args) {
        System.setProperty("webdriver.Edge.driver" , "F:\\program files\\selenium webdriver\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

// Example 2 -> 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumInJava {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Edge.driver" , "F:\\program files\\selenium webdriver\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.gmail.com"); // for opening a website we use the get method
        driver.manage().window().maximize(); // for maximizing the window
        driver.findElement(By.id("identifierId")).sendKeys("cybergeek563@gmail.com");
        Thread.sleep(2000); // this is for slowing down it
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(2000); // this is for slowing down it
        String at = driver.getTitle(); // at = actual title
        String et = "gmail"; // et = expected title
        driver.close();
        if(at.equalsIgnoreCase(et)){
            System.out.println("Test succesfull");

        }else{
            System.out.println("Test failure");
        }
    }
}
