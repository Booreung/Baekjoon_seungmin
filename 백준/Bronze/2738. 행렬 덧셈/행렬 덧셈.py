n, m = map(int, input().split())

a,b = [], []
result = []

for i in range(n):
    row = list(map(int, input().split()))
    a.append(row)

for j in range(n):
    row = list(map(int, input().split()))
    b.append(row)

for k in range(n):
    for l in range(m):
        print(a[k][l] + b[k][l], end=' ')
    print()
