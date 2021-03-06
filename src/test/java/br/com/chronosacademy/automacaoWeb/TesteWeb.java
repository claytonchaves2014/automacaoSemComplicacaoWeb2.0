package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
          }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();

        assertEquals("Porque Tempo É Conhecimento", titulo);
    }
    @Ignore
    @Test
    public void segundoTeste(){
        String xpathBotao = "//section[2]/div[3]//a";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();
        String xpathTítulo = "/html/body/div[1]/div/div/div/section[2]/div/div/div/div/div/section/div/div/div/div/div/div/div/h2";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTítulo));
        assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", h2Titulo.getText());
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }


}