import numpy

if __name__ == '__main__':
    l = list(map(int , input().split()))
    print(numpy.reshape(l, (3,3)))
