if __name__ == '__main__':
    n = int(input())
    l = {}
    for _ in range(n):
        name, *line = input().split()
        line = list(map(float, line))
        l[name] = [float(i) for i in line]
    name = input()
    average = sum(l[name])/3.00
    print("{0:.2f}".format(average))
