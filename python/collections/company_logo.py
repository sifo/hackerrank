# https://www.hackerrank.com/challenges/most-commons/problem

if __name__ == '__main__':
    d = {}
    for i in list(input()):
        if i not in d:
            d[i] = 1
        else:
            d[i] += 1
    l = sorted(d.items(), key=lambda x: (-x[1], x[0]))
    for i in l[:3]:
        print(i[0], i[1])
