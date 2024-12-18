package broken_link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Links {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        try {
            // Open the webpage
            driver.get("https://www.facebook.com/");

            // Get all anchor tags
         List<WebElement> links = driver.findElements(By.xpath("//li//a"));

            System.out.println("Total links found: " + links.size());

            // Check each link
            for (WebElement link : links) 
            {
                String url = link.getAttribute("href");

                if (url != null && !url.isEmpty()) 
                {
                    checkLink(url);
                } 
                
                else 
                {
                 System.out.println("Link is either empty or not valid.");
                }
            }
            
            
        }
        finally {
            // Close the browser
            driver.quit();
        }
    }

    // Method to check if the link is broken
    public static void checkLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(linkUrl + " is a broken link. Response Code: " + responseCode);
            } else {
                System.out.println(linkUrl + " is valid. Response Code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println(linkUrl + " is not valid or accessible.");
        }
    }
}

