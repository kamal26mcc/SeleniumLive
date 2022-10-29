package tableconsept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.AssignmentGenerics;

public class TableAutomationScenario extends AssignmentGenerics {

    WebDriver driver = null;

    public void getAllDataFromTable() {

        int i = 0;

        WebElement table = driver
            .findElement(By.xpath("//table[@class='table table-bordered table-hover mx-3']/tbody"));

        WebElement rows = table.findElement(By.tagName("tr"));

        for (WebElement row: rows) {

            i = i + 1;

            WebElement column = row.findElement(By.tagName("td"));

            for (WebElement cell: cells) {

                String value = cell.getText();

                System.out.println("Table Data");
                System.out.println(value + " ||");

            }

        }

    }

    public static void main(String[] args) {

        TableAutomationScenario obj = new TableAutomationScenario();
        obj.driver = obj.openBrowser("https://intellect.allthing.co.in/intellect/html_codes/webtable.html", "chrome");
        obj.getAllDataFromTable();

    }

}