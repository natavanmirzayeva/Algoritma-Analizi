import random 
import time

def insertionSort(alist):
   for index in range(1,len(alist)):

     currentvalue = alist[index]
     position = index

     while position>0 and alist[position-1]>currentvalue:
         alist[position]=alist[position-1]
         position = position-1

     alist[position]=currentvalue

alist = [x for x in range(1000000)]
random.shuffle(alist)
starttime = time.time()
insertionSort(alist)
endtime = time.time()
print(alist) 
print "This took %.5f seconds" % (endtime-starttime)

