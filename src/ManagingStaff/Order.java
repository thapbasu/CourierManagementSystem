
package ManagingStaff;


/**
 *
 * @author thapa
 */
public class Order extends UserDetails{
        private String OrderName;
        public Order(String id, String fname, String lname, String OrderName, String Number, String Address, String Email, String Date) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.OrderName = OrderName;
        this.Number = Number;
        this.Address = Address;
        this.Email = Email;
        this.Date = Date;
    }
    public Order(String data) {
        String[] dataArr = data.split(" ");
        this.id = dataArr[0];
        this.fname = dataArr[1];
        this.lname = dataArr[2];
        this.OrderName = dataArr[3];
        this.Number = dataArr[4];
        this.Address = dataArr[5];
        this.Email = dataArr[6];
        this.Date = dataArr[7];
    }


   
  

  public String getOrderName() {
        return OrderName;
    }

  public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }
  


    @Override
     public String toString(){
     return (id + " " + fname + " " + lname + " " + OrderName + " " + Number + " " + Address + " " + Email + " " + Date);
             }
}
