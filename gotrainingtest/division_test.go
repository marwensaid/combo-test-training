// division_test.go
package main

import (
	"errors"
	"testing"
)

func TestDivide(t *testing.T) {
	t.Run("ValidDivision", func(t *testing.T) {
		result, err := divide(10, 2)

		if err != nil {
			t.Errorf("Expected no error, but got %v", err)
		}

		expected := 5
		if result != expected {
			t.Errorf("Expected %d, but got %d", expected, result)
		}
	})

	t.Run("DivisionByZero", func(t *testing.T) {
		_, err := divide(10, 0)

		expectedErr := errors.New("division by zero")
		if err == nil || err.Error() != expectedErr.Error() {
			t.Errorf("Expected error %v, but got %v", expectedErr, err)
		}
	})
}
