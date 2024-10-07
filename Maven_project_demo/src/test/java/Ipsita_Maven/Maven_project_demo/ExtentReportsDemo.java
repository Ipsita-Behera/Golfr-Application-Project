package Ipsita_Maven.Maven_project_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	//private static WebDriver driver = null;

	public static <ExtentHtmlReporter> void main(String[] args) throws Throwable {
		 // start reporters
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("GolfrMemberApp Search Test", "this is a test to validate GolfrMember App functionality");
        
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 test.log(Status.INFO, "Starting Test Case");
        driver.get("https://golfr.myjourney36.com/apps/view/Golfr-Member");
         test.pass("navigated to GolfrMember App");
         
        //login to the application page
        WebElement uid = driver.findElement(By.xpath("//input[@id='username']"));
		uid.sendKeys("agwitdcuc9@yomail.info");
		test.pass("Entered valid userid as the input");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("App36#123");
		test.pass("Entered valid password as the input");
		
	WebElement sub = driver.findElement(By.xpath("//button[@class='login_submit']"));
	 sub.click();
	 test.pass("Clicked on submit button");
	 
	 
	 //Go to My Societies page
	  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'My Societies')]"));
	   we.click();
	   test.pass("Clicked on My societies");
	   
	     
	   WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='https://golfr.myjourney36.com/pd/grids/viewer/66d03fbbf105200249511e4a?hideTopBand=true']"));
	   driver.switchTo().frame(iframe1);  
	  System.out.println("switched to new frame");
      
	  //click on edit button and redirects to profile page
     Thread.sleep(5000);
     WebElement le = driver.findElement(By.xpath("//div[@class='action_buttons_upfront']"));
     le.click();
     Thread.sleep(5000);
     System.out.println("clicked on edit button and redirect to the profile page");
     Thread.sleep(3000);
     test.pass("Clicked on edit button and redirects to profile page");
   
    //clicked on members
     WebElement mem = driver.findElement(By.xpath("//li[contains(text(),'Members')]"));
     mem.click();
     System.out.println("clicked on members");
     test.pass("Clicked on members page");
     Thread.sleep(3000);
   WebElement iframe2 = driver.findElement(By.xpath("//iframe[@name='grid_viewer_66fbf696fc72273f2557a740_2']"));
   driver.switchTo().frame(iframe2);
     Thread.sleep(3000);
     
     //click on expand option
     WebElement exp = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon__fVCRq styles_defaultRowIcon__Zyc6a ']"));
     exp.click();
     Thread.sleep(3000);
     WebElement profilep1 = driver.findElement(By.xpath("//div[contains(text(), 'Profile')]"));
     profilep1.click();
     Thread.sleep(5000);
     
     //click on close button
     WebElement closep1 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     closep1.click();
     Thread.sleep(3000);
     test.pass("Clicked on close button");
    
	   driver.switchTo().defaultContent();
	   WebElement iframe3 = driver.findElement(By.xpath("//iframe[@src='https://golfr.myjourney36.com/pd/grids/viewer/66d03fbbf105200249511e4a?hideTopBand=true']"));
	   driver.switchTo().frame(iframe3);  
	   Thread.sleep(3000); 
	   
     //clicked on upcoming events
     WebElement Upcmgevents = driver.findElement(By.xpath("//li[contains(text(),'Upcoming Events')]"));
     Upcmgevents.click();
     System.out.println("clicked on upcoming events");
     Thread.sleep(5000);
     test.pass("Clicked on upcoming events");
     
     //clicked on Past events
     WebElement pastevents = driver.findElement(By.xpath("//li[contains(text(),'Past Events')]"));
     pastevents.click();
     System.out.println("clicked on past events");
     Thread.sleep(5000);
     test.pass("Clicked on past events");
     
     //click on close button
     WebElement clsbtn = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     clsbtn.click();
     test.pass("Clicked on close button");
     
    driver.switchTo().defaultContent();
    
     //click on potential events
     WebElement potevents = driver.findElement(By.xpath("//a[contains(text(), 'Potential Events')]"));
     potevents.click();
     Thread.sleep(3000);
     System.out.println("Potential events page");
     test.pass("Clicked on Potential events page");
     
     //click on Booked events
     WebElement bookevents = driver.findElement(By.xpath("//a[contains(text(), 'Booked Events')]"));
     bookevents.click();
     Thread.sleep(5000);
     System.out.println("switched to booked events page");
     test.pass("Clicked on Booked events page");
     
     //go to inside frame of booked events
     WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@src='https://golfr.myjourney36.com/pd/grids/viewer/66eaf2fb863fae3dcff3a413?hideTopBand=true']"));
     driver.switchTo().frame(iFrame2);
     Thread.sleep(3000);
    
     //click on expand button
     WebElement b1 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     b1.click();
     Thread.sleep(3000);
     
     WebElement fbreak = driver.findElement(By.xpath("//div[contains(text(), 'Fees Breakdown')]"));
     fbreak.click();
     Thread.sleep(3000);
     System.out.println("switched to feesbrakdown page");
     Thread.sleep(3000);
     test.pass("Clicked on feesbreakdown page");
     
     
     //click on close button
     WebElement clsbtn2 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     clsbtn2.click();
     Thread.sleep(2000);
     test.pass("Clicked on close button");
     
     //click on expand selection
     WebElement sel = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     sel.click();
     Thread.sleep(3000);
     
     //click on check In
     WebElement checkin = driver.findElement(By.xpath("//div[contains(text(), 'Check In')]"));
     checkin.click();
     Thread.sleep(3000);
     System.out.println("switched to checkin page");
     Thread.sleep(3000);
     test.pass("Clicked on checkin page");
     
     //click on close button
     WebElement clsbtn3 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     clsbtn3.click();
     Thread.sleep(2000);
     test.pass("Clicked on close button");
     
     //click on expand selection
     WebElement sel1 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     sel1.click();
     Thread.sleep(3000);
     
     //click on Rounds
     WebElement rounds = driver.findElement(By.xpath("//div[contains(text(), 'Rounds')]"));
     rounds.click();
     System.out.println("switched to rounds page");
     Thread.sleep(5000);
     test.pass("Clicked on rounds page");
     
     //click all the inside options of rounds by switching to frames inside it
    WebElement iframe4 = driver.findElement(By.xpath("//iframe[@name='grid_viewer_66fc2ff26c39fc47efa27d03_62']"));
  driver.switchTo().frame(iframe4);
  System.out.println("switched to iframe4");
   Thread.sleep(3000);
   
     //click on expand selection
     WebElement b2 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     b2.click();
     Thread.sleep(3000);
     System.out.println("expanded option");
     
     WebElement teams = driver.findElement(By.xpath("//div[contains(text(), 'Teams')]"));
     teams.click();
     Thread.sleep(3000);
     System.out.println("switched to teams page");
    test.pass("Clicked on teams page");
     //click on close button
     WebElement closeb3 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     closeb3.click();
     Thread.sleep(2000);
     test.pass("Clicked on close button");
     
     //click on expand button
     WebElement b3 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     b3.click();
    Thread.sleep(3000);
    
    //click on teetimes
     WebElement teetimes = driver.findElement(By.xpath("//div[contains(text(), 'Tee Times')]"));
     teetimes.click();
     Thread.sleep(3000);
     System.out.println("switched to teetimes page");
     test.pass("Clicked on teetimes page");
     
     //click on close button
     WebElement closeb4 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     closeb4.click();
     Thread.sleep(2000);
     test.pass("Clicked on close button");
     
     //click on expand option
     WebElement b4 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     b4.click();
     Thread.sleep(2000);
     
     //click on start round
     WebElement startround = driver.findElement(By.xpath("//div[contains(text(), 'Start round')]"));
     startround.click();
     Thread.sleep(3000);
     System.out.println("switched to start round page");
     test.pass("clicked on start round page");
     
     //click on close button
     WebElement clsbtn4 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     clsbtn4.click();
     test.pass("Clicked on close button");
     
     driver.switchTo().defaultContent();
     
     //click on attended events
     WebElement attndevents = driver.findElement(By.xpath("//a[contains(text(), 'Attended Events')]"));
     attndevents.click();
     Thread.sleep(3000);
     System.out.println("switched to attended events page");
     test.pass("Clicked on attended events page");
     
     WebElement iframe5 = driver.findElement(By.xpath("//iframe[@src='https://golfr.myjourney36.com/pd/grids/viewer/66f19ebc3c2cc6b19a78eafc?hideTopBand=true']"));
     driver.switchTo().frame(iframe5);
     Thread.sleep(3000);
     
     //expand the page
     WebElement sel3 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
     sel3.click();
     Thread.sleep(3000);
     
     //click on My Score
     WebElement myscore = driver.findElement(By.xpath("//div[contains(text(),'My score')]"));
     myscore.click();
     Thread.sleep(5000);
     System.out.println("switched to my score page");
     test.pass("Clicked on my score page");
     
     //click on close button
     WebElement clsbtn5 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
     clsbtn5.click();
     driver.switchTo().defaultContent();
     test.pass("Clicked on close button");
     
     //click on Invitations
     WebElement invite = driver.findElement(By.xpath("//a[contains(text(),'Invitations')]"));
     invite.click();
     Thread.sleep(3000);
     System.out.println("switched to invitation page");
     test.pass("Clicked on invitation page");
     
     //go to Dashboard page
     WebElement dashboard =driver.findElement(By.xpath("//div[@class='appname']"));
     dashboard.click();
     System.out.println("switched to dashboard page");
     test.pass("Clicked on the applogo to be redirected to the dashboard page");
     
     test.info("Test ompleted");
  // calling flush writes everything to the log file
          extent.flush();
	}
}




