# https://www.hackerrank.com/challenges/alphabet-rangoli/problem

import string

def print_rangoli2(size):
    l = []
    for i in range(size):
        s = string.ascii_lowercase[size-1]
        for j in range(i):
            s += "-" + string.ascii_lowercase[(size-j)-2]
        r = ""
        for j in range(i):
            r = string.ascii_lowercase[(size-j)-1] + "-" + r
        if len(r) > 0:
            s += "-" + r[:-1]
        l.append(s.center(size+(size-1)*3,'-'))
    for i in range(size-1):
        l.append(l[size-i-2])

    for i in l:
        print(i)

def print_rangoli(size):
    res = ""
    for i in range(size):
        line = string.ascii_lowercase[i]
        for j in range(i+1, size):
            c = string.ascii_lowercase[j]
            line = c + "-" + line + "-" + c
        line = line.center(size+(size-1)*3,'-')
        if size > 1 and i != 0:
            res = line + "\n" + res + "\n" + line
        else:
            res = line
    print(res)

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
