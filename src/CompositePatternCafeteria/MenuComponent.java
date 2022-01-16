package CompositePatternCafeteria;

public abstract class MenuComponent {
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public int getPrice(){
        throw new UnsupportedOperationException();
    }
    public void getChild(){
        throw new UnsupportedOperationException();
    }
    public void addComponent(MenuItem c){
        throw new UnsupportedOperationException();
    }
}
