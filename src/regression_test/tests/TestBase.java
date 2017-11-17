package tests;

import objects.Browser;
import org.junit.After;
import org.junit.Before;

/**
 *  Purpose: In order for a Test Case to run with @Test Annotation,
 *  browser need to set up before each test and close after each test
 */

public class TestBase {

    @Before
    public void startUpTest()throws Exception{
        Browser.initialize();
    }

//    @After
//    public void endTest()throws Exception{
//        Browser.close();
//    }
}
