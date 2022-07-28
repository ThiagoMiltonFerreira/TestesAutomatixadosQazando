package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.RunCucumberTest;


public class DescontosStep extends RunCucumberTest {



    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando(){
        // Maximizar pagina
        driver.manage().window().maximize();

        // Abrir o navegador no site espeficifico
        driver.get("https://qazando.com.br/curso.html");

        // Valida se o botao id btn-ver-cursos esta ativo na tela
        Assert.assertEquals("Não acessou a aplicação",true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());


    }
    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {

        // Desce o scroll para o final da pagina
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 20000);");

        // Aguarda 2 segudos para executar a proxima ação
        Thread.sleep(2000);

        // driver PESQUISA o elemento que tenha o id "email" e ENVIA UM SENDKEYS (texto) "thiagomilton.f"
        driver.findElement(By.id("email")).sendKeys("thiagomilton.f@gmail.com");

    }

    @Quando("^clico em ganha cupom$")
    public void clico_em_ganha_cupom() {

        // driver PESQUISA o elemento que tenha o id "button" e CLICK nele
        driver.findElement(By.id("button")).click();

    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() throws InterruptedException {
        // driver PESQUISA o elemento por cssSelector (cssSelector pesquisa por id usando "#" ou classe usando "." por uma sequencia)
        // o id "cumpom" dentro dele a tag h2 e dentro dela span e traga o texto
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();

        // Validaçao do retorno do texto do botao, garantindo que seja o texto correto
        //Mensagem em caso de erro "O cupom esta errado", qual o texto que eu espero "QAZANDO15OFF", texto retornado na tela
        Assert.assertEquals("O cupom esta errado","QAZANDO15OFF",texto_cupom);

        // Aguarda 2 segudos para executar a proxima ação
        Thread.sleep(4000);


    }



}
