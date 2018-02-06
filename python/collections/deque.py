# https://www.hackerrank.com/challenges/py-collections-deque/problem

from collections import deque

if __name__ == '__main__':
    d = deque()
    for _ in range(int(input())):
        cmd = input().split()
        arg = '' if len(cmd) <= 1 else int(cmd[1])
        eval('d.{}({})'.format(cmd[0], arg))
    print(*d)
