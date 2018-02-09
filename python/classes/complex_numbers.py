# https://www.hackerrank.com/challenges/class-1-dealing-with-complex-numbers/problem

class Complex(object):

    def __init__(self, r, i):
        self.r = r
        self.i = i

    def __add__(self, c):
        return Complex(self.r+c.r, self.i+c.i)

    def __sub__(self, c):
        return Complex(self.r-c.r, self.i-c.i)

    def __mul__(self, c):
        return Complex(self.r*c.r-self.i*c.i, self.r*c.i + self.i*c.r)

    def __truediv__(self, c):
        return Complex((self.r*c.r+self.i*c.i)/(c.r**2+c.i**2), (-(self.r*c.i)+self.i*c.r)/(c.r**2+c.i**2))

    def mod(self):
        return Complex(pow(self.r**2+self.i**2, 0.5), 0)

    def __str__(self):
        if self.i == 0:
            result = "%.2f+0.00i" % (self.r)
        elif self.r == 0:
            if self.i >= 0:
                result = "0.00+%.2fi" % (self.i)
            else:
                result = "0.00-%.2fi" % (abs(self.i))
        elif self.i > 0:
            result = "%.2f+%.2fi" % (self.r, self.i)
        else:
            result = "%.2f-%.2fi" % (self.r, abs(self.i))
        return result


if __name__ == '__main__':
    x = Complex(*map(float, input().split()))
    y = Complex(*map(float, input().split()))
    print(x+y)
    print(x-y)
    print(x*y)
    print(x/y)
    print(x.mod())
    print(y.mod())
