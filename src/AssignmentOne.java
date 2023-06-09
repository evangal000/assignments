import javax.print.DocFlavor;
import java.util.*;

public class AssignmentOne {


    //Number Handling
    // This section will not use the string operations.

    //Program One
    // Write a program to check if number is prime or not.
    public static boolean isPrime(int a) {
        //According to number theory, a number p is prime if A*P != 0 (mod p)

        for(int i= 2; i < a ; i++){

            if( a % i == 0){
                return false;
            }
        }

        return true;
    }

    //Program Two
    // Check whether a number is Palindrome or not using iteration.
    public static boolean isPalindrome(int a) {
        // A number is palindrome if the digits are symmetrical.
        // EX:  1234321 -> Palindrome
        // EX:  1234 -> Not Palindrome

        //Solution: Note, a palindrome when flipped is the same number.
        // Therefore, we can test for equality.

        int reverse = 0;
        int forward = a;
        int length = 0;

        while ( a != 0){
            a = a / 10;
        length++;
        }

        a = forward;

        while( length !=0){

            reverse = (10 * reverse) + (a % 10);
            a = a / 10;
            length--;

        }

        System.out.println("Forward: " + forward + "Backward: " + reverse);
        if ( forward == reverse){
            return true;
        }else{
            return false;
        }

    }

    //Program Three
    //Write a program in Java to swap two numbers using third variable

    public static int swapNumber( int first, int second) {

        //Not really sure what this problem is asking for?

        int third = 0;

        third = first;
        first = second;
        second = third;

        return first;
    }

    //Program Four
    public static String getPrimeFactors(int number) {

        // Prime factors of 28 = 2,7

        //We use the helper function isprime.

        String output = "";

        for(int i = 2 ; i <= number ; i++){

            // test if divides.
            if( number % i == 0){
                //test if prime
                if( isPrime(i)){
                    output = output + " " + i;
                }
            }

        }

        return output;
    }

    //Program Five
    public static int reverseInteger(int number) {

        //EX: 1234 -> 4321
        //EX: 100 -> 001 -> 1
        // Note, we could have used this in the isPalindrome method.

        int reverse = 0;

        while( number != 0){

            reverse = (reverse * 10) + (number % 10);

            number /=10;

        }

        return reverse;
    }


    //String Handling
    //This section will use Strings.

    //Program One
    public static String removeChar(String word, char literal) {

        // "aabbccddee" & 'c' -> "aabbddee"

        String output = "";


        char[] arr = word.toCharArray();

        for(int i = 0; i< arr.length ; i++){

            if( arr[i] == literal){
                continue;
            }

            output = output + arr[i];

        }

        return output;
    }

    //Program Two
    public static int charCount(String word, char literal) {

        // "Hello World" & 'l' -> 3


        int output = 0;

        char[] arr = word.toCharArray();

        for(int i = 0; i< arr.length ; i++){

            if( arr[i] == literal){
                output++;
            }
        }

        return output;
    }

    //Program Three
    public static boolean isAnnagram(String word , String testcase) {

        // An annagram is where the words can be rearranged.
        // EX:  dare -> read
        //      read -> dear

        // We use the char count

        char[] wordone = word.toCharArray();

        for(int i = 0; i< wordone.length; i++){

            if(    charCount(word, wordone[i]) == charCount(testcase, wordone[i])   ){
                continue;
            }else{
                return false;
            }
        }

        return true;


    }

