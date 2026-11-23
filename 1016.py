import math

count = 0

a, b = map(int, input().split())
for i in range(a, b+1):
    for j in range(2, int(math.sqrt(i))+1):
        if i % (j ** 2) == 0:
            break
    else:
        count += 1
print(count)