package salesdata;

import java.util.*;

public class SalesData {
    private String item;
    private double price;
    private String date;
    
    public SalesData(String item, double price, String date) {
        this.item  = item;
        this.price = price;
        this.date  = date;
    }
    
    public String getItem() {
        return item;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getDate() {
        return date;
    }
    
    public static void findDataByDate(ArrayList<SalesData> salesDataList, String date) {
        
        System.out.println("Sales data for: " + date );
        
        for (SalesData sd : salesDataList) {
            if (sd.getDate().equals(date)) {
                System.out.println(sd.getItem() + " " + sd.getPrice());
            }    
        
        } // end of for
        
    } // end of method
    
    
    public static void findItemWithSmallestPrice(ArrayList<SalesData> salesDataList) {
        SalesData[] salesDataArray = new SalesData[salesDataList.size()]; // array allocated
        salesDataArray = salesDataList.toArray(salesDataArray); // sales data is loaded to an array
        
        double smallestPrice = salesDataArray[0].getPrice(); // assume smallest price
        SalesData salesDataObjWithSmallestPrice = salesDataArray[0];
        
        for (int i=1; i < salesDataArray.length; i++) {
            if (salesDataArray[i].getPrice() < smallestPrice) {
                smallestPrice = salesDataArray[i].getPrice();
                salesDataObjWithSmallestPrice = salesDataArray[i];
                
            } // end of if
        
        } // end of for
        
        System.out.println("\nData regarding item with smallest price: ");
        System.out.println(salesDataObjWithSmallestPrice.getItem()  + " " + 
                           salesDataObjWithSmallestPrice.getPrice() + " " +
                           salesDataObjWithSmallestPrice.getDate());
    
    
    
    } // end of findItemWithSmallestPrice()

} // end of SalesData