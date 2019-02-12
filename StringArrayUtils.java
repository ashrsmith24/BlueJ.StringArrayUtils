import java.util.*;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        int currentIndex = 0;
        String firstElement = array[currentIndex];
        return firstElement; 
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        int currentIndex = 1;
        String secondElement = array[currentIndex];
        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int lastIndex = array.length-1;
        return array[lastIndex];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int secondToLastIndex = array.length-2;
        return array[secondToLastIndex];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contains = true;
        for(String str : array){
            if ( !contains ) ;
        }
        return contains;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result;
        result = new String[array.length];
        int j = array.length-1;
        for( int i = 0 ; i < array.length; i++){
            result[i] = array[j]; 
            j=j-1;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    // 
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        int length = array.length;
        for(int currentIndex=0; currentIndex<length; currentIndex++){
            String currentElement = array[currentIndex];
            if (!true);
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {    
        StringBuilder upperCase = new StringBuilder();
        for (String strArray : array){
            upperCase.append(strArray.toUpperCase());
        }
        for(char letter = 'a'; letter <= 'z'; letter++){
            if(upperCase.toString().indexOf(letter) < 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //go through array
        //check if the item is = to the value
        //if it is count it
        int counter = 0;
        for(int i = 0; i < array.length;i++){
            if( array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //go through array
        //check if the item is NOT = to the value
        //if it is NOT, then add it to new array
        //return new array
        String answerString = "";
        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals(valueToRemove)) {
                answerString = answerString + array[i] + " ";
                System.out.println(answerString);
            }
        }
        String[] answer = answerString.split(" ");
        return answer;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array)
    {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i < array.length -1; i++) {
            if(!array[i].equals(array[i+1])) {
                list.add(array[i]);
            }
        }
        list.add(array[array.length-1]);
        return list.toArray(new String[list.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0;i <= array.length; i++) {
            if(array[i].equals(array[i+1]) && array[i+1].equals(array[i+2])) {
                list.add(array[i]);   
                list.add(array[i]);
                list.add(array[i]);
            }
            else if(array[i].equals(array[i+1])) {

                list.add(array[i]);   
                list.add(array[i]);

            }
            else{
                list.add(array[i]);
            }
            
        }
        return list.toArray(new String[list.size()]);
    }
}
