package main

import (
	"errors"
	"testing"
)

func TestMultiply(t *testing.T) {
	testCases := []struct {
		name      string
		a, b, lim int
		expected  int
		expectedErr error
	}{
		{"ValidMultiplication", 2, 3, 10, 6, nil},
		{"ResultExceedsLimit", 5, 4, 18, 0, errors.New("result exceeds limit")},
		{"ZeroLimit", 3, 2, 0, 0, errors.New("result exceeds limit")},
	}

	for _, tc := range testCases {
		t.Run(tc.name, func(t *testing.T) {
			result, err := multiply(tc.a, tc.b, tc.lim)

			if err == nil && tc.expectedErr != nil {
				t.Errorf("Expected error %v, but got nil", tc.expectedErr)
			} else if err != nil && tc.expectedErr == nil {
				t.Errorf("Expected no error, but got %v", err)
			} else if err != nil && tc.expectedErr != nil && err.Error() != tc.expectedErr.Error() {
				t.Errorf("Expected error %v, but got %v", tc.expectedErr, err)
			}

			if result != tc.expected {
				t.Errorf("Expected %d, but got %d", tc.expected, result)
			}
		})
	}
}
