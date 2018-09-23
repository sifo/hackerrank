# https://www.hackerrank.com/challenges/ruby-methods-introduction/problem

def prime?(n)
    if n == 1
        return false
    end
    if n == 2 or n == 3
        return true
    end
    (4...n).none?{|e| n%e == 0}
end
