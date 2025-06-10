import java.util.*;
public class EmailValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your email address?");
        String address = input.next();

        if (address.contains("@")) {
            int x = address.indexOf("@");
            String recipient = address.substring(0, x);
            String domainG = address.substring(x + 1);
            if (Character.isDigit(recipient.charAt(0)) || Character.isAlphabetic(recipient.charAt(0))) {
                if (Character.isDigit(recipient.charAt(x - 1)) || Character.isAlphabetic(recipient.charAt(x - 1))) {
                    if (!(domainG.contains("+")) && !(domainG.contains("?") || domainG.contains("$"))) {
                        int y = domainG.length();
                        String topDomain = domainG.substring(y - 4);
                        if (topDomain.contains(".com") || topDomain.contains(".net") || topDomain.contains(".org") || topDomain.contains(".edu")) {
                            System.out.println("Email address is valid.");
                        } else {
                            System.out.println("Invalid ending in top domain.");
                        }
                    } else {
                        System.out.println("Invalid character in domain name.");
                    }
                } else {
                    System.out.println("Invalid, uses non-number or letter in last character of recipient name.");
                }
            }
            else{
                    System.out.println("Invalid, uses non-number or letter in first character of recipient name.");
                }
            }
            else {
                System.out.println("Invalid, missing @");
            }
        }
    }


