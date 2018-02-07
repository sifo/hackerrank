# https://www.hackerrank.com/challenges/piling-up/problem

from collections import deque

if __name__ == '__main__':
    for i in range(int(input())):
        input()
        last = 0
        res = 'Yes'
        d = deque(map(int, input().split()))
        while d:
            if d[-1] > d[0]:
                c = d.pop()
            else:
                c = d.popleft()
            if last != 0 and c > last:
                res = 'No'
                break
            last = c
        print(res)
