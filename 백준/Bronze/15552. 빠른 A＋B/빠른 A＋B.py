import sys
sum_array = []

for i in range(int(input())):
    a, b = map(int, sys.stdin.readline().split())
    sum = a+b
    sum_array.append(sum)

for j in sum_array:
    print(j)