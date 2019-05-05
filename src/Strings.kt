fun main (args: Array<String>) {
    val str = "Hey My self Shoaib Akhtar"
    println(str)


    val str1 = "A.P.J Abdul Kalam said that \"Dreams are not those which you " +
            "see in sleep but are those which does not let you sleep\""
    println(str1)


    val rawCrawl = """ cA long time ago,
        cin a galaxy there was
        cThe Guradians of Galaxy""".trimMargin("c")


    println(rawCrawl)


//    for (char in rawCrawl){
//        println(char)
//    }

//    val contentw= str.contentEquals("Hey My self Shoaib Akhtar")
//println(contentw)


    val contains = str.contains("Shoaib", true)

    println(contains)

    val upper = str.toUpperCase()
    println(upper)

    val lower = str.toLowerCase()
    println(lower)


    val num = 99
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,9)

    println(subsequence)

    val man = "superman"
    val realhero = "Ironman"
    val captain = "CaptainAmerica"
    val smasher = "Hulk"
    val jaadu = "DoctorStrange"

    println("Once upon a time there was $man named $realhero and with help of $captain" +
            ", $smasher and $jaadu he saves the universe.")


    println("$man has ${man.length} characters." )
    println("$jaadu as full capital letter ${jaadu.toUpperCase()}")


}
