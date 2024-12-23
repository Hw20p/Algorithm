a, b = map(int, input().split())
lst = [0] * (a + 1)

for i in range(b):
    c, d, e = map(int, input().split())
    for j in range(c, d + 1):
        lst[j] = e

print(*lst[1:])