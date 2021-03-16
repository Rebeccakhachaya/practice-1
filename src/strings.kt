fun main(){
hobbies()
    facts()

    println(sum(20,10,30))

}
fun hobbies() {
    var student = "I like playing football,handball and dancing"
    if (student.contains("football")) {
        println("true")
    }
}
    fun facts(){
        val character="I am a consul person"
        if(character.contains("consul")){
            println("thats me")
        }
    }
fun sum(a:Int,b:Int,c:Int): String{
    var add=a+b+c
    var result= add/3
    if(result>100){
        return "true"
    }else{
        return "false"
    }
}










