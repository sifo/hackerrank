# https://www.hackerrank.com/challenges/ruby-enumerable-group-by/problem

def group_by_marks(marks, pass_marks)
    marks.group_by {|k, m| if m >= pass_marks then "Passed" else "Failed" end}
end
