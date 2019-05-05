fun main(args:Array<String>) {


    val a = 9
    val b = 9



    if (a == b) {
        println("Hurray!A is equal to B")
    } else
        println("Nope!The Value Of A is not equals to B")

    if (a != b)
        println("A is not equal B")

    val accBalance = 25
    val price = 10
    if (accBalance >= price)
        println("Yo!This Iteam is YOurs")
    else
        println("No!You Do not have enough Balance")

    val degreeCelcius = 0

    if (degreeCelcius >= 30)
        println("Its hot out here")
    else if (degreeCelcius < 30 && degreeCelcius >= 20)
        println("Its a pleasant weather")
    else
        println("Its cold Outside")

    // ==,!=,<,>,<=,>=,&&,||

    //Boolean ConditionalLogics
    val isHungry = false
    val isBored = true
    if (isBored || isHungry)// can be done by removing ==true from both the value
        println("Go and have a launch")
    else
        println("No worry")
    val x = 3

    when (x) {
        1 -> println("x==1.")
        2 -> println("x==2.")
        else -> println("x is not equals to 1 and 2.")

    }

    fun vaderisFeeling(mood:String="Angry") {
        if (mood == "Angry") {
            println("Run away vader is $mood")

        } else {
            println("Whatever you do don't make vader angry")
        }


    }
    vaderisFeeling("happy")



    fun valem (feel:String="Nothing"){

        if(feel == "Nothing"){
            println("Hello i am here")
    }else{
            println("Aur sab badhiya")
        }
}
    valem("Love")
}
