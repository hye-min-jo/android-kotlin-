fun main(){
    ignoreNulls("jojo")
}

fun nullcheck(){
    var name1 :String ="joice"
    var nullname :String? =null

    var name1InUpperCase :String = name1.uppercase()

    var nulnameInUpperCase :String? = nullname?.toUpperCase()

    //?:(엘비스 연산자)
    val lastName :String? = "Jo"

    val fulName :String = name1+" "+(lastName?: "No lastname")

    println(fulName)

}

//!!
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper :String = mNotNull.toUpperCase()

    println(upper)

    val email : String? = "jojo0927@naver.com"
    email?.let{
        println("my email is ${email}")
    }
}