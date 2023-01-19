class Solution:
    def isPalindrome(self, x: int) -> bool:
        a = list(str(x))
        b = a[::-1]
        c = a[0:]
        
        if len(a) < 1:
            return True
        elif b == c:
            return True
        elif x * -1 == x:
            return False
        else:
            return False
        
# Testcases
    print(isPalindrome(121, 121))
    print(isPalindrome(122, 122))