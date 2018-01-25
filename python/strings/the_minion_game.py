# https://www.hackerrank.com/challenges/the-minion-game/problem

def minion_game(string):
    v = 0
    c = 0
    n = len(string)
    for i in range(n):
        if string[i] in ('A', 'E', 'I', 'O', 'U'):
            v = v + (n -i)
        else:
            c = c + (n - i)

    if v > c:
        print('Kevin ' + str(v))
    elif c > v:
        print('Stuart ' + str(c))
    else:
        print('Draw')

if __name__ == '__main__':
    s = input()
    minion_game(s)
