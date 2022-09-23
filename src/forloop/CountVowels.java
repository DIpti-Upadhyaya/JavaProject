package forloop;

public class CountVowels {
    public static void calcVowels(String str){
String a;
a= str;
str= str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a'
                    || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u'){
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
        // display total count of vowels in string
        System.out.println("Total no of vowels in "+ "'" + a + "'"+ " are: "  + count);
    }
    public static void main(String[] args){
        calcVowels("India is the best");
        calcVowels("I love Java");
        calcVowels("My name is Dipti Upadhyaya");
    }
}

