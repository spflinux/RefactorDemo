package rentalstore;

import java.util.Enumeration;

/**
 * @Auther: SUKA2
 * @Date: 8/25/2018 20:37
 * @Description:
 */
public abstract class StatementAbstract {

    protected Enumeration rentals;
    protected String CustomerName;

    public String value(){
        double totalAmount=0;
        int frequentRenterPoints=0;
        String result=headerString(CustomerName);
        while(rentals.hasMoreElements()){
            Rental each =(Rental)rentals.nextElement();
            double thisAmount=getThisAmount(each);
            frequentRenterPoints = addFrequentRenterPoints(frequentRenterPoints,each);
            result += eachRentalString(each.getMovie().getTitle(),thisAmount);
            totalAmount += thisAmount;
        }
        result +=footerString(totalAmount,frequentRenterPoints);
        return result;
    }

    protected double getThisAmount(Rental each){
        return MovieAmountFactory.getMovieAmount(each.getMovie().getPriceCode()).getMovieThisAmount(each.getDayRented());
    }

    protected int addFrequentRenterPoints (int frequentRenterPoints,Rental each){
        //add frequent renter points
        frequentRenterPoints ++;
        //add bonus for a two day new release rental
        if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1){
            frequentRenterPoints ++;
        }
        return frequentRenterPoints;
    }

    abstract String headerString(String customerName);

    abstract String eachRentalString(String movieTitle,double thisAmount);

    abstract String footerString(double totalAmount,int frequentRenterPoints);

    public Enumeration getRentals() {
        return rentals;
    }

    public void setRentals(Enumeration rentals) {
        this.rentals = rentals;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
