abstract class Something {
    abstract void foo()
    abstract void bar()
}

Something something = {
    foo: {
        println "Foo"
    },
    bar: {
        println "Bar"
    }
} as Something


something.foo()
something.bar()