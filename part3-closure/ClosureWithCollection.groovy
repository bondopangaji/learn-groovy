def names = ['Bondo', 'Rika', 'Asya', 'Husen', 'Arum', 'aksiaxdna', '12313sda', 'cAT']

def result = names
    .findAll { it ==~ /[A-Z][a-z]+/ } // First capital letter regex
    .collect { String name -> name.toUpperCase() }

println result