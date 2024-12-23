n = 1000 - int(input())
lst = [500, 100, 50, 10, 5, 1]

sum = 0
for i in lst:
    sum += n // i
    n %= i

print(sum)