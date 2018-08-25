package rentalstore;

/**
 * @Auther: SUKA2
 * @Date: 8/25/2018 20:37
 * @Description:
 */
public abstract class StatementAbstract {

    abstract String headerString(String customerName);

    abstract String eachRentalString(String movieTitle);

    abstract String footerString(double totalAmount,int frequentRenterPoints);
}
