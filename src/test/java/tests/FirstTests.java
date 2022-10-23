package tests;

import org.junit.Test;
import pages.MailPage;
import pages.YandexDiskPage;

public class FirstTests extends Settings {
    @Test
    public void firstTest(){
        MailPage mailPage = new MailPage(driver);
        YandexDiskPage yandexDiskPage = new YandexDiskPage(driver);
        mailPage.authorization();
        mailPage.goToYandexDisk();
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
        yandexDiskPage.createFolderAndCopyFileToThisFolder();
        yandexDiskPage.openFolderAndCheckFile();
        yandexDiskPage.logOut();
    }
}