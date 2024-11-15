// Computes an approximation of PI.
public class CalcPi {
	 
		public static void main(String[] args) { 
			int number = Integer.parseInt(args[0]);
			double myPi = 1.0000000;
			boolean result = true;
			double index=3;
			for (int i = 1; i < number; i++){
				if(result == true) {
					myPi= (float)myPi-(1/index);
					result = false;
				}
				else{
					myPi= (float)myPi+(1/index);
					result = true;
				}
				index= index+2;
			}
			System.out.println("pi according to Java: "+Math.PI);
			System.out.println("pi, approximated:     "+myPi*4);
	
		}
	
}
