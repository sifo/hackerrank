# https://www.hackerrank.com/challenges/ginorts/problem

if __name__ == '__main__':
    l = list(input())
    print(*sorted(l, key=lambda x : (x.isdigit() and int(x) % 2 == 0, x.isdigit(), x.isupper(), x)), sep='')
