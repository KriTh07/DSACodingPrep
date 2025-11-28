package org.SimpleCodingQuestions.Arrays;
/**
**Boyer–Moore Voting Algorithm**:
Idea: We keep a candidate and a count. When count becomes 0 → pick a new candidate.
If current number equals candidate → count++, Else → count--
Why it works? Majority element will survive all cancellations.
 **/

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {3, 3, 4, 2, 3, 3};

        int count = 0;
        int candidate = 0;

        for(int num : arr){
            if (count == 0){
                candidate = num;
            }
        if (num == candidate){
            count++;
        }
        else{
            count--;
        }

        }
        System.out.println("Majority Element: " + candidate);
    }
}

/*
⭐ DRY RUN (must understand this!)
Array: [2,2,1,1,1,2,2]
num	 candidate	count	    Explanation
2	 2	            1	    pick 2
2	 2	            2	    same → count++
1	 2	            1	    different → count--
1	 2	            0	    different → count--
1	 1	            1	    count=0 → pick 1
2	 1	            0	    different → count--
2	 2	            1	    count=0 → pick 2

Final answer → 2.
 */