r_set = set()

for i in range(10):
    num = int(input())
    r = num % 42
    r_set.add(r)

print(len(r_set))