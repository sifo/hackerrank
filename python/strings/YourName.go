// https://www.hackerrank.com/challenges/whats-your-name/problem

package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	f, _ := reader.ReadString('\n')
	l, _ := reader.ReadString('\n')
	f = strings.Trim(f, " \n")
	l = strings.Trim(l, " \n")
	fmt.Printf("Hello %s %s! You just delved into python.\n", f, l)
}
