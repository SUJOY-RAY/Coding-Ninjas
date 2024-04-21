from os import *
from sys import *
from collections import *
from math import *

from typing import *

def digitProduct(n: int) -> int:

    factors=[]
    for i in range(9,1,-1):
        while n%i==0:
            factors.append(i)
            n//=i
    if n>1:
        return -1
    
    factors.sort()
    return int(''.join(map(str,factors)))
