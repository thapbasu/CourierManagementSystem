
package DeliveryStaff;


public class DeliveryOrder {
    private String id;
    private String fname,lname,Address,Email,Date,OrderName,Number;
    private String UID;
        public DeliveryOrder(String id, String fname, String lname, String OrderName, String Number, String Address, String Email, String Date) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.OrderName = OrderName;
        this.Number = Number;
        this.Address = Address;
        this.Email = Email;
        this.Date = Date;
        this.UID = UID;
    }
    public DeliveryOrder(String data) {
        String[] dataArr = data.split(" ");
        this.id = dataArr[0];
        this.fname = dataArr[1];
        this.lname = dataArr[2];
        this.OrderName = dataArr[3];
        this.Number = dataArr[4];
        this.Address = dataArr[5];
        this.Email = dataArr[6];
        this.Date = dataArr[7];
        this.UID = dataArr[8];
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

  
    @Override
     public String toString(){
     return (id + " " + fname + " " + lname + " " + OrderName + " " + Number + " " + Address + " " + Email + " " + Date + " " + UID);
             }
}
