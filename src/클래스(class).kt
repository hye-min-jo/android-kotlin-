
class Human constructor(name: String) {
    val name = "jojo"

    fun eatingCake(){
        println("yummy~~~!")
    }
}




fun main(){
    val human = Human("ham")
    human.eatingCake()

    println("this human's name is ${human.name}")
}