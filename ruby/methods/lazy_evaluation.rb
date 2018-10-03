# https://www.hackerrank.com/challenges/ruby-lazy/problem

def isPrime(n)
  return false if n <= 1
  return true if n == 2 or n == 3
  return false if n % 2 == 0 or n % 3 == 0
  i = 5
  w = 2
  while i * i <= n do
    return false if n % i == 0
    i += w
    w = 6 - w
  end
  return true
end

def isPalindromeNumber(n)
  n = n.to_s
  return true if n.length == 1
  for i in (0..n.length/2)
    return false if n[i] != n[n.length-1-i]
  end
  return true
end

palindromic_prime = -> (n) do
    1.upto(Float::INFINITY).lazy.select { |x| isPrime(x) and isPalindromeNumber(x) }.first(n)
end

n = gets
p palindromic_prime.(n.to_i)
