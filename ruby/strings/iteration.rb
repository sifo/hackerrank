# https://www.hackerrank.com/challenges/ruby-strings-iteration/problem

def count_multibyte_char(s)
    s.each_char.to_a.select{ |c| c.bytesize > 1 }.count
end
