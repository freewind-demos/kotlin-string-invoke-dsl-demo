package example

fun main(args: Array<String>) {
    "abc" {
        println(this)
    }
}

operator fun String.invoke(fn: String.() -> Unit) {
    fn(this)
}