package impl;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.AdminPage;
import utils.ConfigReader;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AdminImpl {


    AdminPage page = new AdminPage();



    public AdminPage getPage() {
        if(page == null){
            page = new AdminPage();
        }
        return page;
    }

    //this method checks if each role and department has a count
    public boolean countForRolesAndDepartments() throws InterruptedException {
        Thread.sleep(1000);

        for (WebElement each : page.countsForRolesAndDepartments) {
            //checking if each role or department has a number
            if (each.findElement(By.xpath(".")).getText().equals("")) {
                return false;
            }

        }
        return true;
    }

    //this method attempts to delete roles and departments if they're assigned to an employee
    public boolean deleteRoleOrDepartment() throws InterruptedException {

        Thread.sleep(1000);

        for (int i = 0; i < page.deleteBtns.size(); i++) {

            //attempting to delete roles and departments if they are assigned to at least 1 employee
            if (!page.countsForRolesAndDepartments.get(i).getText().equals("0)")) {

                page.deleteBtns.get(i).click();

                try {
                    //if the warning message pops up it means we were unable to delete
                    page.deleteBtnsWarning.click();
                } catch (NoSuchElementException e) {
                    /*if we successfully deleted role or department the element with warning message would never pop up
                    and we'd get NoSuchElementException trying to locate that element.
                    At that point this method will return true and Assertion will fail
                     */
                    return true;
                }
            }
        }
        return false;
    }

    public void navigateToLoginPage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }


    Map<String, String> userFieldInputsMap = new LinkedHashMap<>();

    public void fillInputField(String inputFieldName, String value){
        switch (inputFieldName){
            case "ID": getPage().Id.sendKeys(value);
                break;
            case "firstname": getPage().FirstName.sendKeys(value);
                break;
            case "lastname": getPage().LastName.sendKeys(value);
                break;
            case "Selecrole":
                SeleniumUtils.selectByVisibleText(getPage().SelectRole, value);
                break;
            case "Selecdepartment":
                SeleniumUtils.selectByVisibleText(getPage().SelectDepartment, value);
                break;
            default:
                System.out.println("Field name was not found...");
        }
        userFieldInputsMap.put(inputFieldName, value);
    }

    public String verifyEachUserFields(){
        String result = "success";
        List<WebElement> allTds = getPage().userTableRows.findElements(By.xpath("//tbody//tr"));

        for(int i = 0; i<allTds.size(); i++){
            System.out.println(allTds.get(i).getText());
        }
        for(String eachField: userFieldInputsMap.keySet()){
            boolean missing = true;
            for(int i = 0; i < allTds.size(); i++){
                if(allTds.get(i).getText().contains(userFieldInputsMap.get(eachField))){
                    missing = false;
                    break;
                }
            }
            if (missing)
                result = "fail";
        }
        return result;
    }


}
