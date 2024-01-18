// app_test.go
package main

import (
	"errors"
	"testing"
)

type MockDatabase struct {
	data string
	err  error
}

func (m *MockDatabase) Save(data string) error {
	m.data = data
	return m.err
}

func (m *MockDatabase) Retrieve() (string, error) {
	return m.data, m.err
}

func TestApplication(t *testing.T) {
	t.Run("SaveData_Success", func(t *testing.T) {
		mockDB := &MockDatabase{}
		app := NewApplication(mockDB)

		err := app.SaveData("Hello, World!")

		if err != nil {
			t.Errorf("Expected no error, but got %v", err)
		}

		if mockDB.data != "Hello, World!" {
			t.Errorf("Expected data to be 'Hello, World!', but got %s", mockDB.data)
		}
	})

	t.Run("SaveData_Failure", func(t *testing.T) {
		expectedErr := errors.New("mocked error")
		mockDB := &MockDatabase{err: expectedErr}
		app := NewApplication(mockDB)

		err := app.SaveData("Hello, World!")

		if err != expectedErr {
			t.Errorf("Expected error %v, but got %v", expectedErr, err)
		}
	})

	t.Run("RetrieveData_Success", func(t *testing.T) {
		expectedData := "Hello, World!"
		mockDB := &MockDatabase{data: expectedData}
		app := NewApplication(mockDB)

		data, err := app.RetrieveData()

		if err != nil {
			t.Errorf("Expected no error, but got %v", err)
		}

		if data != expectedData {
			t.Errorf("Expected data to be %s, but got %s", expectedData, data)
		}
	})

	t.Run("RetrieveData_Failure", func(t *testing.T) {
		expectedErr := errors.New("mocked error")
		mockDB := &MockDatabase{err: expectedErr}
		app := NewApplication(mockDB)

		_, err := app.RetrieveData()

		if err != expectedErr {
			t.Errorf("Expected error %v, but got %v", expectedErr, err)
		}
	})
}
