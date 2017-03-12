import time
import numpy as np 

def maxSubSum1(myvector):
	maxSum=0
	for i in range((len(myvector))):

		for j in range(i,len(myvector)):
			thisSum=0
			for k in range (i,j):
				thisSum=thisSum+myarray[k]
			if (thisSum>maxSum):
				maxSum=thisSum
	return maxSum


myarray = np.arange(10000)
starttime = time.time()
print(maxSubSum1(myarray))
endtime = time.time() 
print "This took %.5f seconds" % (endtime-starttime)

