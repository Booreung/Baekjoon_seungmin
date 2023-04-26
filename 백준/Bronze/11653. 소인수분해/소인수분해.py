N = int(input())

factor = 2
factor_array = []

while(N != 1):
    if(N % factor == 0):
        N = N // factor
        factor_array.append(factor)
    else:
        factor += 1
    
for i in factor_array:
    print(i)