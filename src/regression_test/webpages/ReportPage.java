package webpages;
import objects.Browser;
import org.openqa.selenium.WebDriver;

public class ReportPage {

    public String reportTitle = "Reports";

    public void goTo(){
        Pages.topNavigation().clickReportsButton();
    }

    public void viewReport(){

    }

    public boolean isAt(){
        return  Browser.title().contains(reportTitle);
    }


}