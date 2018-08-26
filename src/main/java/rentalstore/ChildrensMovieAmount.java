package rentalstore;

/**
 * @Auther: SUKA2
 * @Date: 8/26/2018 21:43
 * @Description:
 */
public class ChildrensMovieAmount implements  MovieAmount{

    public double getMovieThisAmount(int dayRented) {
        double thisAmount =0;
        thisAmount+=1.5;
        if(dayRented > 3){
            thisAmount += (dayRented -3)*1.5;
        }
        return thisAmount;
    }
}
