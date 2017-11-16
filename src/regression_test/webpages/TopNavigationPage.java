package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopNavigationPage {

    @FindBy(how = How.CLASS_NAME, using = "")
    WebElement reportLink;

    @FindBy(how = How.CLASS_NAME, using = "")
    WebElement topNavigationToggleLink;

    public void reports(){
        reportLink.click();
    }

    public void topNavigation(){
        topNavigationToggleLink.click();
    }
}
