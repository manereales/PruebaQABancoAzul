package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.*;
import pages.GooglePage;

public class GoogleSteps{

    GooglePage google = new GooglePage();
    
    @Given("^Estoy en MagentoWeb$")
    public void navigate(){
        google.navigateToGoogle();  
    }

      @When("^click Create an Account$")
    public void ClickCreateN(){
      google.ClickCreate();
    }
     
    @Then("^rellenar campo First Name$")
     public void FirstName(){
      google.WriteFirsName();
    }
    
     @Then("^rellenar campo Last Name$")
    public void lastname(){
      google.wirteLastname();
    }

    @Then("^rellenar campo Email$")
    public void email(){
      google.WriteEmail();
    }

    @Then("^rellenar campo PastWord$")
    public void Password(){
      google.WritePassword();
    }

    @Then("^confirmar Password$")
    public void ConfirmarPassword(){
      google.WriteConfirmPassword();
    }

    @Then("^create acount$")
    public void ConfirmarCuenta(){
      google.ClickConfirm();
    }

    @Then("^clickList$")
    public void Clicklis(){
      google.clickList();
    }

    @Then("^lista$")
    public void lista(){
      google.lista();
    }

    @After("^cerrar$")
    public void tearDown() {
        GooglePage.closeBrowser();
    }

}