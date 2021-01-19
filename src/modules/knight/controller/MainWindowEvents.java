package modules.knight.controller;

import core.model.game.BoardPosition;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import modules.knight.model.BoardDefinition;
import modules.knight.model.KnightsSolver;
import modules.knight.view.MainWindow;

/**
 *
 * @author Bernat Galmés Rubert
 */
public class MainWindowEvents implements ActionListener, ChangeListener {

    private MainWindow view;
    private BoardDefinition model;

    public MainWindowEvents(MainWindow view, BoardDefinition model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String accio = e.getActionCommand();
            switch (accio) {
                case "compute" :{
                    KnightsSolver solution = new KnightsSolver(model.getBoardSize(),model.getInitialPosition().x,model.getInitialPosition().y);
                    //view.reset();
                    view.colocaPeces(solution.getDrawnBoard());
                    break;
                }

                default :
                    throw new badSelection();
            }
           
        } catch (badSelection ex) {
            Logger.getLogger(MainWindowEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        javax.swing.JSpinner sp_boardSize = (javax.swing.JSpinner) ce.getSource();
        if(model.getBoardSize() != (int)sp_boardSize.getValue()){
            model.setBoardSize((int) sp_boardSize.getValue());
            view.updateView();
        }
        else{
            javax.swing.JSpinner column = (javax.swing.JSpinner) ce.getSource();
            javax.swing.JSpinner row = (javax.swing.JSpinner) ce.getSource();
            BoardPosition actualBoardPosition = new BoardPosition((int) column.getValue(), (int) row.getValue());
            model.setInitialPosition(actualBoardPosition);
            
        }
        System.out.println(model.getInitialPosition().x + "" + model.getInitialPosition().y);   //pruevas borrar mas tarde
    }
    

    public class badSelection extends Exception {
    }
}
