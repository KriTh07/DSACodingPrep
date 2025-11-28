package org.SimpleCodingQuestions.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Input: Two arrays → e.g. nums1 = [1,2,2,3], nums2 = [2,2]
 * Output: All unique elements common in both arrays. Output should not contain duplicates.
 * Example output: [2]
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        int[] arr1  = {1, 2, 2, 3};
        int[] arr2 = {2, 2};

        // Step 1: Put all elements of arr1 into a HashSet
        Set<Integer> set1 = new HashSet<>();
        for (int n : arr1){
            set1.add(n);
        }
        // Step 2: Check arr2 against set1 and collect intersections
        Set<Integer> resultSet = new HashSet<>();
        for (int n : arr2){
            if(set1.contains(n)) {
                resultSet.add(n); // Set ensures unique values
            }
        }
        //If question only says “find intersection” → print the Set. Ignore Step 3 & 4
        // System.out.println(resultSet);

        // Step 3: Convert set to array. This is required only when the question says “return array”
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int val : resultSet) {
            result[i++] = val;
        }
        // Step 4: Print result
        System.out.println(Arrays.toString(result));


    }
}
/*
⭐ Interview Tip:
 We are using Set<Integer> set = new HashSet<>(); because it follows coding-to-interface and allows us to
 easily switch implementations.
*/

/*
⭐ Why we prefer Set<Integer> set = new HashSet<>();
✔ More flexible
Because tomorrow if you want to switch to TreeSet or LinkedHashSet, you don’t have to change the variable type.
Example: Set<Integer> set = new TreeSet<>();
Only the right side changes.
But if your variable is declared as HashSet:
HashSet<Integer> set = new TreeSet<>(); // ❌ NOT ALLOWED
You cannot assign a different implementation.

⭐ Why abstraction is better?
Because we usually code to interfaces, not implementations.
Interfaces: List, Set, Map
Implementations: ArrayList, HashSet, HashMap, etc.
This makes your code:
More generic, Easier to test, Easier to replace implementations, Cleaner

📌 So how does the system behave?
Both create a HashSet internally. Both allow you to use .add(), .contains(), etc.

Runtime behavior = Same
Performance = Same

Difference is how you declare it.
 */
