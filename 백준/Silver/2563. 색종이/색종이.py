arr = [[0 for i in range(101)] for j in range(101)]

N = int(input())

for k in range(N):
    x,y = list(map(int, input().split()))

    for row in range(x,x+10):
        for col in range(y,y+10):
            arr[row][col] = 1

result = 0

for l in arr:
    result += l.count(1)

print(result)