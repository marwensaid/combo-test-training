# Fonction pour additionner deux nombres
add() {
    echo "$(( $1 + $2 ))"
}

# Fonction pour soustraire deux nombres
subtract() {
    echo "$(( $1 - $2 ))"
}

# Fonction pour multiplier deux nombres
multiply() {
    echo "$(( $1 * $2 ))"
}

# Fonction pour diviser deux nombres
divide() {
    if [ $2 -eq 0 ]; then
        echo "Division by zero is not allowed"
    else
        echo "$(( $1 / $2 ))"
    fi
}
