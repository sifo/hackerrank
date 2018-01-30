#  https://www.hackerrank.com/challenges/itertools-combinations/problem

import itertools

if __name__ == '__main__':
    S, k = input().split()
    print(*[''.join(i) for j in range(1, int(k)+1) for i in itertools.combinations(sorted(S), j)], sep='\n')
