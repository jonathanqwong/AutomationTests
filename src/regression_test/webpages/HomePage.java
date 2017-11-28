package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CLASS_NAME, using = "topsearch-client")
    WebElement clientSelector;
    @FindBy(how = How.ID, using = "id_select_option_17")
    WebElement pieILSelectOption;
    @FindBy(how = How.ID, using = "select_12")
    WebElement filterSelector;
    @FindBy(how = How.ID, using = "select_option_10")
    WebElement teacherSelectOption;
    @FindBy(how = How.ID, using = "select_option_11")
    WebElement groupSelectOption;
    @FindBy(how = How.ID, using = "input_14")
    WebElement searchStringInput;
    @FindBy(how = How.ID, using = "topSearchDisplayModelElement")
    WebElement displayAsSelector;
    @FindBy(how = How.ID, using = "")
    WebElement lastName;
}
