import sys
sum_array = []
k = 1

for i in range(int(input())):
    a, b = map(int, sys.stdin.readline().split())
    sum = a+b
    sum_array.append(sum)

for j in sum_array:
    format_a = "Case #{}: {}".format(k,j)
    k = k + 1
    print(format_a)