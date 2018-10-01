# https://www.hackerrank.com/challenges/ruby-partial-applications/problem

class Integer
  def fact
    (1..self).reduce(1, :*)
  end
end

combination = -> (n) do
  -> (r) do
    n.fact / (r.fact * (n-r).fact)
  end
end

n = gets.to_i
r = gets.to_i
nCr = combination.(n)
puts nCr.(r)
