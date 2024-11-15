public class Collatz {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		String letter = args[1];
		int currentNumber ;
		int counter = 1;
		if("v".equals(letter)){
			for (int i = 0; i < number; i++) {
				currentNumber=i+1;
				String numberString ="";
				do{
				     if(currentNumber % 2 == 0) {
						currentNumber /=2;
						numberString += currentNumber +" ";
					}
					else{
						currentNumber = currentNumber*3 +1;
						numberString += currentNumber +" ";
					}
					counter ++;
				}while(currentNumber != 1);
				currentNumber =i+1;
				System.out.println(currentNumber+" "+numberString+ "("+counter +")");
				counter = 1;
			}
			System.out.println("Every one of the first " + number+" hailstone sequences reached 1.");
		}
		
			
		 else if("c".equals(letter)){
			for (int i = 0; i < number; i++) {
				currentNumber=i+1;
				do{
					if(currentNumber % 2 == 0) currentNumber /=2;
				   else currentNumber = currentNumber*3 +1;
			   }while(currentNumber != 1);
			}
			System.out.println("Every one of the first " + number+" hailstone sequences reached 1.");
		}
			
		}

	}