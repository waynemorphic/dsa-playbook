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
 

**Constraints**

`-231 <= x <= 231 - 1`
 

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
 

**Constraints**

`1 <= nums.length <= 105`

`-109 <= nums[i] <= 109`

## 3. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

Input:` s = "anagram", t = "nagaram"`

Output: `true`

**Example 2:**

Input: `s = "rat", t = "car"`

Output: `false`
 

**Constraints**

`1 <= s.length, t.length <= 5 * 104`

s and t consist of lowercase English letters.
 

*Follow up:* What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

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
 

**Constraints**

`1 <= nums.length <= 104`

`-104 < nums[i], target < 104`

All the integers in nums are unique.
`nums `is sorted in ascending order.

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

The first line contains an integer, `n`, the size of the array.
The second line contains `i` space-separated integers that describe .

**Constraints**

`0 < n <= 100`

`-100 <= arr[i] <= 100`

**Output Format**

Print the following  lines, each to 5 decimals:

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

## 8. Sparse Arrays
There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

**Example**

`strings = ['ab', 'ab', 'abc']`

`queries = ['ab', 'abc', 'bc']`

There are 2 instances of `'ab'`, 1 of `'abc'` and 0 of `'bc'`. For each query, add an element to the return array, `results = [2,1,0]`.

**Function Description**

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

- string strings[n] - an array of strings to search
- string queries[q] - an array of query strings

**Returns**

- int[q]: an array of results for each query

**Input Format**

The first line contains and integer `n`, the size of `strings[]`.
Each of the next `n` lines contains a string `strings[i]`.
The next line contains `q`, the size of `queries[]`.
Each of the next `q` lines contains a string `queries[i]`.

**Constraints**

`1 <= n <= 1000`

`1 <= q <= 1000`

`1 <= |strings[i]|, queries[i]| <= 20`


**Sample Input 1**

`4 aba baba aba xzxb`

`3 aba xzxb ab`

**Sample Output 1**

`2 1 0`

**Sample Input 2**

`3 def de fgh`

`3 de lmn fgh`

**Sample Output 2**

`1 0 1`

## 9. Lonely Integer
Given an array of integers, where all elements but one occur twice, find the unique element.

**Example**

`a = [1,2,3,4,3,2,1]`

The unique element is 4.

**Function Description**

Complete the lonelyinteger function in the editor below.

lonelyinteger has the following parameter(s):

- int a[n]: an array of integers

**Returns**

- int: the element that occurs only once

**Input Format**

The first line contains a single integer, `n`, the number of integers in the array.
The second line contains  space-separated integers that describe the values in `a`.

**Constraints**

- `1 <= n < 100`

- It is guaranteed that `n` is an odd number and that there is one unique element.

- `0<= a[i] <= 100` where `0 <= i n `

## 10. Diagonal Difference

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix `arr` is shown below:

- 1 2 3

- 4 5 6

- 9 8 9 

The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference is |15 - 17 = 2|.

**Function description**

Complete the *diagonalDifference* function in the editor below.

diagonalDifference takes the following parameter:

- int arr[n][m]: an array of integers

**Return**

- int: the absolute diagonal difference

**Input Format**

The first line contains a single integer, `n` , the number of rows and columns in the square matrix `arr`.
Each of the next `n` lines describes a row, `arr[i]`, and consists of `n` space-separated integers `arr[i][j]`.

**Constraints**

- `-100 <= arr[i][j] <= 100`

**Output Format**

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

**Sample Input**

`3`

`11 2 4`

`4 5 6`

`10 8 -12`

**Sample Output**

`15`

**Explanation**

The primary diagonal is:

    - 11

        - 5

            - 12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

                - 4        

            - 5

    - 10

Sum across the secondary diagonal: 4 + 5 + 10 = 19

Difference: |4 - 19| = 15

Note: |x| is the absolute value of x

## 11. Arithmetic Series
We use the integers a, b, and n to create the following series:

`(a + 2^0 * b),(a + 2^0 * + 2^1 * b),...,(a + 2^0 * b + 2^1 *b + ... + 2^n-1 * b)`

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

**Input Format**

The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.

**Constraints**

- `0 <= q <= 500`

- `0 <= a, b <= 50`

- `1 <= n <= 15`

**Output Format**

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

**Sample Input**

2

0 2 10

5 3 5

**Sample Output**

2 6 14 30 62 126 254 510 1022 2046

8 14 26 50 98

**Explanation**

