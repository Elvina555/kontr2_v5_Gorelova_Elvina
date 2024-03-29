import kotlinx.coroutines.delay
class Dairy_products(
    override var name:String,
    override var ves:Double,
    override var fatness:Double,
    override var proizv:String,
    override var skidka:Double,
    override var zena:Double):Milk_products()
{
    override fun Set_Info()
    {
        try
        {
            println("Введите название продукта:")
            this.name= readLine()!!.toString()
            do
            {
                println("Введите вес продукта в кг:")
                this.ves= readLine()!!.toDouble()
            }while(this.ves<0)
            do {
                println("Введите жирность продукта:")
                this.fatness= readLine()!!.toDouble()
            }while(this.fatness<0)
            println("Введите производителя продукта:")
            this.proizv=readLine()!!.toString()
            do
            {
               println("Введите цену продукта:")
                this.zena= readLine()!!.toDouble()
            }while(this.zena<0)
        }catch (e:Exception)
        {
            println("Данные введены не корректно")
        }
    }
    fun Skidka()
    {
        var a:Int
        println("У вас есть карта магазина?:")
        do
        {
            println("1-Да/2-Нет")
            a= readLine()!!.toInt()
        }while (a!=1 && a!=2)
        if(a==1)
        {
            this.skidka = this.zena*0.5
            println("Ваша цена за продукты со скидкой ${this.skidka}")
        }
        else
        if(a==2)
        {
            println("Ваша цена за продукты без скидки ${this.zena}")
        }
      }
    suspend fun Product(n:Int)
    {
        try
        {
            var prod=""
            for(i in 0..n-1)
            {
                println("Введите продукт:")
                prod+= readLine().toString()+" "
                delay(1000L)
            }
            println("Продукты за сегодняшний день: ${prod}")

        }catch (e:Exception)
        {
            println("Данные введены не корректно")
        }
    }
  }
