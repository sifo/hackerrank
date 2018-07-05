# https://www.hackerrank.com/challenges/bash-tutorials---comparing-numbers/problem

read a
read b
if [ $a -gt $b ]
then
    echo "X is greater than Y"
elif [ $a == $b ]
then
    echo "X is equal to Y"
else
    echo "X is less than Y"
fi
