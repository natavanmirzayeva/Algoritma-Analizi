class Vec:
    def_init_(self,labels,function)
    	self.D=labels
        self.f=function

def zero_vec(D):
    return Vec(D,{})
def setitem(v,d,val):
    v.f[d]=val
def getitem(v,d):
    if d in v.f:
        return v.f[d]
    else:
        return 0
def scalar_mul(v,alpha)
	return Vec(V.d,{d:alpha*getitem(v,d) for d in v.D})
def add(u,v):
	return Vec(v.D,{d:alpha*getitem(v,d) for d in u.D})

def neg(v):
    return scalar_mul(v,-1)

def printVec(v_1)
	for d in v_1.D:
        if d in v_1.f:
            print(d,v_1.f{d})
            
            
    v_1 = Vec({'A','B','C'}, {'A':1,'B':1,'C':1})
    printVec(v_1)
