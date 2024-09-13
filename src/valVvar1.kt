var myBol=false
val myVal:String="hello"
    get(){
        if (myBol)
            return field

        else
            return field.toUpperCase()
    }

fun main(args:Array<String>){
    println(myVal)
    myBol=true
    println(myVal)
}