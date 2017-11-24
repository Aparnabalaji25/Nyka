package genrics;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class Utility {
	
		
	

	public static void getScreenshot(){
		try
		{
		SimpleDateFormat s=new SimpleDateFormat("DD-MM-YYYY-hh-mm-ss");
		String timestamp=s.format(new Date());
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(d);
		Robot r=new Robot();
		BufferedImage img=r.createScreenCapture(rect);
		File output=new File("./screenshots/"+timestamp+".png");
		ImageIO.write(img, "png", output);
		
		

	}
		catch(Exception e)
		{
			
		}
	}

}
