// not complete -- in progress

package com.rmarion.variant.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ChartBuilder {
  public static void main(String[] args) {
    writeFile();
  }

  public static boolean isInteger(String s) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);

		 // this does nothing for the moment.
         // s is a valid integer

         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }

      return isValidInteger;
   }

  public static String pageBuilder(  ) {
	  String outStr = "<html>\r\n" +
	  		"<body>\r\n" +
			"<img src=\"VariantLogoSmallLight.png\">\r\n" +
	  		"<div align=\"center\">\r\n" +
	  		"    <canvas id=\"myCanvas\" style=\"background: white;\"></canvas>\r\n" +
	  		"    <legend for=\"myCanvas\"></legend>\r\n" +
	  		"    <script type=\"text/javascript\" src=\"script.js\"></script>\r\n" +
	  		"	<p>A/B Variant Results</p>\r\n" +
	  		"</div>\r\n" +
	  		"</body>\r\n" +
	  		"</html>";

	  return outStr;
  }

	// Hard-coded ALERT!!! Will change.
  public static boolean writeFile( ) {
		boolean isOk = true;
		String htmlString = pageBuilder( );
		WriteHTML myWriter = new WriteHTML();
		myWriter.createFile("C:\\Docs\\JavaDev\\variantChart.html", htmlString);
		return isOk;
	}

}



