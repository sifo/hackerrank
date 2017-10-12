if __name__ == '__main__':
    l = []
    for i in range(int(input())):
        l.append([input(), float(input())])
    l.sort(key=lambda x: x[1])
    min = l[0][1]
    l.pop(0)
    while l[0][1] == min:
        l.pop(0)
    l = [i[0] for i in l if i[1] == l[0][1]]
    l.sort()
    for i in l:
        print(i)
