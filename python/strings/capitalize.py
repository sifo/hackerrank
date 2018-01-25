# https://www.hackerrank.com/challenges/capitalize/problem

def capitalize(string):
    return ' '.join([n.capitalize() for n in string.split(' ')])

def capitalize2(string):
    flag = True
    res = ""
    for l in string:
        if l != " " and flag:
            if l.isalpha():
                l = l.upper()
            flag = False
        elif l == " ":
            flag = True
        res += l
    return res

if __name__ == '__main__':
    string = input()
    capitalized_string = capitalize(string)
    print(capitalized_string)
