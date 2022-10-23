package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexDiskPage {
    public WebDriver driver;
    public YandexDiskPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//span[@class='create-resource-popup-with-anchor']")
    public WebElement create;
    @FindBy(xpath = "//button[@aria-label='Папку']")
    public WebElement folder;
    @FindBy(xpath = "//form[@class='rename-dialog__rename-form']//input[@class='Textinput-Control']")
    public WebElement nameFolder;
    @FindBy(xpath = "//button[@aria-label='Отменить выделение']")
    public WebElement cancel;
    @FindBy(xpath = "//div[@aria-label='Файл для копирования.docx']")
    public WebElement file;
    @FindBy(xpath = "//button[@aria-label='Ещё']")
    public WebElement fileMore;
    @FindBy(xpath = "//div[@data-key='item-4']")
    public WebElement copyFileMore;
    @FindBy(xpath = "//div[@title='Test']")
    public WebElement copyInTest;
    @FindBy(xpath = "//div[@class='confirmation-dialog__footer']//button[@class='Button2 Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit ']")
    public WebElement copy;
    @FindBy(xpath = "//div[@aria-label='Test']")
    public WebElement clickFolderDouble;
    @FindBy(xpath = "//a[@aria-label='Аккаунт']")
    public WebElement account;
    @FindBy(xpath = "//a[@aria-label='Выйти из аккаунта']")
    public WebElement outAccount;
    public void createFolderAndCopyFileToThisFolder(){
        create.click();
        folder.click();
        nameFolder.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        nameFolder.sendKeys(Keys.BACK_SPACE);
        nameFolder.sendKeys("Test" + Keys.ENTER);
        cancel.click();
        file.click();
        fileMore.click();
        copyFileMore.click();
        copyInTest.click();
        copy.click();
    }
    public boolean openFolderAndCheckFile(){
        Actions actions = new Actions(driver);
        actions.doubleClick(clickFolderDouble).perform();
            return file.isDisplayed();
    }
    public void logOut(){
        account.click();
        outAccount.click();
    }
}