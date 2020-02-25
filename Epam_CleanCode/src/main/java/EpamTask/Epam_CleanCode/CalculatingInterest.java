package EpamTask.Epam_CleanCode;


public final class CalculatingInterest {
	
	public static double simpleInterestCalculation(double principal_Amount, double timeperiod, double RateofIntersest) throws Exception {
		if(principal_Amount < 0 || timeperiod < 0 || RateofIntersest < 0)
			throw new Exception(" values should not be negative ");
		return (principal_Amount*timeperiod*RateofIntersest)/100;
	}
	
	public static double CompoundInterestCalculation(double principal_Amount, double timeperiod, double RateofIntersest) throws Exception {
		if(principal_Amount < 0 || timeperiod < 0 || RateofIntersest < 0)
			throw new Exception(" values should not be negative");
		double compoundInterest = Math.floor(principal_Amount*Math.pow(1+(RateofIntersest/100.00), timeperiod));
		compoundInterest = compoundInterest - principal_Amount;
		return compoundInterest;
	}

	public static double calculateSimpleInterest(double principalAmount, double timeInYears, double annualRate) throws Exception {
		if(principalAmount < 0 || timeInYears < 0 || annualRate < 0)
			throw new Exception("Any of the principalAmount, timeInYears, annualRate values can't be negative");
		return (principalAmount*timeInYears*annualRate)/100;
	}

	public static double calculateCompoundInterest(double principalAmount, double timeInYears, double annualRate) throws Exception {
		if(principalAmount < 0 || timeInYears < 0 || annualRate < 0)
			throw new Exception("Any of the principalAmount, timeInYears, annualRate values can't be negative");
		double result = Math.floor(principalAmount*Math.pow(1+(annualRate/100.00), timeInYears));
		result -= principalAmount;
		return result;
	}
}