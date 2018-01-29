# https://www.hackerrank.com/challenges/python-string-formatting/problem

def print_formatted(number):
    w = len("{0:b}".format(number))
    for i in range(1, number+1):
        print(str(i).rjust(w)+ " " + "{0:o}".format(i).rjust(w)+ " " + "{0:x}".format(i).rjust(w)+ " " + "{0:b}".format(i).rjust(w))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
