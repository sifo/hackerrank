# https://www.hackerrank.com/challenges/ruby-enumerable-collect/problem

def rot13(secret_messages)
  secret_messages.map{|w| w.tr("a-z", "n-za-m")}
end
