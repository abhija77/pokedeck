package pokedeck.view;

import pokedeck.controllers.ActionHandlerImpl;
import pokedeck.controllers.PagesController;
import pokedeck.models.MenuItemModel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fenetre extends JFrame implements ActionHandlerImpl {
    PagesController controller = new PagesController(this);

    public Fenetre(){
        super();
        this.init();
        this.setVisible(true);
    }

    public void init(){
        this.setSize(1200,1000);
        this.setState(NORMAL);
        this.setTitle("My Pokedeck");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        /* ************************** Add the vertical Menu on the west border *********************** */

        MenuItemModel menuItemModel = new MenuItemModel("Voir mon pokedeck");
        MenuItemModel menuItemModel1 = new MenuItemModel("Gérer mon pokedeck");
        ArrayList<MenuItemModel> items = new ArrayList<>();
        items.add(menuItemModel);
        items.add(menuItemModel1);
        MyMenu vm = new MyMenu(items,this.controller);
        this.add(vm);

        /* ***************************  ***************************** */
        MainPageManager mainPageManager = new MainPageManager();
        this.add(mainPageManager);


    }


    @Override
    public void onActionPerformed(Component component) {
        System.out.println(component.getName());
    }
}
