fun sum(a:Int, b:Int):Int {
    var sum =0
    fun calSum(){
        for(j in a..b){
            sum += j
        }
    }
    calSum()
    return sum
}

fun main(args: Array<String>) {
    val result=sum(1,10)
    println(result)
}