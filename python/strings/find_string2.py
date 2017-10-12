def count_substring(s, sub):
    res = 0
    while True:
        f = s.find(sub)
        if f == -1:
            break
        else:
            res = res + 1
            s = s[f+1:]
    return res

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    count = count_substring(string, sub_string)
    print(count)
