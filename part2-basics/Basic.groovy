class Basic {
    //  Single line comments

    /**
     * Multi line
     * comments
     */

    /**@
     * Some class groovydoc for Foo
     */
    class Foo {
        /**@
         * Some method groovydoc for bar
         */
        void bar() {

        }
    }

    // reserved keywords can be used for method names if quoted
        static def "abstract"() { true }
    // when calling such methods, the name must be qualified using "this."
    //  this.abstract()

    // Here are a few examples of valid identifiers (here, variable names):
    def name
    def item3
    def with_underscore
    def $dollarStart

    // But the following ones are invalid identifiers:
    // def 3tier
    // def a+b
    // def a#b

    def singleQuotedString = 'a single-quoted string'

    def concatenationString = 'ab' == 'a' + 'b'

    def doubleQuotedString = "a double-quoted string"

    def tripleQuotedString = '''a triple-single-quoted string'''

    // Escape sequence
    // \b - backspace
    // \f - formfeed
    // \n - newline
    // \r - carriage return
    // \s - single space
    // \t - tabulation
    // \\ - backslash
    // \' - single quote within a single-quoted string (and optional for triple-single-quoted and double-quoted strings)
    // \" - double quote within a double-quoted string (and optional for triple-double-quoted and single-quoted strings)

    // String interpolation
    def dogName = 'Guillaume' // a plain string
    def greeting = "Hello ${name}"
    def sum = "The sum of 2 and 3 equals ${2 + 3}"
    def person = [name: 'Guillaume', age: 36]
    def number = 3.14
    def escapeDollarSign = '$5' == "\$5"

    // Example of triple quoted string use case
    def personName = 'Groovy'
    def template = """
    Dear Mr ${name},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
    """

    // primitive types
    byte  b = 1
    char  c = 2
    short s = 3
    int   i = 4
    long  l = 5

    // infinite precision
    BigInteger bi =  6

    // Suffixes
    // BigInteger - G or g
    // Long - L or l
    // Integer - I or i
    // BigDecimal - G or g
    // Double - D or d
    // Float - F or f

    // Lists
    def numbersList = [1, 2, 3]
    def heterogeneousList = [1, "a", true]
    def lettersList = ['a', 'b', 'c', 'd']


    // Arrays
    String[] arrStr = ['Ananas', 'Banana', 'Kiwi']

    // Multi-dimensional arrays
    def matrix3 = new Integer[3][3]
    Integer[][] matrix2

    // Array initialization
    String[] groovyBooks = [ 'Groovy in Action', 'Making Java Groovy' ]

    // Maps
    def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
    def numbersMap = [1: 'one', 2: 'two']

    def key = 'name'
    def personMap = [key: 'Guillaume']
    // When you need to pass variable values as keys in your map definitions,
    // you must surround the variable or expression with parentheses:
    def personMapWithVariablesAsValues = [(key): 'Guillaume']

    // MainMethod
    static void main(String[] args) {

    }
}