We have two queries:

We use a = 0, b = 2, and n = 10 to produce some series s0, s1,..., sn-1:

- s0 = 0 + 1x2 = 2

- s1 = 0 + 1x2 + 2x2 = 6

- s2 = 0 + 1x2 + 2x2 +4x2 = 14

... and so on.

Once we hit n= 10, we print the first ten terms as a single line of space-separated integers.

We use a = 5, b =3, and n = 5 to produce some series s0, s1,..., sn-1:

- s0 = 5 + 1x3 = 8

- s1 = 5 + 1x3 + 2x3 = 14

- s2 = 5 + 1x3 + 2x3 + 4x3 = 26

- s3 = 5 + 1x3 + 2x3 + 4x3 + 8x3 = 50

- s4 = 5 + 1x3 + 2x3 + 4x3 + 8x3 + 16x3 = 98

We then print each element of our series as a single line of space-separated values.

## 12. Counting Sort

**Comparison Sorting**

Quicksort usually has a running time of n x log(n), but is there an algorithm that can sort even faster? In general, this is not possible. Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another. A comparison sort algorithm cannot beat n x log(n)(worst-case) running time, since n x log(n) represents the minimum number of comparisons needed to know where to place each element. For more details, you can see [these notes (PDF)](http://www.cs.cmu.edu/~avrim/451f11/lectures/lect0913.pdf).

**Alternative Sorting**

Another sorting method, the counting sort, does not require comparison. Instead, you create an integer array whose index range covers the entire range of values in your array to sort. Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array, printing the value of each non-zero valued index that number of times.

**Example**

`arr = [1,1,3,2,1]`

All of the values are in the range [0...3], so create an array of zeros, `resu;t = [0,0,0,0]`. The results of each iteration follow:

`i	arr[i]	result`

`0	    1	[0, 1, 0, 0]`

`1	    1	[0, 2, 0, 0]`

`2	    3	[0, 2, 0, 1]`

`3	    2	[0, 2, 1, 1]`

`4	    1	[0, 3, 1, 1]`

The frequency array is `[0,3,1,1]`. These values can be used to create the sorted array as well: `sorted = [1,1,1,2,3]`.

**Note**

For this exercise, always return a frequency array with 100 elements. The example above shows only the first 4 elements, the remainder being zeros.

**Challenge**

Given a list of integers, count and return the number of times each value appears as an array of integers.

**Function Description**

Complete the countingSort function in the editor below.

countingSort has the following parameter(s):

- arr[n]: an array of integers

**Returns**

- int[100]: a frequency array

**Input Format**

The first line contains an integer n, the number of items in arr.

Each of the next n lines contains an integer `arr[i]` where `0 <= i < n `.

**Constraints**

`100 <= n <= 10^6 `

`0 <= arr[i] < 100 `

**Sample Input**

100

63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33  

**Sample Output**

0 2 0 2 0 0 1 0 1 2 1 0 1 1 0 0 2 0 1 0 1 2 1 1 1 3 0 2 0 0 2 0 3 3 1 0 0 0 0 2 2 1 1 1 2 0 2 0 1 0 1 0 0 1 0 0 2 1 0 1 1 1 0 1 0 1 0 2 1 3 2 0 0 2 1 2 1 0 2 2 1 2 1 2 1 1 2 2 0 3 2 1 1 0 1 1 1 0 2 2 

**Explanation**

Each of the resulting values `result[i]` represents the number of times `i` appeared in `arr`.

## 13. Pangram
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either *pangram* or *not pangram* as appropriate.

**Example**

`s = "The quick brwn fox jumps over the lazy dog"`

The string contains all letters in the English alphabet, so return *pangram*.

**Function Description**

Complete the function pangrams in the editor below. It should return the string pangram if the input string is a *pangram*. Otherwise, it should return *not pangram*.

pangrams has the following parameter(s):

- string s: a string to test

**Returns**

- string: either pangram or not pangram

**Input Format**

A single line with string s.

**Constraints**

`0 < length of s <= 10^3`

Each character of `s, s[i] are elements of {a - z, A - Z, space}`, 

**Sample Input**

**Sample Input 0**

We promptly judged antique ivory buckles for the next prize

**Sample Output 0**

pangram

**Sample Explanation 0**

All of the letters of the alphabet are present in the string.

**Sample Input 1**

We promptly judged antique ivory buckles for the prize

**Sample Output 1**

not pangram

**Sample Explanation 0**

The string lacks an x.