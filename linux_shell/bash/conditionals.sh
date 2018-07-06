# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem

read c
if [ "$c" = "y" ] || [ "$c" = "Y" ]
then
    echo "YES"
elif [ "$c" = "n" ] || [ "$c" = "N" ]
then
    echo "NO"
fi
