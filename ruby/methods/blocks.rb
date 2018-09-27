# https://www.hackerrank.com/challenges/ruby-blocks/problem

def factorial
  yield
end

n = gets.to_i
factorial do
  puts (1..n).reduce(1, :*)
end
