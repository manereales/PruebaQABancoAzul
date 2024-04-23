package pages;

public class GooglePage extends BasePage {
    
   private String ClickCreateAccount = "((//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'][contains(.,'Create an Account')])[1])";
   private String searchTextField =  "//*[@id='firstname']";
   private String searchTextFieldLast = "//*[@id='lastname']";
   private String searchTextFieldPass = "//*[@id='password']";
   private String searchTextFieldConfirPass = "//*[@id='password-confirmation']";
   private String searchTextFieldEmail = "//*[@id='email_address']";
   private String clickConfirmAcount = "//*[@id='form-validate']/div/div[1]/button";
   private String clickList = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button";
   private String lista = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a";
    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://magento.softwaretestingboard.com");
    }

    public void ClickCreate(){
       clickElement(ClickCreateAccount);
    }

    public void WriteFirsName(){
        writeElement(searchTextField, "Manuel Alberto");
    }

    public void wirteLastname(){
        writeElement(searchTextFieldLast, "Reales Henriquez");
    }

    public void WriteEmail(){
        writeElement(searchTextFieldEmail, "pruebasban6@yahoo.es");
    }


    public void WritePassword(){
        writeElement(searchTextFieldPass, "Losbenitos1*");
    }

    public void WriteConfirmPassword(){
        writeElement(searchTextFieldConfirPass, "Losbenitos1*");
    }

    public void ClickConfirm(){
        clickElement(clickConfirmAcount);
    }

    public void clickList(){
        clickElement(clickList);
    }

    public void lista(){
        clickElement(lista);
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}