import kotlin.math.PI
import kotlin.math.pow
import kotlin.reflect.typeOf

/*fun main() {
    println("Приветствую путник, введи свой возраст: ")
    var line: String;
    line = readLine().toString()
    var age: Int;
    while(line.isNotEmpty()){
        try {
            age = line.toInt()

            if (age > 18) {
                println("Getta out of here boomer")
            } else {
                println("Wellcome")
            }
            line = readLine().toString()
        }
        catch (e: Error)
        {
            println("Русским языком написано: введи возраст")
        }
    }*/
/*fun main() {
    //arrays and lists
    var myArray = arrayOf(1,3,7)
    var myList = listOf(1,3,7)
    var mutableList = mutableListOf<Int>(1,2,3,5)
    mutableList.add(10)
    var rainbowColours = arrayListOf<String>("Soome", "body", "is", " gaaay");
    var colours = listOf<String>("Red","Orange", "Yellow", "Green", "Blue", "Violet")
    rainbowColours.addAll(colours)
   for(i in 15 downTo  0 step 3 ){
       //print(i)
   }
  /* var  i = 0
    while(i<=100){
        if(i%2 == 0)
        {
            print(i)
        }
        i++
    }*/
    var map = mutableMapOf("Alex" to 19, "Mary" to 17)
    map["me"] = 20
    for((Name, age) in map)
    {
        println(" $Name is $age years old")
    }
    print(map.size)
}*/
/*fun main(){
    println("Make anonce ")
    var Name = readLine().toString().split(" ")
    fun Greeting(vararg name: String):String {
        var s: String = ""
        for(n in name) {
           s+="Hello, $n, how are u ?"
        }
        return s
    }
    println(Greeting(*Name.toTypedArray()))

}*/
fun main(){
    class Person(name:String?, age: Int){
        var Name = name
        var age =  age
        fun DoSomeThing(){
            print("Hello, My name is $Name and I am $age")
        }

    }
    var me = Person(null, 20)
    me.DoSomeThing()

}


