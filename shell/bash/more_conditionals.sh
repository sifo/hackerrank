# https://www.hackerrank.com/challenges/bash-tutorials---more-on-conditionals/problem

read a
read b
read c
if [ "$c" != "$b" ] && [ "$c" != "$a" ] && [ "$a" != "$b" ]
then
    echo "SCALENE"
elif [ "$c" = "$b" ] && [ "$c" = "$a" ]
then
     echo "EQUILATERAL"
else
    echo "ISOSCELES"
fi
