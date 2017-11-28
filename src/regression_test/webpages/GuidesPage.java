package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GuidesPage {

    // Guides App Tabs
    @FindBy(how = How.XPATH, using = "//*[@id=\"GuidesController\"]/div/div/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]")
    WebElement snapshotTab;
    @FindBy(how = How.XPATH, using = "//*[@id=\"GuidesController\"]/div/div/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]")
    WebElement guideTab;
    @FindBy(how = How.XPATH, using = "//*[@id=\"GuidesController\"]/div/div/div/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[3]")
    WebElement workTab;

    // Snapshot Tab Buttons
    @FindBy(how = How.CLASS_NAME, using = "common-service")
    WebElement communityServiceBtn;
    @FindBy(how = How.CLASS_NAME, using = "grad-check")
    WebElement gradCheckeBtn;
    @FindBy(how = How.CLASS_NAME, using = "extra-activities")
    WebElement extraActivitiesBtn;
    @FindBy(how = How.CLASS_NAME, using = "support-prog")
    WebElement supportProgramBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-0\"]/div/div/guides-snapshot/md-content/div[1]/md-card[1]/md-card-actions/button[1]")
    WebElement eyeBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-0\"]/div/div/guides-snapshot/md-content/div[1]/md-card[1]/md-card-actions/button[2]")
    WebElement iBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-0\"]/div/div/guides-snapshot/md-content/div[2]/div/h4/button")
    WebElement printGuideBtn;

    // Guide Tab Buttons
    @FindBy(how = How.ID, using = "select_93")
    WebElement guideSelect;
    @FindBy(how = How.ID, using = "select_option_95")
    WebElement guideSelectOption;
    @FindBy(how = How.CLASS_NAME, using = "unassigned-courses")
    WebElement UACourses;
    @FindBy(how = How.CLASS_NAME, using = "ext-courses")
    WebElement extCoursesBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"guides-guide\"]/div[2]/div[1]/button[1]")
    WebElement nineGradeBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"guides-guide\"]/div[2]/div[1]/button[2]")
    WebElement tenGradeBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"guides-guide\"]/div[2]/div[1]/button[3]")
    WebElement elevenGrade;
    @FindBy(how = How.XPATH, using = "//*[@id=\"guides-guide\"]/div[2]/div[1]/button[4]")
    WebElement twelveGradeBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"guides-guide\"]/div[2]/div[1]/button[5]")
    WebElement allGradeBtn;
    @FindBy(how = How.CLASS_NAME, using = "bulk-print-button")
    WebElement printBulkBtn;
    @FindBy(how = How.CLASS_NAME, using = "guide-print-button")
    WebElement printSingleBtn;

    // Slot Button and Options
    @FindBy(how = How.CLASS_NAME, using = "menu-trigger")
    WebElement threeDotsBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_container_209\"]/md-menu-content/md-menu-item[1]/button")
    WebElement editOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_container_209\"]/md-menu-content/md-menu-item[2]/button")
    WebElement UnitsOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_container_209\"]/md-menu-content/md-menu-item[3]/button")
    WebElement printRCEBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu_container_209\"]/md-menu-content/md-menu-item[4]/button")
    WebElement splitBtn;

    // Edit Assignment Dialog
    @FindBy(how = How.ID, using = "select_1113")
    WebElement classLeaderSelect;
    @FindBy(how = How.ID, using = "select_option_1128")
    WebElement classLeaderSelectOption;
    @FindBy(how = How.ID, using = "input_1117")
    WebElement startDateInput;
    @FindBy(how = How.ID, using = "input_1119")
    WebElement endDateInput;
    @FindBy(how = How.XPATH, using = "/html/body/div[6]/md-dialog/md-dialog-actions/button[2]")
    WebElement saveBtn;

    // Unit Page Button and Options
    @FindBy(how = How.XPATH, using = "")
    WebElement workMonthSelect;
    @FindBy(how = How.XPATH, using = "")
    WebElement workMonthSelectOption;
    @FindBy(how = How.XPATH, using = "")
    WebElement scoreInput;
    @FindBy(how = How.XPATH, using = "")
    WebElement commentBtn;
    @FindBy(how = How.XPATH, using = "")
    WebElement auditBtn;

    // Audit Dialog

    // Work Tab Buttons





}
