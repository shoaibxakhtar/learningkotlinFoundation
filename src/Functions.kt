fun main (args: Array<String>){

    fun fwords(){
        println("What's your strongest desire")
    }
    fwords()

    fun makeAThing(line:String){
        println(line)

    }
    makeAThing("So this is the right way of doing this ")


    fun calculateTheNoOfGoodGuys(rebels:Int,Ewoks:Int):Int{
        val goodGuys = rebels+Ewoks
        return  goodGuys
    }

    println("The fUCK IS THYATTHE NUMBER OF GOOOD REBERS ARE ${calculateTheNoOfGoodGuys(9,99)}")


    fun iamfeeling(mood:String = "Angry"){
        println(mood)
    }

    iamfeeling()
    iamfeeling("Learning")

    fun name (line:String){
        println(line)
    }
    name("Jaan Ho tum hamara")



 }