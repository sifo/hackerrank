// https://www.hackerrank.com/challenges/swap-case/problem

package main

import (
	"bufio"
	"fmt"
	"os"
	"unicode"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	text, _ := reader.ReadString('\n')
	a := []rune(text)
	for i, c := range a {
		if unicode.IsUpper(rune(c)) {
			a[i] = unicode.ToLower(c)
		} else {
			a[i] = unicode.ToUpper(c)
		}
	}
	res := string(a)
	fmt.Print(res)
}
