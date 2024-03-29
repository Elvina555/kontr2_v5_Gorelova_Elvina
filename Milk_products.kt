abstract class Milk_products:Products
{
    abstract var name:String
    abstract var ves:Double
    abstract var fatness:Double
    abstract var proizv:String
    abstract var skidka:Double
    abstract var zena:Double
    override fun Get_Info()
    {
        println("Название продукта: ${this.name}\nВес: ${this.ves} кг.\nЖирность: ${this.fatness}\nПроизводитель: ${this.proizv}\nЦена:${this.zena} руб.")
    }
}