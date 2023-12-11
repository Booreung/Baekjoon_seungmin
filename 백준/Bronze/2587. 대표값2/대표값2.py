sum = 0
avg = 0

a = []

a = [int(input()) for i in range(5)]

a.sort()
for j in a:
    sum += j

avg = sum // len(a)

mid = a[len(a)//2]

print(avg)
print(mid)
