package models.components.global.footer;

import models.components.ComponentCSSSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// @ComponentCSSSelector("div[class*='information']")
@ComponentCSSSelector(".column.information")
public class InfomationColumnComponent extends FooterComlumnComponent{
    public InfomationColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
