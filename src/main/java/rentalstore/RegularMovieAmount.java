package rentalstore;

/**
 * @Auther: SUKA2
 * @Date: 8/26/2018 21:41
 * @Description:
 */
public class RegularMovieAmount implements MovieAmount{
    public double getMovieThisAmount(int dayRented) {
        double thisAmount =0;
        thisAmount += 2;
        if(dayRented > 2){
            thisAmount+=(dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
