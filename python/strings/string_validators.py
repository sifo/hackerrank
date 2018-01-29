# https://www.hackerrank.com/challenges/string-validators/problem

# if __name__ == '__main__':
#     s = input()
#     l = list(s)
#     r = [i for i in l if i.isalnum()]
#     print(len(r)>0)
#     r = [i for i in l if i.isalpha()]
#     print(len(r)>0)
#     r = [i for i in l if i.isdigit()]
#     print(len(r)>0)
#     r = [i for i in l if i.islower()]
#     print(len(r)>0)
#     r = [i for i in l if i.isupper()]
#     print(len(r)>0)

# 1. can call class functions as if they were static
# 2. class function takes the current instant as parameter with 'self'
# 3. any()

if __name__ == '__main__':
    l = list(input())
    for f in [str.isalnum, str.isalpha, str.isdigit, str.islower, str.isupper]:
        print(any(f(c) for c in l))
