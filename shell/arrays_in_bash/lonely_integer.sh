# https://www.hackerrank.com/challenges/lonely-integer-2/problem

read n
t=($(cat))
count=()
for i in {0..100}
do
    count=(${count[@]} 0)
done
for i in ${t[@]}
do
    ((count[${i}]++))
done
for i in {0..100}
do
    if [ "${count[${i}]}" == 1 ] 
    then
        echo $i
        break
    fi
done
