n = int(input())

meetings = []

for i in range(n):
    s, e = map(int, input().split())
    meetings.append((s,e))

meetings.sort(key=lambda x: (x[1], x[0]))

start_time = 0
cnt = 0
for meet in meetings:
    if start_time <= meet[0]:
        start_time = meet[1]
        cnt += 1
print(cnt)