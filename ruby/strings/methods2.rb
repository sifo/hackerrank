# https://www.hackerrank.com/challenges/ruby-strings-methods-ii/problem

def mask_article(s, a)
  a.each{ |w| s.gsub!(w, strike(w)) }
  s
end

def strike(s)
  '<strike>' + s + '</strike>'
end
