import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main()= coroutineScope {
    var dairy_products=Dairy_products("",0.0,0.0,"",0.0,0.0)
    dairy_products.Set_Info()
    dairy_products.Get_Info()
    dairy_products.Skidka()
    launch {
        var n:Int
        do
        {
            println("Введите кол-во продуков:")
            n= readLine()!!.toInt()
            dairy_products.Product(n)
        }while (n<=0)

    }
    delay(10000L)
}