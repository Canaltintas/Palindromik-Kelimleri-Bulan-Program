import java.util.Scanner;

public class Main {
    static boolean isPalindrom(String str){
        int index=str.length()-1;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != str.charAt(index-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        str=input.nextLine();
        System.out.println(isPalindrom(str));
    }
}
