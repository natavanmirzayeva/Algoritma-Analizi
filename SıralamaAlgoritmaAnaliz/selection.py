import random 
import time


def selectionSort(alist):
   for fillslot in range(len(alist)-1,0,-1):
       positionOfMax=0
       for location in range(1,fillslot+1):
           if alist[location]>alist[positionOfMax]:
               positionOfMax = location

       temp = alist[fillslot]
       alist[fillslot] = alist[positionOfMax]
       alist[positionOfMax] = temp

alist = [x for x in range(10000)]
random.shuffle(alist)


starttime = time.time()
selectionSort(alist)
endtime = time.time()
print(alist) 
print "This took %.5f seconds" % (endtime-starttime)

