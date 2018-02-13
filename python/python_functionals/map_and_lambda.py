# https://www.hackerrank.com/challenges/map-and-lambda-expression/problem

cube = lambda x: x**3

def fibonacci(n):
    if n <= 0:
        return []
    if n == 1:
        return [0]
    if n == 2:
        return [0, 1]

    l = [0, 1]
    for i in range(2, n):
        l.append(l[i-1]+l[i-2])
    return l

def fibonacci2(n):
    l = [0, 1]
    for i in range(2, n):
        l.append(l[i-1]+l[i-2])
    return l[:n]

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))
