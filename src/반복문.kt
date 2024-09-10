fun main(){
    forAndWhile()
}

fun forAndWhile(){

    val students :ArrayList<String> =arrayListOf("joice","james","jenmifer")

    for(name:String   in students){
        println("${name} ")
    }

    for ((index:Int,name :String) in students.withIndex()){
        println("${index+1} : $name")
    }

    var sum : Int = 0
    for (i:Int  in 2..10 step 2){
        sum+=i
    }
    for (i:Int in 10 downTo 1){
        sum+=i
    }
    for (i:Int in 1 until 100){
        sum+=i
    }
    println(sum  )

    var index=0
    while(index<10){
        println("current index :${index}")
        index++
    }
}