package org.ait.herokuapp.tests.elements;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.elements.BrokenImagesLinksPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesLinksTest extends TestBase {

    @BeforeMethod
    public void precondition() {
       new HomePage(driver).getElements();
    }

    @Test
    public void checkBrokenImages() {

        new BrokenImagesLinksPage(driver).checkBrokenImages();
    }
}
