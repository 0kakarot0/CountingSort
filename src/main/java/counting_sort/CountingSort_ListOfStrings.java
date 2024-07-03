package counting_sort;

import java.util.*;

public class CountingSort_ListOfStrings {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("zen");
        listOfStrings.add("apple");
        listOfStrings.add("ape");
        listOfStrings.add("bat");
        listOfStrings.add("ball");
        System.out.println("Original list: " + listOfStrings);

        int listSize = listOfStrings.size();
        int maxLength = Collections.max(listOfStrings, Comparator.comparing(String::length)).length();
        int maxCharValue = listOfStrings.stream().flatMapToInt(String::chars).max().orElse(0);

        for (int i = maxLength - 1; i >= 0; i--) {
            countingSortOfListOfString(listOfStrings, listSize, maxCharValue, i);
        }
        System.out.println("Sorted list: " + listOfStrings);
    }

    private static void countingSortOfListOfString(List<String> stringList, int listSize, int maxCharValue, int currentIndex) {

        int[] countArray = new int[maxCharValue + 1];
        String[] outputArray = new String[listSize];

        Arrays.fill(countArray, 0);

        // Add occurrence to the countArray
        for (String s : stringList) {
            int index = currentIndex < s.length() ? (int) s.charAt(currentIndex) : 0;
            countArray[index]++;
        }

        // Convert countArray to cumulative count
        for (int i = 1; i <= maxCharValue; i++) {
            countArray[i] += countArray[i - 1];
        }

        // Build the output array
        for (int i = listSize - 1; i >= 0; i--) {
            String s = stringList.get(i);
            int index = currentIndex < s.length() ? (int) s.charAt(currentIndex) : 0;
            outputArray[countArray[index] - 1] = s;
            countArray[index]--;
        }

        // Copy the output array to stringList
        for (int i = 0; i < listSize; i++) {
            stringList.set(i, outputArray[i]);
        }
    }
}
