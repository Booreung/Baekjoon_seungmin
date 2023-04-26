array = []

for i in range(9):
    a = int(input())
    array.append(a)

print(max(array))
print(array.index(max(array))+1)