sign = True

sum_array = []

while(sign):
    a, b = map(int, input().split())
    if (a!=0 or b!= 0):
        sum = a + b
        sum_array.append(sum)

    else:
        sign = False

for j in sum_array:
    print(j)