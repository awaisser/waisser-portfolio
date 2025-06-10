import java.util.*;
public class BrokenTypewriter {
    public static void main(String[] args) {
    String x = retypeBadly(getInputFromUser());
    System.out.println(x);
    }

    public static String getInputFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter for me to type badly");
        return input.next();
    }

    public static String retypeBadly(String userString) {
        int third = 0;
        String dot = ".";
        for (int count = 0; count < userString.length(); count++) {
            if (userString.charAt(count) == 'A') {
                userString = userString.replace("A", "4");
            }
            if (userString.charAt(count) == 'a') {
                userString = userString.replace("a", "4");
            }
            if (userString.charAt(count) == 'O') {
                userString = userString.replace("O", "0");
            }
            if (userString.charAt(count) == 'o') {
                userString = userString.replace("o", "0");
            }
            if (((int)userString.charAt(count) >=78 && (int)userString.charAt(count)<=90)||
                    ((int)userString.charAt(count) >=110 && (int)userString.charAt(count)<=122)) {
                third++;
                if (third%3==0){
                    userString=userString.substring(0,count+1) + dot + userString.substring(count+1);
                    third=0;
                }
            }
        }
        return userString;
    }
}

