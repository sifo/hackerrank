import string

def print_rangoli(size):
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

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
