class Solution:
    def containsDuplicate(self, nums):
        hashset = set()
        
        for i in nums:
            if i in hashset:
                return True
            hashset.add(i)
        return False
    
    print(containsDuplicate(True, [1,2,3,1]))
    print(containsDuplicate(False, [0,2,3,1]))