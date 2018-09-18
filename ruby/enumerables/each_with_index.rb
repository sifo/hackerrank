# https://www.hackerrank.com/challenges/ruby-enumerable-each-with-index/problem

def skip_animals(animals, skip)
  animals.each_with_index.map{|a, i| "#{i}:#{a}"}.drop(skip)
end
