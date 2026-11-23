count = int(input())

for _ in range(count):
    a, b, c = map(int, input().split())
    matrix = [[0 for _ in range(a)] for _ in range(b)]
    
    for _ in range(c):
        x, y = map(int, input().split())
        matrix[y][x] = 1

    snake = 0

    for i in range(b):
        for j in range(a):
            if matrix[i][j] == 1:
                snake += 1
                
                stack = [(i, j)]
                matrix[i][j] = 0

                while stack:
                    y, x = stack.pop()

                    if y-1 >= 0 and matrix[y-1][x] == 1:
                        matrix[y-1][x] = 0
                        stack.append((y-1, x))

                    if y+1 < b and matrix[y+1][x] == 1:
                        matrix[y+1][x] = 0
                        stack.append((y+1, x))

                    if x-1 >= 0 and matrix[y][x-1] == 1:
                        matrix[y][x-1] = 0
                        stack.append((y, x-1))

                    if x+1 < a and matrix[y][x+1] == 1:
                        matrix[y][x+1] = 0
                        stack.append((y, x+1))

    print(snake)