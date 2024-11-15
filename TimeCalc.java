public class TimeCalc {
public static void main(String[] args) {
    String time = args[0];
    int inputMin = Integer.parseInt(args[1]);  
    String[] parts = time.split(":");
    int hours = Integer.parseInt(parts[0]);
    int minutes = Integer.parseInt(parts[1]);
    int totalMin = (hours*60)+minutes+ inputMin ;
    int totalHours = totalMin / 60;
    int newMinutes = totalMin -(totalHours*60);
    int newHours = totalHours;
        while(newHours>=24){
            if(newHours==24){
                newHours =0;
                break;
            }
         newHours = totalHours%24;
        }
        if(newMinutes>9 && newHours>9){
                System.out.println(newHours+":"+newMinutes);
        }
        else if(newMinutes > 9 && newHours < 10){
            System.out.println("0"+newHours+":"+newMinutes);
        }
        else if(newMinutes <10  && newHours < 10){
            System.out.println("0"+newHours+":"+"0"+newMinutes);
        }
        else{
            System.out.println(newHours+":"+"0"+newMinutes);
        }
    

}
}
