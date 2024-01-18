# test_functions.sh
source operations.sh

# Test unitaire pour la fonction add()
result=$(add 5 3)
expected=8
if [ "$result" -eq "$expected" ]; then
    echo "Test add(): Passed"
else
    echo "Test add(): Failed"
fi

# Test unitaire pour la fonction subtract()
result=$(subtract 10 3)
expected=7
if [ "$result" -eq "$expected" ]; then
    echo "Test subtract(): Passed"
else
    echo "Test subtract(): Failed"
fi

# Test unitaire pour la fonction multiply()
result=$(multiply 5 4)
expected=20
if [ "$result" -eq "$expected" ]; then
    echo "Test multiply(): Passed"
else
    echo "Test multiply(): Failed"
fi

# Test unitaire pour la fonction divide()
result=$(divide 15 3)
expected=5
if [ "$result" -eq "$expected" ]; then
    echo "Test divide(): Passed"
else
    echo "Test divide(): Failed"
fi
