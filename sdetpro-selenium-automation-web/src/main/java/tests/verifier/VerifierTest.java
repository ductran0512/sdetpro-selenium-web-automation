package tests.verifier;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.BaseTest;
import tests.utils.Verifier;

public class VerifierTest extends BaseTest {

    // Hard Assertion
    @Test
    public void testHardAssertion() {
        driver.get("https://demowebshop.tricentis.com/");
        // Hard Assertion
        Assert.assertEquals("Teo", "Ti", "Displayed username is different");
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        // List is empty
        Assert.fail();
    }

    @Test
    public void testSoftAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 2);
        softAssert.assertTrue(true);
        softAssert.assertFalse(true);
        softAssert.fail("Failure");
        softAssert.assertAll();
    }
}
