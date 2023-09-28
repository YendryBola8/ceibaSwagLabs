package org.example.actions;

import org.example.locators.ProductSwagLabsLocatores;
import org.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class ProductSwagLabsActions {

    ProductSwagLabsLocatores productSwagLabsLocatores = null;

    public ProductSwagLabsActions(){
        this.productSwagLabsLocatores = new ProductSwagLabsLocatores();
        PageFactory.initElements(HelperClass.getDriver(), productSwagLabsLocatores);
    }

    public void click_any_product(){
        Random random = new Random();
        int numberRandom = random.nextInt(6);

        switch(numberRandom) {
            case 0:
                productSwagLabsLocatores.btnBackpack.click();
                break;
            case 1:
                productSwagLabsLocatores.btnBikeLight.click();
                break;
            case 2:
                productSwagLabsLocatores.btnBoltTShirt.click();
                break;
            case 3:
                productSwagLabsLocatores.btnFleeceJacket.click();
                break;
            case 4:
                productSwagLabsLocatores.btnOnesie.click();
                break;
            default:
                productSwagLabsLocatores.btnTShirRed.click();
        }
    }

    public void click_cart(){
        productSwagLabsLocatores.btnCart.click();
    }

}
