package main

import (
	"fmt"
)

func main() {
	var a, b, z int
	fmt.Scan(&a)
	fmt.Scan(&b)
	if b > a {
		fmt.Printf("O JOGO DUROU %d HORA(S)\n", b - a)
	}
	if a == b {
		fmt.Printf("O JOGO DUROU 24 HORA(S)\n")
	}
	if a > b {
		z = 24 - a + b
		fmt.Printf("O JOGO DUROU %d HORA(S)\n", z)
	}
}
