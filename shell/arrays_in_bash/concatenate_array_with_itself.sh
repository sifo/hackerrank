# https://www.hackerrank.com/challenges/bash-tutorials-concatenate-an-array-with-itself/problem

t=($(cat))
t=("${t[@]}" "${t[@]}" "${t[@]}")
echo ${t[@]}
