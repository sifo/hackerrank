# https://www.hackerrank.com/challenges/py-set-symmetric-difference-operation/problem

if __name__ == '__main__':
    input()
    f = set(map(int, input().split()))
    input()
    e = set(map(int, input().split()))
    print(len(f.symmetric_difference(e)))
