package com.google.PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.google.com/webhp?authuser=2")

public class PaginaPrincipalPageObject extends PageObject {

    By inputgoogle = By.xpath("//input[@class='gLFyf gsfi']");
    By clickTxt= By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[1]");
    By btnCerrar= By.xpath("//div[@class='M2vV3 vOY7J']");


    public  By getInputgoogle( )
    {return inputgoogle;}

    public By getBtnCerrar() {
        return btnCerrar;
    }

    public By getClickTxt() {
        return clickTxt;
    }
}
