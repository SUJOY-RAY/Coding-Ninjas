def longestRepeatingSubstring(str: str, k: int) -> int:
    max_length=0
    max_count=0;
    char_count={}
    start=0
    for end in range (len(str)):
        char=str[end]
        char_count[char]=char_count.get(char,0)+1
        max_count=max(max_count,char_count[char])
        while(end-start+1-max_count)>k:
            left_char=str[start]
            char_count[left_char]-=1
            start+=1

        max_length=max(max_length,end-start+1)
    return max_length
