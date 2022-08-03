package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver){
        //Este metodo rebebe o objeto do webDriver para ser ultilizado, para nao instanciar um novo em cada pagina
        //e atribui a variavel driver
        this.driver = driver;
    }

    public void pausa(int tempo) throws InterruptedException {
        Thread.sleep(tempo);
    }

    public void acessarAplicacao(){

        // Maximizar pagina
        driver.manage().window().maximize();

        // Abrir o navegador no site espeficifico
        driver.get("https://qazando.com.br/curso.html");

        // Esepera o elemento ficar visivel no navegador
        esperarElementoEstarPresente(By.id("btn-ver-cursos"),10);


        // Valida se o botao id btn-ver-cursos esta ativo na tela
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {

        // Desce o scroll para o final da pagina
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 20000);");
        Thread.sleep(2000);
    }

    public void scrollUp(){

        // Subir o scroll para o inicio da pagina
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, -20000);");

    }

    public void preencherEmail(String email){

        // driver PESQUISA o elemento que tenha o id "email" e ENVIA UM SENDKEYS (texto) "thiagomilton.f"
        driver.findElement(By.id("email")).sendKeys(email);

    }

    public void clickGanharDesconto(){

        // driver PESQUISA o elemento que tenha o id "button" e CLICK nele
        driver.findElement(By.id("button")).click();
    }

    public void clickverCursos(){

        // Clica no botao ver cursos id ""btn-ver-cursos""
        driver.findElement(By.id("btn-ver-cursos")).click();
    }


    public void verificarCupomDesconto(){

        // driver PESQUISA o elemento por cssSelector (cssSelector pesquisa por id usando "#" ou classe usando "." por uma sequencia)
        // o id "cumpom" dentro dele a tag h2 e dentro dela span e traga o texto
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();

        // Validaçao do retorno do texto do botao, garantindo que seja o texto correto
        //Mensagem em caso de erro "O cupom esta errado", qual o texto que eu espero "QAZANDO15OFF", texto retornado na tela
        Assert.assertEquals("O cupom esta errado","QAZANDO15OFF",texto_cupom);
    }

    public void validarPaginaCuros(){

        //o id "cursos" dentro dele a tag "div" e dentro dela "p" e traga o texto
        String texto = driver.findElement(By.cssSelector("#cursos > div > p")).getText();

        //Mensagem em caso de erro "Pagina de cursos não identificadao", qual o texto que eu espero "valor retornado na
        // variavel texto", texto retornado na tela
        Assert.assertEquals("Pagina de cursos não identificada","Cursos",texto);
    }
}
