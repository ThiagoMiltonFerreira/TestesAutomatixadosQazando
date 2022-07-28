package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        // vamos informar informaçoes do relatorio do cucumber
        plugin = {},
        //Caminho onde esta os BDDs
        features = "src/main/resources/features",
        // Tudo que nao tiver esta tag sera executado
        tags = {"~@ignore"},
        glue ={"steps"}

)
public class RunCucumberTest {

    //Instaciando o selenium com drive do chorme (o drive foi adicionado arrastando o arquivo para a raiz do projeto chormedriver.exe)
    //WebDriver driver = new ChromeDriver();

    public static WebDriver driver;

    @BeforeClass // Esta anotação faz que antes de inciar o teste execute esta classe
    public static void start(){

        driver = new ChromeDriver();
    }

    @AfterClass // Esta anotação faz que depois de inciar o teste execute esta classe
    public static void stop(){
        // Fecha o navegador
        driver.quit();
    }

}
