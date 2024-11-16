package Task.September.Task30Sep2024.countVowel;

public class countVowel {
    public static void main(String[] args) {
        int v = 0, c = 0, d = 0, sp = 0;
        String line = "@ Suraj is learning automation testing from 01092024 @.";
        line.toLowerCase();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++v;
            } else if (ch >= 'a' && ch <= 'z') {// check if character is in between a to z
                ++c;
            }
            // check if character is in between 0 to 9
            else if (ch >= '0' && ch <= '9') {
                ++d;
            }

            // check if character is a white space
            else if (ch == ' ') {
                ++sp;
            }
        }
        //now we print outside of the for loop
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("White spaces: " + sp);
    }
}
