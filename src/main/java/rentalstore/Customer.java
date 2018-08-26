package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg){
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement(){
        StatementAbstract statement = new Statement();
        return getResult(statement);
    }


    public String htmlStatement(){
        StatementAbstract statement = new HtmlStatement();
        return getResult(statement);
    }

    private String getResult(StatementAbstract statement){
        Enumeration rentals = this.rentals.elements();
        statement.setRentals(rentals);
        statement.setCustomerName(getName());
        String result = statement.value();
        return result;
    }
}
