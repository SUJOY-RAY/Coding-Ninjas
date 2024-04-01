from os import *
from sys import *
from collections import *
from math import *

def missingNumber(arr, n):
    first=arr[0]
    last=arr[-1]
    if (first+last)%2:
        s=(n+1)//2
        s*=(first+last)
    else:
        s=(first+last)//2
        s*=(n+1)
    missing=s-sum(arr)
    return missing
