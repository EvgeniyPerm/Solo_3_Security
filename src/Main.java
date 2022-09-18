import java.util.Scanner;

public class Main {
    public static final String MONEY = "$";
    public static final String GUARD = "G";
    public static final String THIEF = "T";
    public static final String FREE = "x";
    public static final String MSG_ALARM = "ALARM";
    public static final String MSG_QUIET = "quiet";

    public static boolean checkSecurity(String floor){
        int m = floor.indexOf(MONEY);
        int t = floor.indexOf(THIEF);
        if ((m==-1)||(t==-1)) return true;
        int start=Math.min(m,t);
        int finish=Math.max(m,t);
        for (int i = start; i < finish; i++) {
            if (floor.charAt(i)==GUARD.charAt(0))return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String floor = sc.nextLine();
        if (checkSecurity(floor)){
            System.out.println(MSG_QUIET);
        }
            else System.out.println(MSG_ALARM);


    }
}