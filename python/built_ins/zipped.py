# https://www.hackerrank.com/challenges/zipped/problem

if __name__ == '__main__':
    _, X = map(int, input().split())
    l = [map(float, input().split()) for _ in range(X)]
    print(*[sum(g)/X for g in zip(*l)], sep='\n')