    //Program Four
    public static boolean isPalindrome(String word) {

        // aabbaa -> true
        // abcd -> false
        // race car -> false   NOTE in some definitions this is true.
        // This does method does not address sentence like input.

        StringBuilder sb = new StringBuilder(word);

        String reverse = sb.reverse().toString();

        if(word.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

    //Problem Five
    public static boolean isVowel(char literal) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I' , 'O', 'U'};

        for(char a : vowels){

            if(literal == a){
                return true;
            }

        }

        return false;
    }

    //problem Six
    public static boolean isDigit(char literal) {


        // There is a static method Character.isDigit available.
        // return Character.isDigit(literal);

        //However, we use do it manually.
        int[] digits = {0 ,1 ,2 ,3 , 4 ,5 ,6, 7, 8, 9 };

        for(int a : digits){

            if( Character.getNumericValue( literal ) == a){
                return true;
            }

        }

        return false;
    }

    //Problem Seven
    public static String removeVowels(String Word) {

        // We use the isVowel method above and traverse the String.

        String output = "";

        for( int i = 0 ; i< Word.length(); i++){

            if( isVowel(Word.charAt(i) ) ) {
                continue;
            }
            output+= Word.charAt(i);

        }
        return output;
    }

    //Problem Eight
    public static int[] characterStats(String word) {

        // This program counts the number of vowels and characters.
        // Note, this does not account for ' ' and assumes no special characters like .,@#$%

        int consonants = word.length();
        int vowel = 0;


        for(int i = 0 ; i < word.length(); i++){

            if(    isVowel(word.charAt(i) )   ){

                consonants--;
                vowel++;

            }


        }

        int[] output= {consonants, vowel};
        return output;
    }

    //Problem Nine
    public static char mostCharacter(String word) {

        // aabbccddd -> d
        // aabbcc -> a     NOTICE we choose the from alphabetical in event of tie.
        // We also assume its a word without spaces or special characters.

        //This assignment was given before we learned about collections.
        //In this instance, using a Set would be good to remove duplicates.

        //collect primitive characters
        HashSet<Character> charset = new HashSet<>();
        for(char a : word.toCharArray()){
            charset.add(a);
        }


        char largest = 'z';
        int record = 0;
        int count = 0;
        for(char a : charset){

            count = 0;

            for(char b : word.toCharArray()){
                if(a == b ){
                    count++;
                }

            }


            // Test to see if the largest count.
            if(count > record){
                record = count;
                largest = a;
                continue;

            }

            //Special Condition to hit equal count. Choose by alphabetical order
            if (count == record) {
                if (a < largest) {
                    largest = a;
                }
            }
        }

        return largest;
    }

    //Problem Ten
    public static String replaceVowelDash(String word) {

        // elephant -> -lephant
        // bread -> br-ad

        String output = "";

        for(int i = 0 ; i< word.toCharArray().length ; i++){
            if( isVowel(word.toCharArray()[i]) ){

                output = word.substring(0, i) + "-" + word.substring(i+1 , word.toCharArray().length);
                break;
            }
        }

        return output;
    }

    //Problem Eleven
    public static int[] countLiteral(String word) {

        // [Alphabet, Digits, Special Symbols]
        // Apple Pie -> [8,0,1]


        int[] output = new int[3];

        char[] arr = word.toCharArray();


        for(int i = 0 ; i< arr.length; i++){

            // I was going to use unicode and special logic.
            // However, these static methods should do the trick
            // in classifying the codes.
            if(Character.isDigit(arr[i])){
                output[1]++;
            }
            else if(Character.isLetter(arr[i])){

                output[0]++;

            }
            else{
                output[2]++;
            }
        }

        return output;
    }

    //Problem Twelve
    public static String removeBlank(String word) {

        // "Hello World -> HelloWorld

        //I could have traversed the string, but spliting then concatenating
        // felt more intuitive.

        String[] arr = word.split(" ");
        String output = "";

        for(String a : arr){
            output+= a;
        }

        return output;
    }

    //Problem Thirteen
    public static String removeDuplicate(String word) {

        // Hello World -> Helo Wrd
        // aabbccdd -> abcd

        String output = "";

        // This is another Collections angle that I am going to take.
        // Here we can use a Linked Hash Set.

        LinkedHashSet<Character> temp = new LinkedHashSet<>();

        // collect unique values in Order.
        for( char a : word.toCharArray()){
            temp.add(a);
        }

        // Build the string
        for(char a : temp){
            output+= a;
        }

        return output;
    }

        //Problem Fourteen
    public static int stringSum(String group) {

        // "1234 -> 1 + 2 + 3 + 4 -> 10

        char[] arr = group.toCharArray();

        int output = 0;

        for(char a : arr){

            output+= Character.getNumericValue(a);


        }

        return output;
    }


    //Problem Fifteen
    public static void uniqueCharacters(String word) {

        // Apple -> A p l e

        // We can use a HashSet and then calculate size.
        // However, we can do it by linear search.

        HashSet<Character> set = new HashSet<>();

        for(char a : word.toCharArray()){
            set.add(a);
        }

        for(char a : set){
            System.out.print(a + " " );
        }

        System.out.println();

    }

    //Problem Sixteen
    public static String ascendingString(String word) {

        // Apple Pie -> pplieePA


        char[] arr = word.toCharArray();

        for(int i = 0 ; i < arr.length; i++){
        }

        char temp = ' ';
        for(int i = 0 ; i < arr.length ; i++){

            for(int j = i+1 ; j < arr.length ; j++){

                if( arr[j] > arr[i]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }



        String output = "";
        for(char a : arr){
            output+= a;
        }
        return output;
    }

    //Problem Seventeen
    public static String descendingString(String word) {

        //To do the reverse, can flip it with string builder.

        StringBuilder sb = new StringBuilder( ascendingString(word)  );

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

    }

}

