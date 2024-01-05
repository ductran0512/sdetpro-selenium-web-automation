package tests.order.computer;

import models.components.order.StandardComputerComponent;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test_data.ComputerData;
import test_data.DataObjectBuilder;
import test_flows.computer.OrderComputerFlow;
import tests.BaseTest;

public class BuyingStandardComputerTest extends BaseTest {

    @Test(dataProvider = "computerData")
    public void testStandardComputerBuying(ComputerData computerData){
        driver.get("https://demowebshop.tricentis.com/build-your-own-computer");
        OrderComputerFlow<StandardComputerComponent> orderComputerFlow =
                new OrderComputerFlow<>(driver, StandardComputerComponent.class, computerData);
        orderComputerFlow.buildCompSpec();
        orderComputerFlow.addItemToCart();
        orderComputerFlow.verifyShoppingCartPage();
    }

    @DataProvider()
    public ComputerData[] computerData() {
        String relativeDatFileLocation = "/src/main/java/test_data/StandardComputerDataList.json";
        return DataObjectBuilder.buildDataObjectFrom(relativeDatFileLocation, ComputerData[].class);
    }
}
