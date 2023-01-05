# dsa-playbook
These are solutions to some questions I have been working on related to data structures and algorithms

## 1. Palindrome Number
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

**Example 1:**

Input: `x = 121`

Output: `true`

Explanation: 121 reads as 121 from left to right and from right to left.

**Example 2:**

Input: `x = -121`
Output: `false`
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

**Example 3:**

Input:` x = 10`
Output: `false`
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?

## 2. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


**Example 1:**

Input:` nums = [1,2,3,1]`

Output:` true`

**Example 2:**

Input: `nums = [1,2,3,4]`
Output: `false`

**Example 3:**

Input:` nums = [1,1,1,3,3,4,3,2,4,2]`
Output:` true`
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

## 3. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

Input:` s = "anagram", t = "nagaram"`

Output: `true`

**Example 2:**

Input: `s = "rat", t = "car"`

Output: `false`
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## 4. Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**

Input:` nums = [-1,0,3,5,9,12], target = 9`

Output: `4`

Explanation: 9 exists in nums and its index is 4

**Example 2:**

Input: `nums = [-1,0,3,5,9,12], target = 2`

Output:` -1`

Explanation: 2 does not exist in nums so return -1
 

Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.

## 5. Plus Minus
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

*Note:* This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

**Example**
`arr = [1,1,0,-1-1]`

There are n = 5 elements, two positive, two negative and one zero. Their ratios are 2/5 = 0.400000, 2/5 = 0.400000 and 1/5 = 0.200000. Results are printed as:

`0.400000`

`0.400000`

`0.200000`

**Function Description**

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

- int arr[n]: an array of integers

**Print**
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

**Input Format**

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .

**Constraints**

`0 < n <= 100`
`-100 <= arr[i] <= 100`

**Output Format**

Print the following  lines, each to  decimals:

1. Proportion of positive values
2. Proportion of negative values
3. Proportion of zeros

## 6. Mini Max Sum
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

**Example**

`arr = [1,3,5,7,9]`

The minimum sum is 1 + 3 + 5 + 7 = 16 and the maximum sum is 3 + 5 + 7 + 9 = 24 . The function prints

`16 24`

**Function Description**

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

- arr: an array of  integers

**Print**

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

**Input Format**

A single line of five space-separated integers.

**Constraints**

`1 < = arr[i] <= 10^9`

**Output Format**

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

**Sample Input**

`1 2 3 4 5`

**Sample Output**

`10 14`

**Explanation**

The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five integers:

Sum everything except 1, the sum is 2 + 3 + 4 + 5 = 14.

Sum everything except 2, the sum is 1 + 3 + 4 + 5 = 13.

Sum everything except 3, the sum is 1 + 2 + 4 + 5 = 12.

Sum everything except 4, the sum is 1 + 2 + 3 + 5 = 11.

Sum everything except 5, the sum is 1 + 2 + 3 + 4 = 10.

## 7. Time Conversion
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

*Note*: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

**Example**
`s = "12:01:00PM"`

*Return* `'12:01:00'`.

`s = "12:01:00AM"`

*Return* `'00:01:00'`.

**Function Description**

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

- string s: a time in  hour format

**Returns**

- string: the time in  hour format

**Input Format**

A single string *s* that represents a time in 12-hour clock format (i.e.:hh:mm:ssAM or hh:mm:ssPM).

**Constraints**

- All input times are valid

**Sample Input**

`07:05:45PM`

**Sample Output**

`19:05:45`