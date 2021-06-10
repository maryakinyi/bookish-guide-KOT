import javax.swing.SizeRequirements

fun main() {
var building=Building(23,"kula",1,"John")
   println( building.cost_of_construction(34000))
  println(building.requirement())
    var sort= listOf(Phone(23000,"oppo","new"),
        Phone(23500,"techno","tele"),Phone(13000,"sumsang","auto"))
    println(sort)
    var phones=sort.sortedBy { sort ->sort.cost }
    println(phones)

}
class  Building(var numberOfPeople:Int,var plotName:String,var plotSize:Int,var owner:String){
    fun requirement():List<String>{
        var needs= mutableListOf("cement","sand","paint","water")
        return needs
    }
   fun cost_of_construction(material_cost:Int):Int{
       var cost =(plotSize*numberOfPeople*material_cost)
        return  cost

   }
    }
data class Phone(var cost:Int,var name:String,var brand:String)
fun sortPhones(){



}
