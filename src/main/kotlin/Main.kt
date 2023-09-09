fun main(args: Array<String>) {
    //1 задание
    val age1 = 42;
    val age2 = 21;

    //2 задание
    val avg1 = (age11 + age22) / 2;
    println("2-3. Среднее арифм. $avg1")

    //3 задание
    val age11 = age1.toDouble()
    val age22 = age2.toDouble()

    //4 задание
    val firstName = "Roman"
    val lastName = "Zinchenko"

    //5 задание
    val fullName = firstName + " " + lastName
    println("5. $fullName")

    //6 задание
    val myDetails = "Привет, меня зовут $fullName."
    println("6. $myDetails")

    //7 задание
    val triple = Triple (7,9,2023)
    
    //8 задание
    val (day,month,year) = triple;
    
    //9 задание
    val (month1, _ , year1) = triple;

    //10 задание
    val month2 = "4";
    val pair = Pair (month2, year);
    println("10. $pair")
}
