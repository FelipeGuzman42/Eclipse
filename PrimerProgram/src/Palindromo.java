import java.util.Scanner;

public class Palindromo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string to check");
        while(scanner.hasNextLine()){
            try{
                String text = scanner.nextLine();
                if(isPalindrome(text)){
                   System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }catch(Exception e){
                scanner.next();
            }
        }
        scanner.close();
    }

    public static boolean isPalindrome(String txt){
        boolean isIt = true;
        txt = txt.toLowerCase();
        for(int i = 0; i<txt.length()/2; i++){
            if(txt.charAt(i) != txt.charAt(txt.length() -1-i)){
                isIt = false;
                break;
            }
        }
        return isIt;
    }
}
