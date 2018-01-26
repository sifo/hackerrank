# https://www.hackerrank.com/challenges/py-introduction-to-sets/problem

def average3(array):
    plants = set(array)
    c = 0
    for i in plants:
        c += i
    return c/len(plants)

import functools, operator

def average2(array):
    s = set(array)
    return functools.reduce(operator.add, s)/len(s)

def average(array):
    s = set(array)
    return sum(s)/len(s)

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
