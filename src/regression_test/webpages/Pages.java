package webpages;

import objects.Browser;
import objects.Report;
import org.openqa.selenium.support.PageFactory;

public class Pages {
    private static <T> T GetPage(Class<T> pageClass) throws IllegalAccessException, InstantiationException {
        T page = pageClass.newInstance();
        PageFactory.initElements( Browser.getDriver(), page );
        return page;
    }


    public static ReportPage getReportPage{
        return new ReportPage();
    }
}
