def mutate_string(string, position, character):
    t = list(string)
    t[position] = character
    return ''.join(t)

if __name__ == '__main__':
    s = input()
    r = input().split(" ")
    res = mutate_string(s, int(r[0]), r[1][0])
    print(res)
