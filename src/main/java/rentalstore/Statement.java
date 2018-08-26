package rentalstore;

/**
 * @Auther: SUKA2
 * @Date: 8/25/2018 20:35
 * @Description:
 */
public class Statement extends StatementAbstract{

    String headerString(String customerName) {
        String result = "Rental Record for "
                + customerName + "\n";
        return result;
    }

    String eachRentalString(String movieTitle,double thisAmount) {
        String result = "\t"
                + movieTitle
                + "\t"
                + String.valueOf(thisAmount)
                + "\n";
        return result;
    }

    String footerString(double totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is "
                + String.valueOf(totalAmount)
                + "\n";
        result += "You earned "
                + String.valueOf(frequentRenterPoints)
                + " frequent renter points";
        return result;
    }
}
