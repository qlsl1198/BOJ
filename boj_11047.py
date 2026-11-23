n,k = map(int, input().split())

coins = []
for i in range(n):
    coin = int(input())
    coins.append(coin)

coins.sort(reverse=True)

count = 0
for coin in coins:
    if k >= coin:
        count += k // coin
        k %= coin

print(count)

