# https://www.hackerrank.com/challenges/py-set-discard-remove-pop/problem

if __name__ == '__main__':
    n = int(input())
    s = set(map(int, input().split()))
    for i in range(int(input())):
        cmd = input().split()
        if cmd[0] == 'pop':
            s.pop()
        elif cmd[0] == 'remove':
            s.remove(int(cmd[1]))
        elif cmd[0] == 'discard':
            s.discard(int(cmd[1]))
    print(sum(s))
