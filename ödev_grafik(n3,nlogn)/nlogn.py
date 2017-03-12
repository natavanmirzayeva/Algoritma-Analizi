import time
import numpy as np 



def find_max_triple(a,b,c):
    if a>b:
        if b>c:
            return a
        elif a>c:
            return a
        else:
            return c
    elif b>c:
        return b
    else:
        return c


def find_middle(list):
    middle=int(len(list)/2)
    
    sum_left_max=0
    sum_left=0
    for i in range(middle-1,-1,-1):
        sum_left=sum_left+list[i]
        if sum_left>sum_left_max:
            sum_left_max=sum_left
      
        
    sum_right_max=0
    sum_right=0
    for i in range(middle,len(list)):
        sum_right=sum_right+list[i]
        if sum_right>sum_right_max:
            sum_right_max=sum_right
    
    return sum_left_max+sum_right_max

def max_sub_sum_array(array):
    if(len(array)<2):
        return sum(array)
    else:
        middle=int(len(array)/2)
        sum_left=max_sub_sum_array(array[0:middle-1])
        sum_right=max_sub_sum_array(array[middle:])
        sum_middle=find_middle(array)
    return find_max_triple(sum_left,sum_right,sum_middle)


starttime = time.time()

myarray = np.arange(100)
result=max_sub_sum_array(myarray)
print(result)
endtime = time.time() 
print "This took %.5f seconds" % (endtime-starttime)

