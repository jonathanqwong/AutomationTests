package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentFilesPage {

    //Locators
    @FindBy(how = How.XPATH, using = "//*[@id=\"StudentFilePortfolioContainer\"]/div[2]/div/md-list/md-list-item[1]/div/button")
    WebElement AttendanceFolder;
    @FindBy(how = How.XPATH, using = "//*[@id=\"StudentFilePortfolioContainer\"]/div[2]/div/md-list/md-list-item[2]/div/button")
    WebElement RWAFolder;


}
