# https://www.hackerrank.com/challenges/bash-tutorials-filter-an-array-with-patterns/problem

t=($(cat))
t=(${t[@]/*[aA]*/})
echo ${t[@]}
