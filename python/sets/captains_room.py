# https://www.hackerrank.com/challenges/py-the-captains-room/problem

if __name__ == '__main__':
    K = int(input())
    l = list(map(int, input().split()))
    rooms = set(l)
    c = [0]*(max(rooms)+1)
    for i in l:
        c[i] += 1
    res = 0
    for i in range(len(c)):
        if c[i] != K and i in rooms:
            res = i
            break
    print(res)
