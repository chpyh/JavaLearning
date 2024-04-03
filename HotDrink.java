// Создать наследника реализованного класса БутылкаВоды - ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
//выдающий продукт соответствующий имени, объёму и температуре.
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре.
// Формат сдачи: Ссылка на GitHub.

package Products;

public class HotDrink extends BottleOfWater {
    protected int temperature;
    public HotDrink(int cost, String name, int volume, int temperature){
        super(cost, name, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" +
        "temperature=" + temperature +
        ", volume=" + super.getVolume() + 
        ", cost=" + super.getCost() +
        ", name='" + super.getName() + '\'' +
        "}";
    }
    
    }


    
