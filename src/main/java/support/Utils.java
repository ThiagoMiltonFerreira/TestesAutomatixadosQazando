package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;


public class Utils extends RunCucumberTest {

    public void esperarElementoEstarPresente(By element, int tempo){

        // Recebe o driver do chome atual e o tempo em segundo que ira esperar o elemento ficar visivel
        WebDriverWait wait = new WebDriverWait(driver, tempo);

        // Esperar.ate (Recebe o elemento que deve esperar ficar visivel "espera uma condição.elementoficarvisivel(qual elemento)")
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
