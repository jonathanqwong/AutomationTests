package webpages;

import objects.Browser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static objects.Browser.getDriver;
import static objects.Browser.selenium;

public class HomePage {
    // Home Page URL
    public static String HOME_PAGE = "/";

    // Client Drop Down and Select Options
    @FindBy(how = How.XPATH, using = "//*[@id=\"choose-client\"]/md-autocomplete-wrap/button")
    WebElement clientSelector;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ul-3\"]/li[3]/md-autocomplete-parent-scope")
    WebElement pieILSelectOption;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ul-3\"]/li[4]/md-autocomplete-parent-scope")
    WebElement ashburnSelectOption;

    // Filter Drop Down and Select Options (Teacher, Groups, Classes)
    @FindBy(how = How.ID, using = "select_35")
    WebElement filterSelector;
    @FindBy(how = How.ID, using = "select_option_34")
    WebElement teacherFilterSelectOption;
    @FindBy(how = How.ID, using = "select_option_8")
    WebElement groupFilterSelectOption;
    @FindBy(how = How.ID, using = "select_option_9")
    WebElement classesFilterSelectOption;

    // Teacher Drop Down and Select Options_
    @FindBy(how = How.ID, using = "select_42")
    WebElement teacherSelector;
    @FindBy(how = How.ID, using = "select_option_47")
    WebElement teacherSelectOption;
    @FindBy(how = How.ID, using = "select_option_41")
    WebElement allTeacherSelectOption;

    // Group Drop Down and Select Options
    // Classes Drop Down and Select Options

    // Elements in Shell
    @FindBy(how = How.CLASS_NAME, using = "appTitle")
    WebElement appTitleContainer;
    //@FindBy(how = How.CLASS_NAME, using = "cardContent")
    //WebElement cardContent;
    @FindBy(how = How.XPATH, using = "/html/body/div[5]/md-dialog/form/md-toolbar/div/h2")
    WebElement changePasswordDialog;
    @FindBy(how = How.ID, using = "input_8")
    WebElement searchStringInput;
    @FindBy(how = How.ID, using = "topSearchDisplayModelElement")
    WebElement displayAsSelector;
    @FindBy(how = How.ID, using = "select_option_58")
    WebElement displayAsFirstNameSelectOption;
    @FindBy(how = How.ID, using = "select_option_59")
    WebElement displayAsLastNameSelectOption;
    @FindBy(how = How.CLASS_NAME, using = "qa-show-inactives")
    WebElement showInactives;
    @FindBy(how = How.CLASS_NAME, using = "qa-card-view ")
    WebElement cardViewBtn;
    @FindBy(how = How.CLASS_NAME, using = "qa-grid-view ")
    WebElement gridViewBtn;

    // Elements in Student Card View
    @FindBy(how = How.CLASS_NAME, using = "client")
    WebElement clientOnCard;
    @FindBy(how = How.XPATH, using = "teacher")
    WebElement teacherOnCard;
    @FindBy(how = How.CLASS_NAME, using = "display-firstname")
    WebElement studentOnCardFirstNameDisplay;
    @FindBy(how = How.CLASS_NAME, using = "display-lastname")
    WebElement studentOnCardLastNameDisplay;
    @FindBy(how = How.XPATH, using = "//*[@id=\"studentsListTable\"]/tbody/tr[1]/td[2]")
    WebElement studentNameInFirstGrid;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-57\"]/div/h4")
    WebElement noSearchResultContainer;
    @FindBy(how = How.CLASS_NAME, using = "qa-card-expand")
    WebElement threeDotsBtnOnCard;
    @FindBy(how = How.XPATH, using = "//*[@id='studentsListTable']/tbody/tr/td[11]/student-menu/div/md-menu/button")
    WebElement threeDotsBtnOnGrid;
    @FindBy(how = How.CLASS_NAME, using = "qa-card-student-info")
    WebElement eyeBtnOnCard;
    @FindBy(how = How.CLASS_NAME, using = "qa-grid-student-info")
    WebElement eyeBtnOnGrid;
    @FindBy(how = How.CLASS_NAME, using = "qa-card-more-info")
    WebElement iBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-58\"]/div/div[1]/md-content[1]/div[1]/student-card/md-card/md-card-content/div/div/div[2]/h3/button")
    WebElement editGuardianFromCardViewBtn;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-58\"]/div/div[1]/md-content[1]/div[1]/student-card/md-card/md-card-content/div/div/div[1]/ul/li[4]/a")
    WebElement resetPasswordLink;
    @FindBy(how = How.ID, using = "ConfirmBtn")
    WebElement setPasswordBtn;
    @FindBy(how = How.CLASS_NAME, using = "cancelBtn ")
    WebElement okBtnInTempPwDialog;
    @FindBy(how = How.XPATH, using = "//*[@id=\"tab-content-58\"]/div/div[1]/md-content[1]/div[1]/student-card/md-card/md-card-title/md-card-title-text/div/button")
    WebElement backToFrontOfCardButton;

    // Functions
    public void clearStudentSelector() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"choose-client\"]/md-autocomplete-wrap/button"));
        clientSelector.click();
    }

    public void selectPieIlClient() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"ul-3\"]/li[3]/md-autocomplete-parent-scope"));
        pieILSelectOption.click();
    }

    public void selectAshburnClient() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"ul-3\"]/li[4]/md-autocomplete-parent-scope"));
        ashburnSelectOption.click();
    }

    public void clickFilterSelector() {
        Browser.waitUntilElementIsVisible(By.id("select_35"));
        filterSelector.click();
    }

    public void selectTeacherFilter() {
        Browser.waitUntilElementIsVisible(By.id("select_option_34"));
        teacherFilterSelectOption.click();
    }

    public void selectGroupFilter() {
        Browser.waitUntilElementIsVisible(By.id("select_option_38"));
        groupFilterSelectOption.click();
    }

    public void selectClassesFilter() {
        Browser.waitUntilElementIsVisible(By.id("select_option_39"));
        classesFilterSelectOption.click();
    }

    public void clickTeacherSelector() {
        Browser.waitUntilElementIsVisible(By.id("select_42"));
        teacherSelector.click();
    }

    public void selectTeacherBrianPervan() {
        Browser.waitUntilElementIsVisible(By.id("select_option_47"));
        teacherSelectOption.click();
    }

    public void selectAllTeachers() {
        Browser.waitUntilElementIsVisible(By.id("select_option_41"));
        allTeacherSelectOption.click();
    }

    // Groups and Classes not done yet

    public void searchForStudent(String searchString) throws Exception {
        Browser.waitUntilElementIsVisible(By.id("input_8"));
        searchStringInput.click();
        searchStringInput.clear();
        searchStringInput.sendKeys("\n");
        Thread.sleep(3500);
        searchStringInput.sendKeys(searchString);
        Thread.sleep(7000);
    }

    public void assertStudentSearchResultOnCard_FirstNameDisplay(String studentName) throws Exception {
        Thread.sleep(5000);
        Browser.waitUntilElementIsVisible( By.className("student-card"));
        String studentNameOnCard = studentOnCardFirstNameDisplay.getText();
        Assert.assertEquals(studentNameOnCard, studentName);
        System.out.println("Assert Search Results Returns Student Card for: " + studentNameOnCard);
    }

    public void assertStudentSearchResultOnCard_LastNameDisplay(String studentName) throws Exception {
        Thread.sleep(4500);
        Browser.waitUntilElementIsVisible( By.className("student-card"));
        String studentNameOnCard = studentOnCardLastNameDisplay.getText();
        Assert.assertEquals(studentNameOnCard, studentName);
        System.out.println("Assert Search Results Returns Student Card for: " + studentNameOnCard);
    }

    public void assertNoStudentSearchResult(String noResultText) throws Exception {
        Thread.sleep(5000);
        Browser.waitUntilElementIsVisible( By.xpath("//*[@id=\"tab-content-57\"]/div/h4"));
        String noSearchResultText = noSearchResultContainer.getText();
        Assert.assertEquals(noSearchResultText, noResultText);
        System.out.println("Assert No Student Search Result Returns: " + noSearchResultText);
    }

    public void assertStudentInGridViewDiplay(String studentName) throws Exception {
        Thread.sleep(5000);
        Browser.waitForElement( By.xpath("//*[@id=\"studentsListTable\"]/tbody/tr[1]/td[2]"));
        String studentNameInGridView = studentNameInFirstGrid.getText();
        System.out.println("Assert Search Results Returns Student in Grid View for: " + studentName);
        Assert.assertEquals(studentNameInGridView, studentName);
    }

    public void clickDisplayAsSelector() {
        Browser.waitUntilElementIsVisible(By.id("topSearchDisplayModelElement"));
        displayAsSelector.click();
    }

    public void clickFirstNameSelectOption() {
        Browser.waitUntilElementIsVisible(By.id("select_option_58"));
        displayAsFirstNameSelectOption.click();
    }

    public void clickLastNameSelectOption() {
        Browser.waitUntilElementIsVisible(By.id("select_option_59"));
        displayAsLastNameSelectOption.click();
    }

    public void clickShowInactivesCheckbox () {
        Browser.waitUntilElementIsVisible(By.className("qa-show-inactives"));
        showInactives.click();
    }

    public void clickCardViewButton () {
        Browser.waitUntilElementIsVisible(By.className("qa-card-view "));
        cardViewBtn.click();
    }

    public void clickGridViewButton () {
        Browser.waitUntilElementIsVisible(By.className("qa-grid-view "));
        gridViewBtn.click();
    }

    public void assertUserClient (String clientName) throws Exception {
        Thread.sleep(5000);
        Browser.waitForElement( By.className("client"));
        String clientNameOnCard = clientOnCard.getText();
        System.out.println("Assert Client is on: " + clientNameOnCard);
        Assert.assertEquals(clientNameOnCard, clientName);
    }

    public void assertStudentResultTeachers(String teacherName) throws Exception {
        Thread.sleep(5000);
        Browser.waitForElement( By.className("teacher"));
        String teacherNameOnCard = teacherOnCard.getText();
        System.out.println("Assert Teacher's Student Results is for: " + teacherNameOnCard);
        Assert.assertEquals(teacherNameOnCard, teacherName);
    }

    public void clickThreeDotsButtonOnCard() throws Exception {
        Browser.refreshPage();
        Browser.waitUntilElementIsVisible(By.className("qa-card-expand"));
        threeDotsBtnOnCard.click();
        //threeDotsBtn.click();
    }

    public void clickThreeDotsButtonOnGrid() throws Exception {
        Thread.sleep(2500);
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id='studentsListTable']/tbody/tr/td[11]/student-menu/div/md-menu/button"));
        threeDotsBtnOnGrid.click();
    }

    public void clickEyeButtonOnCard() {
        Browser.waitUntilElementIsVisible(By.className("qa-card-student-info"));
        eyeBtnOnCard.click();
    }

    public void clickEyeButtonOnGrid() {
        Browser.waitUntilElementIsVisible(By.className("qa-grid-student-info"));
        eyeBtnOnGrid.click();
    }

    public void clickIButton() throws Exception {
        Thread.sleep(2500);
        Browser.waitUntilElementIsVisible(By.className("qa-card-more-info"));
        iBtn.click();
    }

    public void clickEditGuardianFromCardViewButton() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"tab-content-58\"]/div/div[1]/md-content[1]/div[1]/student-card/md-card/md-card-content/div/div/div[2]/h3/button"));
        editGuardianFromCardViewBtn.click();
    }

    public void clickResetPasswordLink() {
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"tab-content-58\"]/div/div[1]/md-content[1]/div[1]/student-card/md-card/md-card-content/div/div/div[1]/ul/li[4]/a"));
        resetPasswordLink.click();
    }

    public void clickSetPasswordButton() throws Exception {
        Thread.sleep(2000);
        Browser.waitUntilElementIsVisible(By.id("ConfirmBtn"));
        setPasswordBtn.click();
    }

    public void clickOkBtnInTempPwDialog() throws Exception {
        Thread.sleep(2000);
        Browser.waitUntilElementIsVisible(By.className("cancelBtn"));
        okBtnInTempPwDialog.click();
    }

    public void clickBackToFrontOfCardButton() throws Exception {
        Thread.sleep(2000);
        Browser.waitUntilElementIsVisible(By.xpath("//*[@id=\"tab-content-58\"]/div/div[1]/md-content[1]/div[1]/student-card/md-card/md-card-title/md-card-title-text/div/button"));
        backToFrontOfCardButton.click();
    }

    public void clickAppIconOnCard(String appName) {
        String app = null;
        switch (appName) {
            case "Guides":
                app = "application-38";
                break;
            case "Ext. Asmt.":
                app = "application-33";
                break;
            case "Student Files":
                app = "application-20";
                break;
            case "Calendar":
                app = "application-27";
                break;
            case "Reports":
                app = "application-42";
                break;
            case "History":
                app = "application-43";
                break;
            case "Registration":
                app = "application-45";
                break;
            case "Classroom":
                app = "application-29";
                break;
            case "Student Forms":
                app = "application-47";
                break;
        }

        Browser.waitUntilElementIsVisible(By.className(app));
        WebElement appIcon = selenium.findElement(By.className(app));
        appIcon.click();
    }

    public void clickAppIconOnGrid(String appName){
        String app = null;
        switch (appName) {
            case "Guides":
                app = "Guides";
                break;
            case "Ext. Asmt.":
                app = "Ext. Asmt.";
                break;
            case "Student Files":
                app = "Student Files";
                break;
            case "Calendar":
                app = "Calendar";
                break;
            case "Reports":
                app = "Reports";
                break;
            case "History":
                app = "History";
                break;
            case "Registration":
                app = "Registration";
                break;
            case "Classroom":
                app = "Classroom";
                break;
            case "Student Forms":
                app = "Student Forms";
                break;
        }

        Browser.waitUntilElementIsVisible(By.name(app));
        WebElement appIcon = selenium.findElement(By.name(app));
        appIcon.click();
    }

    public void assertAppPage(String appHeaderTitle) throws Exception {
        Thread.sleep(3000);
        Browser.waitForElement( By.className("appTitle"));
        String appTitle = appTitleContainer.getText();
        System.out.println("Assert Application Header is: " + appTitle);
        Assert.assertEquals(appTitle, appHeaderTitle);
    }

    public void assertInfoBackOfCard(String classNameOnCard, String infoOnCard) throws Exception {
        Thread.sleep(1500);
        Browser.waitForElement( By.className(classNameOnCard));
        WebElement cardContant = getDriver().findElement(By.className(classNameOnCard));
        String info = cardContant.getText();
        System.out.println("Assert Card Content - " + classNameOnCard + " - is: " + info);
        Assert.assertEquals(info, infoOnCard);
    }

    public void assertChangePasswordDialog(String changePw) throws Exception {
        Thread.sleep(3000);
        Browser.waitForElement( By.xpath("/html/body/div[5]/md-dialog/form/md-toolbar/div/h2"));
        String dialogTitle = changePasswordDialog.getText();
        System.out.println("Assert Dialog Header is: " + dialogTitle);
        Assert.assertEquals(dialogTitle, changePw);
    }
}