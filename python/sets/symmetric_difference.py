# https://www.hackerrank.com/challenges/symmetric-difference/problem

if __name__ == '__main__':
    n = int(input())
    N = set(map(int, input().split()))
    m = int(input())
    M = set(map(int, input().split()))
    d1 = N.difference(M)
    d2 = M.difference(N)
    r = list(d1.union(d2))
    r.sort()
    for i in r:
        print(i)
