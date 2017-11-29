package webpages;
import objects.Browser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ReportPage {

    public static String baseReportUrl = Browser.getBaseUrl() + "/reports";

    public void goTo(){
        Pages.topNavigation().clickReportsButton();
    }

    public void viewReport(){

    }

    public void isAt(){
        Assert.assertEquals(Browser.selenium.getCurrentUrl(), baseReportUrl);
    }


}