if __name__ == '__main__':
    n = int(input())
    l = [int(x) for x in input().split()]
    t = tuple(l)
    print(hash(t))
