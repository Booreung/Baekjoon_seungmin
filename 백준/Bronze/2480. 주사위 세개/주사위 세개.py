a, b, c = map(int, input().split())

if((a==b)and(a==c)):
    prize = 10000 + (a*1000)
elif(((a==b)and(a!= c))or((a==c)and(a!= b))or((b==c)and(b!= a))):
    if((a==b)or(a==c)):
        prize = 1000 + (a*100)
    elif(b==c):
        prize = 1000 + (b*100)
elif((a!=b)and(a!=c)and(b!=c)):
    top = max(a,b,c)
    prize = top * 100

print(prize)
