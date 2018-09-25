# https://www.hackerrank.com/challenges/ruby-methods-arguments/problem

def take(arr, n=1)
    res = Array.new(arr.size()-n)
    c = n
    for i in (0...res.size()) do
        res[i] = arr[c]
        c = c + 1
    end
    res
end
