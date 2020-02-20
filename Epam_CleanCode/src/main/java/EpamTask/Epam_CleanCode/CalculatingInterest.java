package EpamTask.Epam_CleanCode;


public final class CalculatingInterest {
	
	public static double simpleInterestCalculation(double principal_Amount, double timeperiod, double RateofIntersest) throws Exception {
		if(principal_Amount < 0 || timeperiod < 0 || RateofIntersest < 0)
			throw new Exception(" values should be negative");
		return (principal_Amount*timeperiod*RateofIntersest)/100;
	}
	
	public static double CompoundInterestCalculation(double principal_Amount, double timeperiod, double RateofIntersest) throws Exception {
		if(principal_Amount < 0 || timeperiod < 0 || RateofIntersest < 0)
			throw new Exception(" values should be negative");
		double compoundInterest = Math.floor(principal_Amount*Math.pow(1+(RateofIntersest/100.00), timeperiod));
		compoundInterest = compoundInterest - principal_Amount;
		return compoundInterest;
	}
}