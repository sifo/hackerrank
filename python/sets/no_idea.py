# https://www.hackerrank.com/challenges/no-idea/problem

if __name__ == '__main__':
    n, m = list(map(int, input().split()))
    N = list(map(int, input().split()))
    A = set(map(int, input().split()))
    B = set(map(int, input().split()))
    c = 0
    for i in N:
        if i in A:
            c += 1
        elif i in B:
            c -= 1
    print(c)
