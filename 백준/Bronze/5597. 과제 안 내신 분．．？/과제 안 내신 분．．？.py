stu = []

for i in range(28):
    a = int(input())
    stu.append(a)

for j in range(1, 31):
    if(j not in stu):
        print(j)