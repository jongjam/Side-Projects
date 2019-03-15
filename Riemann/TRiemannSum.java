public class TRiemannSum {
	
	public static final double INCREMENT = 1E-4;
	
	   public static void main(String[] args) {
		   //test x^2
	        System.out.println(integral(0, 2, x -> {
	            return Math.pow(x, 2);
	        }));
	    }
    
    public static double integral(double a, double b, Function function){
        double area = 0;
        double modifier = 1; //will equal 1 or -1 depending on whether the b > a or not(if b > a the integral is positive)

        if (a > b) {//this switches the values of the a and b values so only one forLoop/summation has to be performed
            double tempA = a;
            a = b;
            b = tempA;
            modifier = -1;
        }
        //trapezoidal sum
        for (double i = a + INCREMENT; i < b; i+=INCREMENT) {
        	double dFromA = i - a;
        	area += (INCREMENT / 2) * (function.f(a + dFromA) + function.f(a + dFromA - INCREMENT));
        }
        return (Math.round(area * 1000.0) / 1000.0) * modifier;
    }
    
}