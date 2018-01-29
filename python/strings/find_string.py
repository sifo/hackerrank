# https://www.hackerrank.com/challenges/find-a-string/problem

def count_substring(s, sub):
    res = 0
    for i in range(0, len(s)-len(sub)+1):
        if s[i:i+len(sub)] == sub:
            res = res + 1
    return res

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    count = count_substring(string, sub_string)
    print(count)
