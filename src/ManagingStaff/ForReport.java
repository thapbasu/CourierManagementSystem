
package ManagingStaff;
import java.io.File;
import java.util.Scanner;

public abstract class ForReport {
    int b = 50;
    public static int GetTotalusers()
    { 
        int count1 = 0,count2 =0;
    try {
      File file = new File("C:\\Java\\Register.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count1++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    try {
      File file = new File("C:\\Java\\DeliveryStaff\\Staffregister.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count2++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count1+count2;
      
    }
    public static int GetTotalCouriers()
    { 
        int count = 0;
       try {
      File file = new File("C:\\Java\\StoreAssignTask.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count; 
      
    }
    public static int GetTotalDelivery()
    { 
       int count = 0;
       try {
      File file = new File("C:\\Java\\DeliveryStaff\\AcceptTask.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count; 
    }
    
    
    public static int GetTotalManagingStaffs()
    { 
        int count = 0;
       try {
      File file = new File("C:\\Java\\register.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count; 
      
    }
    
     
    public static int GetTotalFeedbacks()
    { 
        int count = 0;
       try {
      File file = new File("C:\\Java\\DeliveryStaff\\Feedback.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count; 
      
    }
    
    
    public static int GetTotalDeliveryStaffs()
    { 
        int count = 0;
       try {
      File file = new File("C:\\Java\\DeliveryStaff\\Staffregister.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count; 
      
    }
    public static int GetTotalCancelledOrders()
    { 
       int count = 0;
       try {
      File file = new File("C:\\Java\\DeletedOrder.txt");

      Scanner sc = new Scanner(file);
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }

      // close scanner
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
    
      return count; 
    }
    
   
}
