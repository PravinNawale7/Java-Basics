import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (Character.isLetter(ch)) {
                boolean isVowel = false;
                for(char vowel : vowels) {
                    if(vowel == ch) {
                        isVowel = true;
                        break;
                    }
                }
                if(isVowel) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}


/* 
import java.util.Scanner;

public class CheckVowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 =  s1.toLowerCase();
        char[] a = {'a','e','i','o','u'};
        int count = 0;
        for(int i=0;i<s2.length();i++){
            for(char c : a){
                if(c==s2.charAt(i)){
                    count++;
                    break;
                }
            }
        }
        int consonant = s2.length()-count;
        System.out.println("Vowel are "+ count +"\n Consonant are "+consonant);
    }
    
}
*/
