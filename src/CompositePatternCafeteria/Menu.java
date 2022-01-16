package CompositePatternCafeteria;

import java.util.LinkedList;

public class Menu extends MenuComponent{
    public LinkedList<MenuComponent> menuList;

    public Menu(){
        this.menuList = new LinkedList<MenuComponent>();
    }

    @Override
    public void addComponent(MenuItem c){
        menuList.add(c);
    }

    @Override
    public void getChild(){
        for(MenuComponent m : menuList){
            System.out.println(m.getName());
        }
    }
}
