import java.lang.Object;
public class Person {
    String first;
    String last;
    //public Person(){
    //}
    public Person (String first,String last){
        this.first = first;
        this.last = last;
    }
    public String getFirstName(){
        return first;
    }

    public void setFirstName(String first){
        this.first = first;
    }

    public String getLastName(){
        return last;
    }

    public void setLastName(String last){
        this.last = last;
    }
    public String toString(){
        return "Name: "+""+first+""+last;
    }
}
//customer
class Customer extends Person{
        String cn;

    public Customer(String first, String last, String cn){
    super (first,last);
    this.cn = cn;
        }

public String getCustomerNumber(){
        return cn;
}

public void setCustomerNumber(String cn){
        this.cn = cn;
}
    public String toString(){
        return super.toString()+ "\nCustomer no: "+ cn;

    }
        }
        //employee
        class Employee extends Person{
            //public static String getSsn;
            String ssn;
            public Employee(String first, String last, String ssn){
                super (first,last);
                this.ssn = ssn;
            }

            public String getSsn(){
                return "xxx-xx-"+ ssn;
            }

            public void setSsn(String ssn){
                this.ssn = ssn;
            }
            public String toString(){
                return super.toString()+ "\n SSN: "+ this.getSsn();

            }

        }
