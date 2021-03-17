import java.util.*

fun main() {
    name("Olga","Arthur","Esther","Marcus")
    cities()
    wholeNumbers()
    val names =people("vicky","stella","iman")
    println(Arrays.toString(names))

}
fun name(name1:String,name2:String,name3:String,name4:String){
    val nameArray=arrayOf(name1,name2,name3,name4)
    println(Arrays.toString(nameArray))
}
fun cities(){
    val cities=arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+","+cities[1].capitalize() +","+cities[2].capitalize()+","+cities[3].capitalize())

}
fun wholeNumbers(){
    val numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    val sum=(numbers[1]+numbers[4])
    println(sum)
    val index=numbers.indexOf(158)
    println(index)
    val sorting=numbers.sortedArray()
    for (elements in sorting){
        println(elements)

    }    }
fun people(nam1:String,nam2:String,nam3:String):Array<String>{
    val peopleArray=arrayOf(nam1,nam2,nam3)
    return peopleArray
}
