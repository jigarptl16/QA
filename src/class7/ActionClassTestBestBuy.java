package class7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTestBestBuy
{

	public static void main( String[] args ) throws InterruptedException
	{
		System.setProperty( "webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe" );

		FirefoxDriver driver = new FirefoxDriver();
		driver.get( "https://www.bestbuy.ca/en-ca" );

		driver.findElement( By.xpath( "//ul[@class='linkList_2-L96']/li[2]" ) ).click();

		WebElement brands = driver.findElement( By.xpath( "//div[@class='brandsContainer_1i5IO']/ul/li[2]" ) );
		Actions action = new Actions( driver );
		action.moveToElement( brands ).build().perform();

		//

		Thread.sleep( 1000 );

		List<WebElement> list = driver.findElements( By.xpath( "//ul[@data-automation='a-b-brands-list']/li" ) );
		System.out.println( list.size() );

		for ( WebElement webElement : list )
		{
			System.out.println( webElement.getText() );
		}

		for ( WebElement webElement : list )
		{
			if ( webElement.getText().equals( "Bose" ) )
			{
				webElement.findElement( By.tagName( "a" ) ).click();
				break;
			}

		}

	}

}
