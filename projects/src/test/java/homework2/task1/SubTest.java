package homework2.task1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;


public class SubTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] subDataProviderLong() {
        return new Object[][] {
                {2147483648L ,4294967297L , 2147483649L},
                {-2147483648L, -4294967297L, -2147483649L},
                {-2147483648L, 0, 2147483648L},
        };
    }

    @DataProvider
    public Object[][] subDataProviderDouble() {
        return new Object[][] {
                {3.3, 5.5, 2.2},
                {-3.3, -5.5, -2.2},
                {5.5, 5.5, 0},
        };
    }

    @Test(dataProvider = "subDataProviderLong")
    public void testSubLong(long expected, long param1, long param2) {
        Assert.assertEquals(expected, calculator.sub(param1, param2));
    }

    @Test(dataProvider = "subDataProviderDouble")
    public void testSubDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.sub(param1, param2));
    }
}
