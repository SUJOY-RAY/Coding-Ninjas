from os import *
from sys import *
from collections import *
from math import *

def rowWaveForm(mat):
    result=[]
    for i in range (len(mat)):
        if (i%2==0):
            result.extend(mat[i])
        else:
            result.extend(mat[i][::-1])
    return result
    
    
