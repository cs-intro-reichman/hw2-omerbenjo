// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int number = Integer.parseInt(args[1]);
         int stringLenght = word.length();
         for (int i = 0; i < stringLenght; i++){
            char letter =  word.charAt(i);
            if (letter =='A'|| letter =='E'|| letter =='F'|| letter =='H'|| letter =='I'|| letter =='L'|| 
            letter =='M'|| letter =='N'|| letter =='O'|| 
            letter =='R'|| letter =='Q'|| letter=='S'||  letter =='X')  System.out.println("Give me an "+letter+": " +letter+"!");

            else System.out.println("Give me a  "+letter+": " +letter+"!");
         }
         System.out.println("What does that spell?");
            
            for (int i = 0; i < number; i++){
         System.out.println(word +"!!!");

         }     
        }
}
