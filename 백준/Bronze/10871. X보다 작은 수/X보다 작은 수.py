import sys
n, x = map(int, input().split())

array = list(map(int, sys.stdin.readline().rstrip().split()))
min_x = []
for i in array:
    if (i < x):
        min_x.append(i)


print(*min_x)