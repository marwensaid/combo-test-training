package main

type DataStorage interface {
    Save(data string) error
    Retrieve() (string, error)
}

type MyDatabase struct {
    data string
}

func (db *MyDatabase) Save(data string) error {
    db.data = data
    return nil
}

func (db *MyDatabase) Retrieve() (string, error) {
    return db.data, nil
}
