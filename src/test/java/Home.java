import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

    private WebDriver driver;

    // Campo pesquisa
    By campoPesquisa = By.cssSelector("#blog > div.page-wrap > div.site-header.container-fluid.woo-heading > div > div > div.header-search-widget > div.head-form.hidden-xs > div > form > input.header-search-input");

    // Botão pesquisa
    By botaoPesquisa = By.cssSelector("#blog > div.page-wrap > div.site-header.container-fluid.woo-heading > div > div > div.header-search-widget > div.head-form.hidden-xs > div > form > button");


    // Inserir nome de produto que quero pesquisar
    public void insereNomeProdutoCampoPesquisa (String nomeDoProdutoParaBuscar){
        driver.findElement(campoPesquisa).sendKeys(nomeDoProdutoParaBuscar);
    }


    // Clicar no botão pesquisa para realizar açao
    public void clicaBotaoPesquisa () {
        driver.findElement(botaoPesquisa).click();
    }


    // CONSTRUTOR!
    public Home (WebDriver driver) {
        this.driver = driver;
    }


}
