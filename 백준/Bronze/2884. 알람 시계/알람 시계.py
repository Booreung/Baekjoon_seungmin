hour, minute = map(int, input().split())

if(minute>= 45):
    minute = minute - 45
else:
    tmp = minute - 45
    hour = hour - 1
    minute = tmp + 60

if(hour < 0 ):
    hour = hour + 24

print(hour, minute)
