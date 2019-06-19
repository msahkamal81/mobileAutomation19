package homepage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends MobileAPI2 {

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    WebElement SignIn;

    @FindBy(id = "com.ebay.mobile:id/button_create_account")
    WebElement CREATEANACCOUNT;
    @FindBy(id = "com.ebay.mobile:id/button_google")
    WebElement CONTINUEWITHGOOGLE;

    public void SignIn(){
        SignIn.click();
    }
    public void CREATEANACCOUNT(){
        CREATEANACCOUNT.click();
    }
    public void CONTINUEWITHGOOGLE(){
        CONTINUEWITHGOOGLE.click();
    }




}
