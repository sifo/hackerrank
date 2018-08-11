# https://www.hackerrank.com/challenges/bash-tutorials-count-the-number-of-elements-in-an-array/problem

t=($(cat))
echo ${#t[@]}
