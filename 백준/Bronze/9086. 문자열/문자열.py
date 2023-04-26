import sys

str = []
for i in range(int(input())):
    s = sys.stdin.readline().rstrip()
    str.append(s[0]+s[-1])

for i in str:
    print(i)
