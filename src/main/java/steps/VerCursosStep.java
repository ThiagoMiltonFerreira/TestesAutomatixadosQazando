package steps;

import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumberTest;


public class VerCursosStep extends RunCucumberTest {

    @Quando("^eu clico no botão ver cursos$")
    public void eu_clico_no_botão_ver_cursos() throws InterruptedException {

        // Subir o scroll para o final da pagina
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, -20000);");


        // Aguarda 2 segudos para executar a proxima ação
        Thread.sleep(2000);

        // Clica no botao ver cursos id ""btn-ver-cursos""
        driver.findElement(By.id("btn-ver-cursos")).click();

        // Aguarda 2 segudos para executar a proxima ação
        Thread.sleep(2000);
    }

    @Entao("^sou direcionado para pagina de cursos disponiveis pela qazando$")
    public void sou_direcionado_para_pagina_de_cursos_disponiveis_pela_qazando(){

        //o id "cursos" dentro dele a tag "div" e dentro dela "p" e traga o texto
        String texto = driver.findElement(By.cssSelector("#cursos > div > p")).getText();

        //Mensagem em caso de erro "Pagina de cursos não identificadao", qual o texto que eu espero "valor retornado na
        // variavel texto", texto retornado na tela
        Assert.assertEquals("Pagina de cursos não identificada","Cursos",texto);

    }

}
