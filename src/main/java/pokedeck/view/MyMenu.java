package pokedeck.view;

import pokedeck.controllers.PagesController;
import pokedeck.models.MenuItemModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyMenu extends JPanel{
    ArrayList<JButton> elements;
    PagesController controller;
    public MyMenu(ArrayList<MenuItemModel> elements, PagesController controller){
        super();
        this.controller = controller;
        this.init(elements);
    }

   private void init(ArrayList<MenuItemModel> elements){
        this.setBackground(new Color(180,0,0));
       // this.setVisible(true);
        //this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(1200,60);
        System.out.println("ok");
        this.elements = new ArrayList<>();
        elements.forEach((value) -> {
            System.out.println("element");

            JButton jb = new JButton(value.getName());
            //jb.setSize(screenSize.width,screenSize.height);
            jb.addActionListener(this.controller);
            this.elements.add(jb);
            this.add(jb);
        });

    }

    @Override
    public void repaint() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width / 4,screenSize.height);
        super.repaint();
    }
}
