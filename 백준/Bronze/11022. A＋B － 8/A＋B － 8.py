a = []
b = []
for k in range(int(input())):
    a_a, b_b = map(int, input().split())
    a.append(a_a)
    b.append(b_b)

#a = [1, 2, 3, 9, 5]
#b = [1, 3, 4, 8, 2]

sum_array = []
k = 1
t = 0

for i in range(len(a)):
    sum = a[i] + b[i]
    sum_array.append(sum)

for j in sum_array:
    format_a = "Case #{}: {} + {} = {}".format(k, a[t], b[t], j)
    k = k + 1
    t = t + 1
    print(format_a)

