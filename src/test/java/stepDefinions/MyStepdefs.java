package stepDefinions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.TestPage;
import utils.ConfigReader;
import utils.Driver;

import java.io.IOException;

import static utils.ReusableMethods.*;

public class MyStepdefs extends TestPage {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Navigate to the home page")
    public void navigateToTheHomePage() {
        Driver.getDriver().navigate().to("file:///C:/Users/zeynepsarkaya/Desktop/QE-index%20(3).html");
    }

    @And("Assert that both the email address and password inputs are present as well as the login button")
    public void assertThatBothTheEmailAddressAndPasswordInputsArePresentAsWellAsTheLoginButton() {


        Assert.assertTrue(email.isDisplayed());
        Assert.assertTrue(password.isDisplayed());


    }

    @And("Enter in an email address")
    public void enterInAnEmailAddress() {
        enterKeys(email, ConfigReader.getProperty("Email"));
    }

    @And("Enter in an password")
    public void enterInAnPassword() {
        enterKeys(password,ConfigReader.getProperty("Password"));
        waitFor(2);
    }


    @And("Close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }

    @When("In the test {int} div, assert that there are three values in the listgroup")
    public void inTheTestDivAssertThatThereAreThreeValuesInTheListgroup(int arg0) throws IOException {

        //waitFor(5);
        waitForVisibility(groupList,5);

        //waitFor(5);
        Assert.assertTrue(groupList.isDisplayed());
    }

    @Then("Assert that the second list item's value is set to List Item {int}")
    public void assertThatTheSecondListItemSValueIsSetToListItem(int arg0) {
        Assert.assertTrue(list2.isDisplayed());
    }

    @And("Assert that the second list item's badge value is {int}")
    public void assertThatTheSecondListItemSBadgeValueIs(int arg0) {
       Assert.assertTrue(listItemsValue6.isDisplayed());
        waitFor(2);
    }

    @When("In the Test {int} div, assert that {string} is the default selected value.")
    public void inTheTestDivAssertThatIsTheDefaultSelectedValue(int arg0, String arg1) {
        Assert.assertTrue(option1.isDisplayed());
    }

    @Then("Select {string} from the select list.")
    public void selectFromTheSelectList(String arg0) {
        option1.click();
        waitFor(2);
        option3.click();
    }

    @And("Assert that the selected value has changed to {string}.")
    public void assertThatTheSelectedValueHasChangedTo(String arg0) {
        getActions().scrollToElement(assertOption3).perform();
        waitFor(2);

        Assert.assertTrue(assertOption3.isDisplayed());
    }

    @When("In the {string} div, assert that the first button is enabled.")
    public void inTheDivAssertThatTheFirstButtonIsEnabled(String arg0) {
        Assert.assertTrue(buttonEnable.isEnabled());
    }

    @Then("Assert that the second button is disabled.")
    public void assertThatTheSecondButtonIsDisabled() {
        Assert.assertFalse(buttonDisable.isEnabled());
    }

    @When("In the {string} div, wait for a button to be displayed \\(with a random delay).")
    public void inTheDivWaitForAButtonToBeDisplayedWithARandomDelay(String arg0) {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //waitForVisibility(button5Test,9);
        waitForClickablility(button5Test,9);
    }


    @Then("Click the displayed button.")
    public void clickTheDisplayedButton() {
        button5Test.click();
    }

    @And("Assert that a success message is displayed.")
    public void assertThatASuccessMessageIsDisplayed() {
        waitFor(2);
        Assert.assertTrue(buttonMessage.isDisplayed());
    }

    @And("Assert that the button is now disabled.")
    public void assertThatTheButtonIsNowDisabled() {
        Assert.assertFalse(button5Test.isEnabled());
    }

    @When("Write a method to find the value of a cell on the grid.")
    public void writeAMethodToFindTheValueOfACellOnTheGrid() {
        class Grid {
            private int[][] grid;

            public Grid(int[][] grid) {
                this.grid = grid;
            }

            public int getCellValue(int row, int column) {
                if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length) {
                    // Cell is out of bounds
                    return -1; // or throw an exception, depending on your requirements
                }

                return grid[row][column];
            }
        }
    }

    @Then("Use the method to find the value of the cell at coordinates \\({int}, {int}).")
    public void useTheMethodToFindTheValueOfTheCellAtCoordinates(int arg0, int arg1) {
            int[][] myGrid = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            Grid grid = new Grid(myGrid);

            int value = grid.getCellValue(2, 2);
            System.out.println("Value: " + value); // Output: Value: 9
        }


    @And("Assert that the value of the cell is {string}.")
    public void assertThatTheValueOfTheCellIs(String arg0) {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Assert.assertTrue(ventosanzap.isDisplayed());
        waitFor(3);
    }
}
