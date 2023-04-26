import sys

n = int(sys.stdin.readline().rstrip())
scores = list(map(int, sys.stdin.readline().rstrip().split()))
change_scores = []


for i in range(len(scores)):
        change_scores.append((scores[i] / max(scores)) * 100)

avg = sum(change_scores) / n

print(avg)