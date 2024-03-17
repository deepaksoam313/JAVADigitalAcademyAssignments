import java.util.Scanner;

/*
Write a Java program that performs the following operations on a given string:
● Count the number of vowels in the string.
● Count the number of consonants in the string.
● Replace all occurrences of a specific character with another character.
● Check if the string is a palindrome.

 */
public class Problem4 {

    public static void main(String[] args) {
        System.out.print("Enter the Input String = ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print("\nNo of vowels in the String = " + countVowels(str));
        System.out.print("\nNo of Consonants in the String = " + countConsonants(str));
        System.out.print("\nCheck if String is palindrome = " + isPalindrome(str));

    }

    private static Boolean isPalindrome(String str) {

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                continue;
            }
            else
                return true;
        }
        return false;
    }

    private static int countConsonants(String str) {
        int count = 0;
        str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                continue;
            else
                count++;
        }
        return count;
    }

    private static int countVowels(String str) {
        int count = 0;
        str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
        }
        return count;
    }
}
