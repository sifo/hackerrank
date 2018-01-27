# https://www.hackerrank.com/challenges/py-the-captains-room/problem

if __name__ == '__main__':
    K = int(input())
    l = list(map(int, input().split()))
    c = dict.fromkeys(l, 0)
    for i in l:
        c[i] += 1
    for i in c:
        if c[i] != K:
            print(i)
            break
