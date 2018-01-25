def merge_the_tools(string, k):
    sub = string
    while len(sub) > 0:
        t = sub[:k]
        s = []
        for i in t:
            if i not in s:
                s.append(i)
        print(''.join(s))
        sub = sub[k:]

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
