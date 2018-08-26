package rentalstore;

/**
 * @Auther: SUKA2
 * @Date: 8/26/2018 21:38
 * @Description:
 */
public class NewReleaseMovieAmount implements MovieAmount{

    public double getMovieThisAmount(int dayRented) {
        double thisAmount =0;
        thisAmount+=dayRented*3;
        return thisAmount;
    }
}
