list_result = []

for i in range(5):
    str = input()
    row = list(str)
    list_result.append(row)

for i in range(15):
  for j in range(5):
    if i < len(list_result[j]):
      print(list_result[j][i], end="")
