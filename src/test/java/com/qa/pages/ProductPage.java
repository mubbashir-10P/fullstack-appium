package com.qa.pages;

import com.qa.base.AppDriver;
import com.qa.base.AppFactory;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    public ProductPage(){
        super();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement productPageBanner;

    public String isProductPageVisible(){
        String actualResult = getText(productPageBanner, "Product Page Title Is: ");
        return actualResult;
    }
}
