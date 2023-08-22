package com.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class utilidades {
    private ChromeDriver driver;
    public void cerrarVentanas (String selector) throws InterruptedException {

        Thread.sleep(15000);
        List<WebElement> elements = driver.findElements(By.xpath(selector));
        int tamano= elements.size();
        System.out.println("CANTIDAD DE VENTANAS ENCONTRADAS " +tamano);
        if (tamano > 0){
            for (WebElement element :elements ){
                element.click();
                System.out.println("voy en la iteracion ");
            }
        }else { System.out.println("CONTINUO YA QUE NO ENCONTRE PESTAÑAS");}
    }

    public void esperaImplicita (String selector) throws InterruptedException {

        WebDriverWait espera = new WebDriverWait(driver,  (30));
        espera.until(ExpectedConditions.elementToBeClickable(By.xpath(selector)));

    }
}
