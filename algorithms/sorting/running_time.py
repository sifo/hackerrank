
if __name__ == '__main__':
    n = int(input())
    l = [int(i) for i in input().strip().split()]
    p = 0

    for i in range(1, n):
        key = l[i]
        j = i
        while l[j-1] > key and j > 0:
            l[j] = l[j-1]
            j = j - 1
            p = p + 1
        l[j] = key

    print(p)
