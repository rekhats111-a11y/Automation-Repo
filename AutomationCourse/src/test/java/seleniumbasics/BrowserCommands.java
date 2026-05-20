package seleniumbasics;

public class BrowserCommands extends Base {
	public void verifyBrowserCommands() {
		String title = driver.getTitle();
		System.out.println(title);
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source=driver.getPageSource();
		System.out.println(source);
	}
   public void verifyNavigationCommand() {
	   driver.navigate().to("https://www.flipkart.com/");
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();
   }
	public static void main(String[] args) {
		BrowserCommands browser=new BrowserCommands();
		browser.browserLaunch();
		//browser.verifyBrowserCommands();
		browser.verifyNavigationCommand();

	}

}
