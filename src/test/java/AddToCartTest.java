import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddToCartTest extends TestBase
{

    public void startApplication() {

    }

    public void add7GoodsToCart(){
        startApplication();
        System.out.println("Find goods in catalog");
        System.out.println("Click 7 times");
    }

    public void calculationPriceInCart(){
        startApplication();
        System.out.println("Find different goods in catalog");
        System.out.println("Calculate");
    }

    @Test(groups = "unit")
    public void shouldReturnResultOfDivision(){
        assertEquals(Main.divide(15,3), 5, "Expecting result of division of 15 by 3");
    }

}

