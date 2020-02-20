package EpamTask.Epam_CleanCode;

public class Constructioncost {
	

		public static double calculating_Construction_Cost(String standards, double Area, boolean automatedHome) {
			standards = standards.toLowerCase();
			if(standards.equals("standard")) {
				return Area*1200;
			}else if(standards.equals("above standard")) {
				return Area*1500;
			}else if(standards.equals("high standard") && !automatedHome) {
				return Area*1800;
			}else if(standards.equals("high standard") && automatedHome) {
				return Area*2500;
			}
			return 0;
		}
	
}
