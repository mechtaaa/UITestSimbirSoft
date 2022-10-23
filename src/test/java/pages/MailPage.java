package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
    public WebDriver driver;
    public MailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
@FindBy(xpath="//a[@class='home-link2 headline__personal-enter home-link2_color_black']")
    public WebElement inputMail;
@FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement login;
@FindBy(xpath = "//div[@class='passp-button passp-sign-in-button']")
    public WebElement loginButton;
@FindBy(xpath = "//input[@name='passwd']")
    public WebElement password;
@FindBy(xpath = "//div[@class='passp-button passp-sign-in-button']")
    public WebElement passwordButton;
@FindBy(xpath = "//input[@placeholder='найдётся всё']")
    public WebElement request;
@FindBy(xpath = "//span[@class='OrganicTitleContentSpan organic__title']")
    public WebElement yandexDisk;

    public void authorization(){
        inputMail.click();
        login.sendKeys("SimbirTest21");
        loginButton.click();
        password.sendKeys("21SimbirTest");
        passwordButton.click();
    }
    public void goToYandexDisk(){
        request.sendKeys("Яндекс.Диск"+ Keys.ENTER);
        yandexDisk.click();
    }
}