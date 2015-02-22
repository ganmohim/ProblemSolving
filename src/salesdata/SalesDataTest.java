/**
 * This class shows how to read text file and process them based on user query
 * 
 * input:
   
   AirFilter 8.75 Jan-1-2015
   HeadLamp 36.59 Dec-25-2015
   AirFilter 8.75 Jan-10-2015
   SparkPlug 5.00 Jan-1-2015
   DiscPads 24.95 Dec-2-2014
   HeadLamp 3.00 Jan-1-2015
   
 * output:
   
   Sales data for: Jan-1-2015
   AirFilter 8.75
   SparkPlug 5.0
   HeadLamp 3.0
 * 
 * 
 *
 */

package salesdata;

import java.util.*;
import java.io.*;

public class SalesDataTest {
    
    public static void main(String[] args) throws IOException {
        String item, date;
        double price;
        
        ArrayList<SalesData> salesDataList = new ArrayList<SalesData>();
        
        FileReader fr = new FileReader("sales-data.txt");
    
        Scanner sc = new Scanner(fr);
        
        while (sc.hasNextLine()) {
            String salesData = sc.nextLine();
            
            Scanner lineScan = new Scanner(salesData);
            
            //while (lineScan.hasNext()) {
                item  = lineScan.next();
                price = lineScan.nextDouble();
                date = lineScan.next();
                
                SalesData salesObj = new SalesData(item, price, date);
                salesDataList.add(salesObj);
                
            
            //} // end of inner while
            
        } // end of outer while
        sc.close();
        
        
        SalesData.findDataByDate(salesDataList, "Jan-1-2015");
        SalesData.findItemWithSmallestPrice(salesDataList);
        
        
    
    } // end of main()

} // end of SalesData 