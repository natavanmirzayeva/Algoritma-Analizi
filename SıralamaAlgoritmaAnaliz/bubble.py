import random 
import time

def bubbleSort(alist):
    for passnum in range(len(alist)-1,0,-1):
        for i in range(passnum):
            if alist[i]>alist[i+1]:
                temp = alist[i]
                alist[i] = alist[i+1]
                alist[i+1] = temp

alist = [x for x in range(10000)]
random.shuffle(alist)


starttime = time.time()
bubbleSort(alist)
endtime = time.time()
print(alist) 
print "This took %.5f seconds" % (endtime-starttime)


