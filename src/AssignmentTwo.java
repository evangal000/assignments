import java.util.NavigableMap;
import java.util.Scanner;

public class AssignmentTwo {

    //Exercise One: Implementing Array.
    public static String[] AscendingName(){

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];


        try {

            System.out.println("Please Give 5 names:");
            for (int i = 0; i < 5; i++) {

                String input = sc.nextLine();

                if(input.contains(" ")){

                    System.out.println("Please no spaces. Try Again:");
                    i--;
                    continue;
                }

                names[i] = input;

            }

        }catch(RuntimeException e){
                System.out.println("Error Giving Names.");
                e.printStackTrace();

            }

        for(String a : names){
            System.out.println(a);
        }

        // Find the largest name so we can never overflow th


        //The algorithm to sort the Strings.

        String temp = "";
        for(int i = names.length; i > 0;  i--){



            for(int k = 0; k< i -1 ; k++){

                char[] first = names[k].toCharArray();
                char[] second = names[k+1].toCharArray();

                if(first.length<= second.length) {

                    for (int j = 0; j < first.length; j++) {


                        if (first[j] == second[j]) {

                            // Characters are Equal. Skip to next
                            continue;
                        }

                        // Word one is larger than word two.
                        if (first[j] < second[j]) {
                            temp = names[k];
                            names[k] = names[k + 1];
                            names[k + 1] = temp;

                        } else {
                            // The words are properly sorted.
                            // Skip to next grouping
                            break;

                        }
                    }
                }else{
                    // Case where the second array is longer
                    for (int j = 0; j < second.length; j++) {


                        if (first[j] == second[j]) {

                            // Characters are Equal. Skip to next
                            continue;
                        }

                        // Word one is larger than word two.
                        if (first[j] < second[j]) {
                            temp = names[k];
                            names[k] = names[k + 1];
                            names[k + 1] = temp;

                        } else {
                            // The words are properly sorted.
                            // Skip to next grouping
                            break;

                        }
                    }

                }

            }

        }

        /*
        for(String a : names){
            System.out.print(" " + a);
        }


         */

        String[] output = new String[names.length];
        for(int i = 0 ; i < output.length; i++){
            output[i] = names[output.length - (i+1)];
        }

//        System.out.println();
//      for(String a : output){
//            System.out.print(" " + a);
//        }

        return output;

    }




    //Use Sequntial Search
    public static boolean containsNum(int key, int[] array ){

        // Sequential search is linear search.
        for(int a : array){

            if( a == key){
                return true;
            }
        }

        return false;

    }



}
