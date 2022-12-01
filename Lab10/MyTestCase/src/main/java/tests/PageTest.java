package tests;

import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    @Test
    public void addToFavourites(){
        mainPage.openPage();
        mainPage.addToFavourites();
    }
}
