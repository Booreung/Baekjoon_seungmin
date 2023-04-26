import sys

n = int(input())
array = list(map(int, sys.stdin.readline().split()))

array.sort()

print(array[0] , array[-1])