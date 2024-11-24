Selenium pop up handling code 

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v130.network.Network;
import org.openqa.selenium.devtools.v130.network.model.Headers;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
public class HashmapSolution {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome driver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Authentication username & password
        String username = "admin";
        String password = "admin";
        // Get the devtools from the running driver and create a session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        // Enable the Network domain of devtools
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        String auth = username + ":" + password;
        // Encoding the username and password using Base64
        String encodeToString = Base64.getEncoder().encodeToString(auth.getBytes());
        System.out.println("Encoded String: " + encodeToString);
        // Pass the network header as Authorization : Basic <encoded String>
        Map<String, Object> headers = new HashMap<>();
        headers.put("Authorization", "Basic " + encodeToString);
        devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
        String url = "http://the-internet.herokuapp.com/basic_auth";
        driver.get(url);
        Thread.sleep(3000);
    }
}


*******************
   // String URL = "http://admin:admin@the-internet.herokuapp.com/basic_auth";

       // ((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
	   
