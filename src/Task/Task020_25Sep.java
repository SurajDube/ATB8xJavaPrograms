package Task;

public class Task020_25Sep {
    public static void main(String[] args) {
        //Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
        int count = 0;
        String str = "Suraj Kumar Dubey";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
            }// end of if condition

        }// end of for loop
        System.out.println(
                "Total no of vowels in string are: " + count);
    }
}
