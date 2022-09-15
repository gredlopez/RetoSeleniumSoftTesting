package com.google.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EsperaExplicitita {

    public void esperaesplicititaTexto(WebDriver driver, By elemento) { //sea vicible
        WebDriverWait myWaitVar = new WebDriverWait(driver, 3);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}