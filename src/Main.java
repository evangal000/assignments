public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(AssignmentOne.isPrime(11));
        System.out.println(AssignmentOne.isPrime(99));

        System.out.println(AssignmentOne.isPalindrome(123));
        System.out.println(AssignmentOne.isPalindrome(1221));

        int m = 1;
        int n = 0;
        System.out.println("(m,n) = "+ "(" + m + "," + n + ") and swapped is now " + "(" + AssignmentOne.swapNumber(m,n) + "," + AssignmentOne.swapNumber(n,m) + ")");

        System.out.println(AssignmentOne.getPrimeFactors(17));
        System.out.println(AssignmentOne.getPrimeFactors(210));

        System.out.println(AssignmentOne.reverseInteger(1235));
        System.out.println(AssignmentOne.reverseInteger(100));

        System.out.println(AssignmentOne.removeChar("aabbccddeeff" , 'c'));
        System.out.println(AssignmentOne.removeChar("Hello World" , 'l'));
        System.out.println(AssignmentOne.removeChar("Co        gent", ' '));

        System.out.println(AssignmentOne.charCount("Hello World", 'l'));
        System.out.println(AssignmentOne.charCount("One Two Three Four Five", ' '));

        System.out.println("Annagram");
        System.out.println(AssignmentOne.isAnnagram("dear", "read"));
        System.out.println(AssignmentOne.isAnnagram("floor" , "roflo" ));
        System.out.println(AssignmentOne.isAnnagram("baby", "yabe"));

        System.out.println("Palindrome");
        System.out.println(AssignmentOne.isPalindrome("aabbcc"));
        System.out.println(AssignmentOne.isPalindrome("aabbaa"));
        System.out.println(AssignmentOne.isPalindrome("race car"));

        System.out.println("isDigit");
        System.out.println(AssignmentOne.isDigit('a'));
        System.out.println(AssignmentOne.isDigit('7'));

        System.out.println("removeVowels");
        System.out.println(AssignmentOne.removeVowels("Elephants are awesome"));
        System.out.println(AssignmentOne.removeVowels("zzzzzxxxxxazzzzzssfddd"));

        System.out.println("CharacterStats: [Consonants, Vowels]");
        System.out.println("Elephant : " + "[" + AssignmentOne.characterStats("Elephant")[0] + "," + AssignmentOne.characterStats("Elephant")[1] + "]");
        System.out.println("vbfgrt : " + "[" + AssignmentOne.characterStats("vbfgrt")[0] + "," + AssignmentOne.characterStats("vbfgrt")[1] + "]");

        System.out.println("mostCharacter");
        System.out.println(AssignmentOne.mostCharacter("aabbccdd"));
        System.out.println(AssignmentOne.mostCharacter("Elephant"));
        System.out.println(AssignmentOne.mostCharacter("alligator"));
        System.out.println(AssignmentOne.mostCharacter("alligtor"));

        System.out.println("WordDash");
        System.out.println(AssignmentOne.replaceVowelDash("bbbfffedfdfdf"));
        System.out.println(AssignmentOne.replaceVowelDash("bread")) ;
        System.out.println(AssignmentOne.replaceVowelDash("elephant"));

        System.out.println("Count Literal: [Alphabet, Digits, Special Characters]");
        int[] x = AssignmentOne.countLiteral("Apple Pie");
        int[] y = AssignmentOne.countLiteral("1337 H@Xor");
        int[] z = AssignmentOne.countLiteral("ABC#$%123");
        System.out.println("Apple Pie: " + "[" + x[0] + "," + x[1] + "," + x[2] + "]");
        System.out.println("1337 H@Xor: " + "[" + y[0] + "," + y[1] + "," + y[2] + "]");
        System.out.println("ABC#$%123: " + "[" + z[0] + "," + z[1] + "," + z[2] + "]");



        System.out.println("Remove Blank");
        System.out.println(AssignmentOne.removeBlank("Hello World"));
        System.out.println(AssignmentOne.removeBlank("Apples are used to make Apple Pie"));
        System.out.println(AssignmentOne.removeBlank(" Orange Juice"));


        System.out.println("Remove Duplicates");
        System.out.println(AssignmentOne.removeDuplicate("Hello World"));
        System.out.println(AssignmentOne.removeDuplicate("Elephants are awesome"));

        System.out.println("GetSum");
        System.out.println(AssignmentOne.stringSum("1234"));
        System.out.println(AssignmentOne.stringSum("10101010101"));
        System.out.println(AssignmentOne.stringSum("111"));

        System.out.println("UniqueCharacters");
        AssignmentOne.uniqueCharacters("Elephant");
        AssignmentOne.uniqueCharacters("###$&%(!!@*(^%!%*(^!@#!(");
        AssignmentOne.uniqueCharacters( "11110000111010101010101020101010104000010011005102004210019");


        System.out.println("Ascending Order");
        System.out.println(AssignmentOne.ascendingString("Apple Pie"));
        System.out.println(AssignmentOne.ascendingString("Elephant"));
        System.out.println(AssignmentOne.ascendingString("1337 H@xor"));

        System.out.println("Descending Order");
        System.out.println(AssignmentOne.descendingString("Apple Pie"));
        System.out.println(AssignmentOne.descendingString("Elephant"));
        System.out.println(AssignmentOne.descendingString("1337 H@xor"));


        System.out.println("=================Assignment Two=================");
        System.out.println();
        System.out.println("\nExercise One: Sort Names:");
        /*
        String[] SortedNames = AssignmentTwo.AscendingName();
        for(String a : SortedNames) {
            System.out.print(a + " ");
        }


         */

        System.out.println("\nExercise Two: Sequential search");
        int[] firsttest =  {1 ,5 ,13 ,2 , 33 , 212 , 7 , 77};
        int[] secondtest = {34 ,23 ,99 ,11 , 212 , 5 , 1};
        System.out.println("Is 7 in [1 ,5 ,13 ,2 , 33, 212 , 7 , 77]? : " + AssignmentTwo.containsNum(7, firsttest));
        System.out.println("Is 7 in [34 ,23 ,99 ,11 , 212 , 5 , 1]? : " + AssignmentTwo.containsNum(7 ,  secondtest ));



        System.out.println("\nExercise Three: Student");
        Student st1 = new Student("actor", "Evan" , "200 hickory lane", "abc@yahoo.com");
        st1.getSummary();


        System.out.println("\nExercise Four: Employee.");
        Employee emp1 = new Manager();
        Employee emp2 = new Manager();
        System.out.println("This is the ID of the first Employee:\t" + emp1.getId());
        System.out.println("This is the ID of the second Employee:\t" + emp2.getId());

        System.out.println("\nExercise Five: Circle");
        Circle test = new Circle(24);
        System.out.println("Radius:\t" + test.getRadius());
        System.out.println("Area:\t" + test.getArea());

        System.out.println("\nExercise Six: Implementing abstract class");
        Employee emp3 = new Manager();
        System.out.println("Here is the job of the Employee: " + emp3.job());



    }
}