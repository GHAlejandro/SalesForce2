package com.Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class questions {
    private ChromeDriver driver;
    
    public void validarElementoExistente(String elemento){

        if (driver.findElement(By.xpath(elemento)).isDisplayed()) {
            System.out.println("Encontre el mensaje esperado  ");
        }else {

        }
}

   
}


