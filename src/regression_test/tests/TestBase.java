package tests;

import objects.Browser;
import org.junit.After;
import org.junit.Before;

public class TestBase {

    @Before
    public static void startUpTest()throws Exception{
        Browser.setBrowserOptions();
        Browser.initialize();
    }

    @After
    public static void endTest()throws Exception{
        Browser.close();
    }
}
