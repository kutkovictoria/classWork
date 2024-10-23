import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.lang.ref.SoftReference;

import static org.testng.Assert.*;

public class AddToCartTest extends TestBase
{

    public void startApplication() {

    }

    @Test(priority = 1)
    public void add7GoodsToCart(){
        startApplication();
        System.out.println("Find goods in catalog");
        System.out.println("Click 7 times");
    }

    @Test(enabled = false)
    public void calculationPriceInCart(){
        startApplication();
        System.out.println("Find different goods in catalog");
        System.out.println("Calculate");
    }

    @Test(groups = "unit", dataProvider = "division results provider")
    public void shouldReturnResultOfDivision(int divided, int divider, int expectedResult){

        assertEquals(Main.divide(divided,divider), expectedResult,
                String.format("Expecting result of division of %d by %d = %d", divided, divider,expectedResult));
    }

   @DataProvider(name = "division results provider")
    public Object[][] provider(){
        return new Object[][]{
                {15, 3, 5},
                {10, 2, 8},
                {20, 2, 10}
        };
   }

}

