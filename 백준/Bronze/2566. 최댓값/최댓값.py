list_result = []
max_list = []

for i in range(9):
    row = list(map(int,input().split()))
    list_result.append(row)

for j in range(9):
        temp = max(list_result[j])
        max_list.append(temp)

result = max(max_list)

for k in range(9):
    for l in range(9):
        if(list_result[k][l] == result ):
            a,b = k+1,l+1

print(result)
print(a,b)

