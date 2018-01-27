# https://www.hackerrank.com/challenges/py-check-subset/problem

if __name__ == '__main__':
    for i in range(int(input())):
        input()
        A = set(map(int, input().split()))
        input()
        B = set(map(int, input().split()))
        diff = B.difference(A)
        print(len(diff) == len(B) - len(A))
