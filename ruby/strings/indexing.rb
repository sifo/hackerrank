# https://www.hackerrank.com/challenges/ruby-strings-indexing/problem

def serial_average(s)
  sss = s[0,3]
  xx = s[4,8]
  yy = s[10,14]
  average = (xx.to_f+yy.to_f)/2.0
  zz = average.round(2).to_s
  "#{sss}-#{zz}"
end
