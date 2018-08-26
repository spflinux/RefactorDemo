package rentalstore;

/**
 * @Auther: SUKA2
 * @Date: 8/26/2018 21:54
 * @Description:
 */
public class HtmlStatement extends StatementAbstract{

    protected String headerString(String customerName) {
        String result = "<H1>Rentals for <EM>" + customerName + "</EM></H1><P>\n";
        return result;
    }


    protected String eachRentalString(String movieTitle, double thisAmount) {
        String result="";
        result  += movieTitle
                + ": "
                + String.valueOf(thisAmount)
                + "<BR>\n";
        return result;
    }

    protected String footerString(double totalAmount,int frequentRenterPoints) {
        String result = "";
        result  += "<P>You owe<EM>"
                + String.valueOf(totalAmount)
                + "</EM><P>\n"
                + "On this rental you earned <EM>"
                + String.valueOf(frequentRenterPoints)
                + "</EM> frequent renter points<P>";
        return result;
    }
}
