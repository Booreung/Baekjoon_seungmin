number = int(input())
array = []
count = 0

array = map(int, input().split())

find = int(input())

for j in array:
    if (j == find):
        count += 1

print(count)