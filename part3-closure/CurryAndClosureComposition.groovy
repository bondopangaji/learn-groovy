def multiplier = { a, b -> a * b }

def doubler = multiplier.curry(2) // b -> 2 * b

println(multiplier(5, 5))