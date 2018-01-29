# https://www.hackerrank.com/challenges/swap-case/problem

def swap_letter(c):
    return c.lower() if c.isupper() else c.upper()

def swap_case(s):
    s = list(s)
    l = list(map(swap_letter, s))
    return "".join(l)

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
