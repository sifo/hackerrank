import numpy

if __name__ == '__main__':
    n, _ = input().split()
    l = []
    for i in range(int(n)):
        l.append(list(map(int, input().split())))
    print(numpy.transpose(numpy.array(l)))
    print(numpy.array(l).flatten())
