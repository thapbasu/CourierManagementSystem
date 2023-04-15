
package ManagingStaff;

/**
 *
 * @author thapa
 */
public class User {
    private String id;
    private String fname,lname,Address,Email,Password,Gender,Date;

    public User(String id, String fname, String lname, String Address, String Email, String Password, String Date,String Gender) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.Address = Address;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Date = Date;
    }
     public User(String data) {
        String[] dataArr = data.split(" ");
        this.id = dataArr[0];
        this.fname = dataArr[1];
        this.lname = dataArr[2];
        this.Address = dataArr[3];
        this.Email = dataArr[4];
        this.Password = dataArr[5];
        this.Date = dataArr[6];
        this.Gender = dataArr[7];
    }

       public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     public String getfname() {
        return fname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }
     public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
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
     public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
     public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
     public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
     
     @Override
    public String toString() {
        return (this.id + " " + this.fname + " " + this.lname + " " +this.Address + " " + this.Email + " " + Password + " " + Date + " " + Gender);
    }
}
