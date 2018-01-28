# https://www.hackerrank.com/challenges/find-angle/problem
#
# We know:
#    Angle(MBC) = Angle(MCB) (see right triangle and circumscribed circle)
# => Angle(MCB) = Angle(ACB).
# So to find Angle(ACB), we use what we know on right triangle:
#     tan(Angle(ACB)) = AB / BC
# <=> Angle(ACB) = atan(AB / BC)

import math

if __name__ == '__main__':
    AB = int(input())
    BC = int(input())
    print(str(round(math.degrees(math.atan(AB/BC))))+'°')
