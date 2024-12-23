a, b = map(int, input().split())
lst = [0] * (a + 1)

for i in range(1, a + 1):
    lst[i] = i

for i in range(b):
    c, d = map(int, input().split())
    lst[c], lst[d] = lst[d], lst[c]

print(*lst[1:], end=' ')