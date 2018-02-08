# https://www.hackerrank.com/challenges/python-time-delta/problem

from datetime import datetime

if __name__ == '__main__':
    f = '%a %d %b %Y %H:%M:%S %z'
    for _ in range(int(input())):
        t1 = datetime.strptime(input(), f)
        t2 = datetime.strptime(input(), f)
        d = t1-t2
        print(round(abs(d.total_seconds())))
