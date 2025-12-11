package org.SimpleCodingQuestions.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for (int n : nums) {
            if (!set.add(n)) { //Try to add n into the set, If it already exists → add() returns false. We detect the duplicate instantly
                hasDuplicate = true;
                break;
            }
        }
        System.out.println(hasDuplicate);
    }
}

/*
🔍 Let’s compare both approaches
❌ The long (two-step) version
if (set.contains(n)) {
    hasDuplicate = true;
    break;
}
set.add(n);

Two operations:
contains()
add()
✔️ The short (one-step) version
if (!set.add(n)) {
    hasDuplicate = true;
    break;
}

One operation:
add()
Because add() internally checks if the element exists.

⭐ How add() works in a HashSet:
If the element is not present, it inserts it → returns true
If the element already exists, it doesn't insert → returns false

So this is why:
if (!set.add(n))
means:
👉 “If adding fails → duplicate found.”

📌 Example
Array:
[1, 2, 3, 2]
Iteration:
n	set before	set.add(n)	Result
1	{}	            true	added
2	{1}	            true	added
3	{1,2}	        true	added
2	{1,2,3}	        false❗ duplicate detected

🧠 Interview explanation (you can memorize this):
“I use set.add() because it returns false if the element already exists.
That lets me detect duplicates in one operation instead of calling both contains() and add().
It’s clean, efficient, and uses the behavior of HashSet effectively.”

 */