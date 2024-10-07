package Ipsita_Maven.Maven_project_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GolfrmembersApplication {

	public static void main(String[] args) {
		try {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			//Create a new instance of the chromeDriver
		    WebDriver driver = new ChromeDriver();
		    ////Maximizes the browser window
			driver.manage().window().maximize();
	        driver.get("https://golfr.myjourney36.com/apps/view/Golfr-Member");
	        //login to the application page
	        WebElement uid = driver.findElement(By.xpath("//input[@id='username']"));
			uid.sendKeys("agwitdcuc9@yomail.info");
			WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
			pwd.sendKeys("App36#123");
		WebElement sub = driver.findElement(By.xpath("//button[@class='login_submit']"));
		 sub.click();
		 
		
		  //Go to My Societies page
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'My Societies')]"));
		   we.click();
		     
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
	    
	     //clicked on members
	      WebElement mem = driver.findElement(By.xpath("//li[contains(text(),'Members')]"));
	      mem.click();
	      System.out.println("clicked on members");
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
	     
		   driver.switchTo().defaultContent();
		   WebElement iframe3 = driver.findElement(By.xpath("//iframe[@src='https://golfr.myjourney36.com/pd/grids/viewer/66d03fbbf105200249511e4a?hideTopBand=true']"));
		   driver.switchTo().frame(iframe3);  
		   Thread.sleep(3000); 
		   
	      //clicked on upcoming events
	      WebElement Upcmgevents = driver.findElement(By.xpath("//li[contains(text(),'Upcoming Events')]"));
	      Upcmgevents.click();
	      System.out.println("clicked on upcoming events");
	      Thread.sleep(5000);
	      
	      //clicked on Past events
	      WebElement pastevents = driver.findElement(By.xpath("//li[contains(text(),'Past Events')]"));
	      pastevents.click();
	      System.out.println("clicked on past events");
	      Thread.sleep(5000);
	      
	      //click on close button
	      WebElement clsbtn = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      clsbtn.click();
	     driver.switchTo().defaultContent();
	     
	      //click on potential events
	      WebElement potevents = driver.findElement(By.xpath("//a[contains(text(), 'Potential Events')]"));
	      potevents.click();
	      Thread.sleep(3000);
	      System.out.println("Potential events page");
	      
	      //click on Booked events
	      WebElement bookevents = driver.findElement(By.xpath("//a[contains(text(), 'Booked Events')]"));
	      bookevents.click();
	      Thread.sleep(5000);
	      System.out.println("switched to booked events page");
	      //go to inside frame of booked events
	      WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@src='https://golfr.myjourney36.com/pd/grids/viewer/66eaf2fb863fae3dcff3a413?hideTopBand=true']"));
	      driver.switchTo().frame(iFrame2);
	      Thread.sleep(3000);
	     
	      
	      WebElement b1 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
	      b1.click();
	      Thread.sleep(3000);
	      
	      WebElement fbreak = driver.findElement(By.xpath("//div[contains(text(), 'Fees Breakdown')]"));
	      fbreak.click();
	      Thread.sleep(3000);
	      System.out.println("switched to feesbrakdown page");
	      Thread.sleep(3000);
	      
	      //click on close button
	      WebElement clsbtn2 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      clsbtn2.click();
	      Thread.sleep(2000);
	      
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
	      
	      //click on close button
	      WebElement clsbtn3 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      clsbtn3.click();
	      Thread.sleep(2000);
	      
	      //click on expand selection
	      WebElement sel1 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
	      sel1.click();
	      Thread.sleep(3000);
	      
	      //click on Rounds
	      WebElement rounds = driver.findElement(By.xpath("//div[contains(text(), 'Rounds')]"));
	      rounds.click();
	      System.out.println("switched to rounds page");
	      Thread.sleep(5000);
	      
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
	     
	      //click on close button
	      WebElement closeb3 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      closeb3.click();
	      Thread.sleep(2000);
	      
	      //click on expand button
	      WebElement b3 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
	      b3.click();
	     Thread.sleep(3000);
	     
	     //click on teetimes
	      WebElement teetimes = driver.findElement(By.xpath("//div[contains(text(), 'Tee Times')]"));
	      teetimes.click();
	      Thread.sleep(3000);
	      System.out.println("switched to teetimes page");
	      
	      //click on close button
	      WebElement closeb4 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      closeb4.click();
	      Thread.sleep(2000);
	      
	      //click on expand option
	      WebElement b4 = driver.findElement(By.xpath("//div[@class='styles_grid_row_icon_wrap__TuuON']"));
	      b4.click();
	      Thread.sleep(2000);
	      
	      //click on start round
	      WebElement startround = driver.findElement(By.xpath("//div[contains(text(), 'Start round')]"));
	      startround.click();
	      Thread.sleep(3000);
	      System.out.println("switched to start round page");
	      
	      //click on close button
	      WebElement clsbtn4 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      clsbtn4.click();
	      
	      driver.switchTo().defaultContent();
	      
	      //click on attended events
	      WebElement attndevents = driver.findElement(By.xpath("//a[contains(text(), 'Attended Events')]"));
	      attndevents.click();
	      Thread.sleep(3000);
	      System.out.println("switched to attended eventss page");
	    
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
	      
	      //click on close button
	      WebElement clsbtn5 = driver.findElement(By.xpath("//div[@class='styles_iframe_close_btn__BkgXH']"));
	      clsbtn5.click();
	      driver.switchTo().defaultContent();
	      
	      //click on Invitations
	      WebElement invite = driver.findElement(By.xpath("//a[contains(text(),'Invitations')]"));
	      invite.click();
	      Thread.sleep(3000);
	      System.out.println("switched to invitation page");
	      
	      //go to Dashboard page
	      WebElement dashboard =driver.findElement(By.xpath("//div[@class='appname']"));
	      dashboard.click();
	      System.out.println("switched to dashboard page");
	  
		}
catch( Exception e)
{
e.printStackTrace();
}finally {
}
	}

	}


