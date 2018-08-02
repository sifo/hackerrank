# https://www.hackerrank.com/challenges/bash-tutorials-read-in-an-array/problem

t=()
while read line
do
    t=("${t[@]}" "${line}")
done

echo ${t[@]}
