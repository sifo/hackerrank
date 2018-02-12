# https://www.hackerrank.com/challenges/python-sort-sort/problem

if __name__ == '__main__':
    N, _ = map(int, input().split())
    l = []
    for i in range(N):
        l.append(list(map(int, input().split())))
    K = int(input())
    l = sorted(l, key=lambda x: x[K])
    for i in l:
        print(*i)
