package tests;

import objects.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public void startUpTest()throws Exception{
        Browser.initialize();
    }

    @AfterClass
    public void endTest()throws Exception{
        Browser.Close();

    }
}
