package pokedeck.controllers;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagesController implements ActionListener {

    ActionHandlerImpl handlerObject;

    public PagesController(ActionHandlerImpl handlerObject) {
        this.handlerObject = handlerObject;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.handlerObject.onActionPerformed((Component) e.getSource());
    }
}
