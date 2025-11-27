package org.SimpleCodingQuestionsRevision;

import java.util.HashSet;

public class RemoveDuplicatesInAString {
    public static void main(String [] args) {
        String str = "automation";
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()){
            if (!set.contains(c)){
                set.add(c);
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
/*
🎯 Key Notes for Interview
HashSet ensures O(1) lookup → efficient
Maintains first occurrence
Use StringBuilder to avoid creating new string every append
 */

/*
| Char | In Set? | Action       | Result  |
| ---- | ------- | ------------ | ------- |
| a    | No      | Add & append | a       |
| u    | No      | Add & append | au      |
| t    | No      | Add & append | aut     |
| o    | No      | Add & append | auto    |
| m    | No      | Add & append | autom   |
| a    | Yes     | Skip         | autom   |
| t    | Yes     | Skip         | autom   |
| i    | No      | Add & append | automi  |
| o    | Yes     | Skip         | automi  |
| n    | No      | Add & append | automin |
✅ Final Output → "autmin"
 */