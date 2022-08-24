class Operator {
    static void main(String[] args) {
        // Arithmetic operators
        // addition
        assert  1  + 2 == 3 
        // subtraction
        assert  4  - 3 == 1 
        // multiplication
        assert  3  * 5 == 15 
        // division
        assert  3  / 2 == 1.5
        // modulo
        assert 10  % 3 == 1
        // power
        assert  2 ** 3 == 8

        // Unary operators
        def a = 2
        def b = a++ * 3             
        assert a == 3 && b == 6

        def c = 3
        def d = c-- * 2             
        assert c == 2 && d == 6

        def e = 1
        def f = ++e + 3             
        assert e == 2 && f == 5

        def g = 4
        def h = --g + 1             
        assert g == 3 && h == 4

        // Assignment arithmetic operators
        def a = 4
        a += 
        assert a == 7
        
        def b = 5
        b -= 3
        assert b == 2
        
        def c = 5
        c *= 3
        assert c == 15
        
        def d = 10
        d /= 2
        assert d == 5
        
        def e = 10
        e %= 3
        assert e == 1
        
        def f = 3
        f **= 2
        assert f == 9

        // Relational operators
        assert 1 + 2 == 3 // equals
        assert 3 != 4 // different

        assert -2 < 3 // less than
        assert 2 <= 2 // less than or equal
        assert 3 <= 4

        assert 5 > 1 // greater than
        assert 5 >= -2 // greater than or equal

        // Logical operators
        assert !false          
        assert true && true     
        assert true || false

        // Bitwise operators
        // &: bitwise "and"
        // |: bitwise "or"
        // ^: bitwise "xor" (exclusive "or")
        // ~: bitwise negation

        // Bitshift operators
        assert 12.equals(3 << 2) // left shift     
        assert 24L.equals(3L << 3)         
        assert 48G.equals(3G << 4)         
        assert 4095 == -200 >>> 20 // right shift unsigned
        assert -1 == -200 >> 20 // right shift
        assert 2G == 5G >> 1
        assert -3G == -5G >> 1

        // Conditional operators
        assert (!true)    == false                      
        assert (!'foo')   == false                      
        assert (!'')      == true

        // Ternary operators
        // normal
        if (string!=null && string.length()>0) {
            result = 'Found'
        } else {
            result = 'Not found'
        }
        // ternary
        result = (string!=null && string.length()>0) ? 'Found' : 'Not found'

        // Regex operators
        // using single quote strings
        p = ~'foo' 
        // using double quotes strings                    
        p = ~"foo" 
        // the dollar-slashy string lets you use slashes and the dollar sign without having to escape them                          
        p = ~$/dollar/slashy $ string/$           
        // you can also use a GString!             
        p = ~"${pattern}"
        // Note: Typically, the match operator is used when the pattern involves a single exact match, otherwise the find operator might be more useful.
        // Find operators for regex
        def text = "some text to match"
        def m = text =~ /match/                                           
        assert m instanceof Matcher                                       
        if (!m) {                                                         
            throw new RuntimeException("Oops, text not found!")
        }
        // Match operators for regex
        m = text ==~ /match/                                              
        assert m instanceof Boolean                                       
        if (m) {                                                          
            throw new RuntimeException("Should not reach that point!")
        }

        // Spread operators
        def cars = [
            new Car(make: 'Peugeot', model: '508'),
            new Car(make: 'Renault', model: 'Clio')]       
        def makes = cars*.make                                
        assert makes == ['Peugeot', 'Renault']

        def items = [4,5]                      
        def list = [1,2,3,*items,6]            
        assert list == [1,2,3,4,5,6]

        def m1 = [c:3, d:4]                   
        def map = [a:1, b:2, *:m1]            
        assert map == [a:1, b:2, c:3, d:4]

        // Range operators
        def range = 0..5                                    
        assert (0..5).collect() == [0, 1, 2, 3, 4, 5]       
        assert (0..<5).collect() == [0, 1, 2, 3, 4]         
        assert (0<..5).collect() == [1, 2, 3, 4, 5]         
        assert (0<..<5).collect() == [1, 2, 3, 4]           
        assert (0..5) instanceof List                       
        assert (0..5).size() == 6
        
         
    }

    static class Car {
        String make
        String model
    }
}

