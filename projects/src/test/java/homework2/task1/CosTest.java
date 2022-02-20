package homework2.task1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class CosTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] cosDataProviderDouble() {
        return new Object[][] {
                {-0.7055403255703919, 5.5},
                {0.7055403255703919, -5.5},
        };
    }

    @Test(dataProvider = "cosDataProviderDouble")
    public void cosDoubleTest(double expected, double param1) {
        Assert.assertEquals(expected, calculator.cos(param1));
    }
}