class ClosureBasic {    
    // A closure in Groovy is an open, anonymous, block of code that can take arguments, return a value and be assigned to a variable. 
    // In Groovy, it is an instance of the Closure class. Closures can take 0 or more parameters and always return a value.
    // Additionally, a closure may access surrounding variables outside its scope and use them — along with its local variables — during execution.
    // Furthermore, we can assign a closure to a variable or pass it as a parameter to a method. Therefore, a closure provides functionality for delayed execution.

    static void main(String[] args) {
        // Syntax
        // { [closureParameters -> ] statements }
       
        def incrementItem = { item++ } // A closure referencing a variable named item
        // { -> item++ } It is possible to explicitly separate closure parameters from code by adding an arrow (->)
       
        def printIt = { println it } // A closure using an implicit parameter (it)                           
       
        def explicitParamsPrintIt { it -> println it } // An alternative version where it is an explicit parameter
       
        def name = { name -> println name } // In that case it is often better to use an explicit name for the parameter            
       
        def twoParamsClosure =  { String x, int y ->                                
                                    println "hey ${x} the value is ${y}"
                                }
       
        def readInput = { reader ->                                         
                            def line = reader.readLine()
                            line.trim()
                        }


        // Calling closure
        def code = { 123 }
        code() // implicit calling
        code().call() // explicit calling

        // Closure Params
        // normal params
        def closureWithOneArg = { str -> str.toUpperCase() }
        assert closureWithOneArg('groovy') == 'GROOVY'

        def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
        assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'

        def closureWithTwoArgs = { a,b -> a+b }
        assert closureWithTwoArgs(1,2) == 3

        def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a+b }
        assert closureWithTwoArgsAndExplicitTypes(1,2) == 3

        def closureWithTwoArgsAndOptionalTypes = { a, int b -> a+b }
        assert closureWithTwoArgsAndOptionalTypes(1,2) == 3

        def closureWithTwoArgAndDefaultValue = { int a, int b=2 -> a+b }
        assert closureWithTwoArgAndDefaultValue(1) == 3

        // implicit params
        def greeting = { "Hello, $it!" 
        assert greeting('Patrick') == 'Hello, Patrick!'

        // varargs
        def concat1 = { String... args -> args.join('') }           
        assert concat1('abc','def') == 'abcdef'                     
        def concat2 = { String[] args -> args.join('') }            
        assert concat2('abc', 'def') == 'abcdef'

        def multiConcat = { int n, String... args ->                
            args.join('')*n
        }
        assert multiConcat(2, 'abc','def') == 'abcdefabcdef'
        }
    }
}