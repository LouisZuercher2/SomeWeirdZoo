package CompositePatternCafeteria;

public class MenuItem extends MenuComponent{

    int price;
    String name;
    public MenuItem(int price, String name){
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int  getPrice(){
        return price;
    }
}
