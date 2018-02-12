# https://www.hackerrank.com/challenges/any-or-all/problem

if __name__ == '__main__':
    input()
    l = list(map(int, input().split()))
    n = [i > 0 for i in l]
    if all(n):
        l = [list(str(i)) == list(str(i))[::-1] for i in l]
        print(any(l))
    else:
        print(False)
