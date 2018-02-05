# https://www.hackerrank.com/challenges/py-collections-namedtuple/problem

from collections import namedtuple

if __name__ == '__main__':
    n = int(input())
    Grade = namedtuple('Grade', input())
    grades = [Grade(*input().split()) for i in range(n)]
    s = sum([int(g.MARKS) for g in grades])
    print('{:.2f}'.format(s/len(grades)))
