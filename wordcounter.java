import java.util.Scanner;
public class wordcounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        int count = 0;
        int word = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                word++;
            }
            else{
                count++;
            }
        }
        System.out.println("Number of words in the string are: " + count);
        System.out.println("Number of characters in the string are: " + word);
    }
}
