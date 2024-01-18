package main

import "errors"

func multiply(a, b, limit int) (int, error) {
    result := a * b
    if result > limit {
        return 0, errors.New("result exceeds limit")
    }
    return result, nil
}
