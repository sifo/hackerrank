# https://www.hackerrank.com/challenges/py-set-union/problem

if __name__ == '__main__':
    input()
    f = set(map(int, input().split()))
    input()
    e = set(map(int, input().split()))
    print(len(f.union(e)))
