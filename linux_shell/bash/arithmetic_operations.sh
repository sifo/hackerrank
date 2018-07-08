# https://www.hackerrank.com/challenges/bash-tutorials---arithmetic-operations/problem
# tips on multiple solutions : https://www.shell-tips.com/2010/06/14/performing-math-calculation-in-bash/

read s
echo $s | bc -l | xargs printf "%.3f\n"
