# https://www.hackerrank.com/challenges/ruby-enumerable-reduce/problem

def sum_terms(n)
    (1..n).map{|n| n*n+1}.reduce(0, :+)
end
