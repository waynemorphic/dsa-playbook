# dsa-playbook
These are solutions to some questions I have been working on related to data structures and algorithms

## 1. Palindrome Number
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

** Example 1: **

Input: `x = 121`

Output: `true`

Explanation: 121 reads as 121 from left to right and from right to left.

** Example 2: **

Input: `x = -121`
Output: `false`
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

** Example 3: **

Input:` x = 10`
Output: `false`
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?

## 2. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


** Example 1: **

Input:` nums = [1,2,3,1]`

Output:` true`

** Example 2: **

Input: `nums = [1,2,3,4]`
Output: `false`

** Example 3: **

Input:` nums = [1,1,1,3,3,4,3,2,4,2]`
Output:` true`
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109