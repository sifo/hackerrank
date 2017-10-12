if __name__ == '__main__':
    n = int(input())
    A = list(map(int, input().split()))
    A.sort()
    A.reverse()
    for i in range(len(A)-1):
        if A[i] != A[i+1]:
            print(A[i+1])
            break
