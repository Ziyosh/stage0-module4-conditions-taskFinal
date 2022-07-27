package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        firstSide = 1.0;
        secondSide = 4.0;
        thirdSide = 2.0;

        if((firstSide > 0) && (secondSide > 0) && (thirdSide > 0)){
            if (((firstSide + secondSide) > thirdSide)
                    && ((firstSide + thirdSide) > secondSide)
                    && ((secondSide + thirdSide) > firstSide)) {
                System.out.println("this is a valid triangle");
            } else {
                System.out.println("it's not a triangle");
            }
        }
    }
}
