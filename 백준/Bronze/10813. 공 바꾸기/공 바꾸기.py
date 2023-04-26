import sys

n, m = map(int, input().split())
array = []

for i in range(1,n+1):
    array.append(i)

for j in range(m):
    a, b = map(int, sys.stdin.readline().split())
    tmp = array[a-1]
    array[a-1] = array[b-1]
    array[b-1] = tmp

print(*array)