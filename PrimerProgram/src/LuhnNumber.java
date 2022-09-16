import java.util.Scanner;

public class LuhnNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number to transform");
        while(scanner.hasNextLine()){
            try{
                String text = scanner.nextLine();
                System.out.println(LuhnNumber(text));
            }catch(Exception e){
                scanner.next();
            }
        }
        scanner.close();
    }

    public static String LuhnNumber(String numb){
        String ret = "";
        char[] num = numb.toCharArray();
        int N = 0, sum = 0;
        for(int i = num.length -1; i >= 0; i--){
            N = num[i] - '0';
            N = 2*N;
            if(N > 9){
                sum += N/10;
                sum += N%10;
                N = sum;
            }
            num[i] = (char)(N + '0');
            i--;
            sum = 0;
        }
        for(int i = 0; i<num.length; i++){
            sum += num[i] - '0';
        }
        N = 10 - sum%10;
        ret = numb + ""+N;
        return ret;
    }
}
