package scripts;

import org.testng.annotations.Test;

import genrics.Excel;
import pom.BuyPage;

public class BuyTest extends BaseTest {
	@Test 
	public void testbuy()
	{
	  BuyPage bp=new BuyPage(driver);	
	  bp.clickonbuy();
	  String sheet="BuyTest";
	  String n1 = Excel.getcellvalue(PATH, sheet, 1, 0);
	  String no = Excel.getcellvalue(PATH, sheet, 1, 1);
	  String id = Excel.getcellvalue(PATH, sheet, 1, 2);
	  
	  bp.fillform(n1, no, id);
	}

}
