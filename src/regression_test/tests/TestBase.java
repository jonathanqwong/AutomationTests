package tests;

import objects.Browser;
import org.junit.After;
import org.junit.Before;

public class TestBase {
    @Before
    public void startUpTest()throws Exception{
        Browser.initialize();
    }

    @After
    public void endTest()throws Exception{
        Browser.close();
    }
}
