package homework2.task1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class DivTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] divDataProviderLong() {
        return new Object[][] {
                {1, 2147483649L, 2147483648L},
                {1, -2147483649L, -2147483648L},
                {0, 0, 2147483648L},
        };
    }

    @DataProvider
    public Object[][] divDataProviderDouble() {
        return new Object[][] {
                {2.5, 5.5, 2.2},
                {-2.5, -5.5, 2.2},
                {0, 0, 5.5},
        };
    }

    @Test(dataProvider = "divDataProviderLong")
    public void testDivLong(long expected, long param1, long param2) {
        Assert.assertEquals(expected, calculator.div(param1, param2));
    }

    @Test(dataProvider = "divDataProviderDouble")
    public void testDivDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.div(param1, param2));
    }
}

