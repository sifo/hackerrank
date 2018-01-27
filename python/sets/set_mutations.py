# https://www.hackerrank.com/challenges/py-set-mutations/problem

if __name__ == '__main__':
    operations = ['intersection_update', 'update', 'difference_update',
                  'symmetric_difference_update']
    input()
    s = set(map(int, input().split()))
    for i in range(int(input())):
        cmd = input().split()[0]
        a = set(map(int, input().split()))
        if cmd in operations:
            eval('s.' + cmd + '(a)')
    print(sum(s))
