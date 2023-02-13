package w2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
    	ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement((By.className("decorativeSubmit"))).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indira");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balachandran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Indhu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automationtesting");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the Product");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("indralaks87@gmail.com");
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sd = new Select(stateDD);
		sd.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement descriptionName = driver.findElement(By.id("updateLeadForm_description"));
		descriptionName.clear();
		descriptionName.sendKeys("Quality Check");
		descriptionName.clear();
		descriptionName.sendKeys("Bug Report");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Car Insurance");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is wrong");
		}
			//driver.close();
	
	}

}
