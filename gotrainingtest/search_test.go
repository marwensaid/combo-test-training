package main

import "testing"

func TestBinarySearch(t *testing.T) {
    testCases := []struct {
        name     string
        input    []int
        target   int
        expected int
    }{
        {"ElementPresent", []int{1, 2, 3, 4, 5}, 3, 2},
        {"ElementNotPresent", []int{1, 2, 3, 4, 5}, 6, -1},
        {"EmptyArray", []int{}, 1, -1},
        // Ajoutez d'autres cas de test au besoin
    }

    for _, tc := range testCases {
        t.Run(tc.name, func(t *testing.T) {
            result := binarySearch(tc.input, tc.target)
            if result != tc.expected {
                t.Errorf("Expected %d, but got %d", tc.expected, result)
            }
        })
    }
}
