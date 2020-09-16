package makeTroub;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class TroubImplementation {
    WebDriver webDriver = Driver.webDriver;


    @Step("open the whatsapp web")
    public void navigateToWhatsApp() {
        System.out.println("-----[INFO]---BeginTroubleImplementations-----------");
        //log into whatsapp web
        String app_url = System.getenv("WHATS_APP_URL");
        Driver.webDriver.get(app_url + "/");
        assertThat(Driver.webDriver.getTitle()).contains("Gauge");
    }


    @Step("go for <name> account")
    public void goForSpecificName(String name) {

        String userName = name;
        //have to declare proper elements ID or classes those got from the whats app
        WebElement theNameOfTheReceiver = webDriver.findElement(By.xpath(""));
        System.out.println("--[WARNING]--Have to check is this right user or not ");
    }

    @Step("Tell hello default count <num>")
    public void hello(String num) {
        System.out.println("--[INFO]--Say Hello----");

        int size = Integer.parseInt(num);
        System.out.println("--[INFO]-- For Loop Begin---");
        for (int i = 0; i < size; i++) {
            try {

                //put the message on the message input box
                System.out.println("--[INFO]----going to insert the message to input box");
                new WebDriverWait(webDriver, 30).until(ExpectedConditions.elementToBeClickable(By.className("_3ixn"))).sendKeys("hello");
                Thread.sleep(2000);
                //send the message by clicking the send button
                new WebDriverWait(webDriver, 30).until(ExpectedConditions.elementToBeClickable(By.className("_3ixn"))).click();
                System.out.println("-----[INFO]--'Now executed ::" + i + " ::number of hello'");
                Thread.sleep(1000);


            } catch (Exception ex) {
                System.out.println("---[ERROR]--Error has occured because of " + ex + " \n So hello didn't send from the automation " +
                        "program.");
                break;
            }

        }
    }

    @Step("Tell message <Hello Hello> like , for <10>")
    public void customMessageWithTime(String msg, String num) {
        String message = msg;
        int numberOfTimes = Integer.parseInt(num);

        System.out.println("-[INFO]-For Loop Begun");
        for (int i = 0; i < numberOfTimes; i++) {
            try {

                //put the message on the message input box
                System.out.println("--[INFO]----going to insert the message to input box");
                new WebDriverWait(webDriver, 30).until(ExpectedConditions.elementToBeClickable(By.className("_3ixn"))).sendKeys(message);
                Thread.sleep(3000);
                //send the message by clicking the send button
                new WebDriverWait(webDriver, 30).until(ExpectedConditions.elementToBeClickable(By.className("_3ixn"))).click();
                System.out.println("-----[INFO]--'Now executed ::" + i + " ::number of hello'");
                Thread.sleep(2000);


            } catch (Exception ex) {
                System.out.println("---[ERROR]--Error has occured because of " + ex + " \n So hello didn't send from the automation " +
                        "program.");
                break;
            }

        }

    }
}
