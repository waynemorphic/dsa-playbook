class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hashset_t, hashset_s = {},{}
        
        m = len(list(s))
        n = len(list(t))
        
        if m != n:
            return False
        
        for i in range(m):
            hashset_s[s[i]] = 1 + hashset_s.get(s[i], 0)
            hashset_t[t[i]] = 1 + hashset_t.get(t[i], 0)
            
        for j in hashset_s:
            if hashset_s[j] != hashset_t.get(j, 0):
                return False
        return True
            