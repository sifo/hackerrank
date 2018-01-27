# https://www.hackerrank.com/challenges/py-check-strict-superset/problem

if __name__ == '__main__':
    A = set(map(int, input().split()))
    res = True
    for i in range(int(input())):
        N = set(map(int, input().split()))
        if not A > N:
            res = False
            break
    print(res)
