package tests.demoQA;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DynamicProperties extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        super.setup();
        pages.demoQA.DynamicProperties.open();
    }

    @Test
    public void testButtonEnabledAfter(){
        pages.demoQA.DynamicProperties.clickButtonAfterEnabled();
    }

    @Test
    public void testAfterButtonColorChange(){
        pages.demoQA.DynamicProperties.clickButtonAfterColorChange();
    }
}
