# https://www.hackerrank.com/challenges/bash-tutorials-slice-an-array/problem

t=()
while read line
do
    t=("${t[@]}" "${line}") 
done

echo "${t[@]:3:5}"
