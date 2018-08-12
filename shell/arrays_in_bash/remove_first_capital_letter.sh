# https://www.hackerrank.com/challenges/bash-tutorials-remove-the-first-capital-letter-from-each-array-element/problem

t=($(cat))

for i in "${t[@]}"
do
    printf ".${i:1:${#i}-1} "
done
