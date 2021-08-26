package at.hang.cuid.ui;

import at.hang.cuid.bl.CUIDBl;
import at.hang.cuid.bl.ChestBl;
import at.hang.cuid.data.BaseItem;
import at.hang.cuid.data.Pokemon;
import at.hang.cuid.dlg.PokemonDlg;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChestUI extends JFrame {

    @Getter
    private ChestBl chestBl;

    private boolean strg = false;

    private JPanel plContainer;

    public ChestUI(String name, int rowCount)
    {
        chestBl = new ChestBl(name,rowCount);
        init();
    }

    public ChestUI(ChestBl chestBl)
    {
        this.chestBl = chestBl;
        init();
    }

    public  ChestUI(int rowCount)
    {
        chestBl = new ChestBl("Unnamed", rowCount);

        init();
    }

    private void init()
    {
        this.setSize(new Dimension(800,500));
        this.setResizable(false);
        this.setLayout(new BorderLayout());

        this.add(new JPanel(), BorderLayout.WEST);
        this.add(new JPanel(), BorderLayout.EAST);
        this.add(new JPanel(), BorderLayout.SOUTH);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                onKeyPressedFrame(e);
            }
        });

        updateData();

    }

    private void updateData()
    {
        //Clear old data
        if(plContainer != null)
            this.remove(plContainer);

        plContainer = new JPanel();
        plContainer.setLayout(new GridLayout(chestBl.getItems().length+1, 1,0,2));
        plContainer.setName("plContainer");

        //Setting headline
        JLabel lbTitle = new JLabel();
        lbTitle.setName("lbHeadline");
        lbTitle.setText(chestBl.getName());
        plContainer.add(lbTitle);

        //Set Items
        JPanel row;
        ChestSlotUI slot;
        for(int r = 0; r < chestBl.getItems().length; r++)
        {
            row = new JPanel();
            row.setName("plRow"+r);
            row.setLayout(new GridLayout(1,9,2,0));

            for(int c = 0; c < 9; c++) {
                slot = new ChestSlotUI(chestBl.getItemAt(r, c));
                slot.setName(r+"/"+c);
                row.add(slot);
            }
            System.out.printf("r: "+r);
            plContainer.add(row);
        }

        this.add(plContainer, BorderLayout.CENTER);
        this.pack();

        plContainer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                onClickPlPanel(e);
            }
        });
    }


    private void onClickPlPanel(MouseEvent e)
    {
        Component comp = e.getComponent().getComponentAt(e.getX(), e.getY());

        if(!(comp instanceof JPanel))
        {
            System.out.printf("ChestUI - onClickPanel --> Not implemented yet 1");
            return;
        }

        JPanel row = (JPanel) comp;
        ChestSlotUI slot = null;
        try {
             slot = (ChestSlotUI) row.getComponentAt(e.getX() - row.getX(), e.getY() - row.getY());
        }
        catch(ClassCastException  cce)
        {
            return;
        }

        PokemonDlg dlg = null;
        if(chestBl.getItemAt(Integer.parseInt(slot.getName().split("/")[0]),Integer.parseInt(slot.getName().split("/")[1])) instanceof BaseItem)
            dlg = new PokemonDlg(this, Integer.parseInt(slot.getName().split("/")[0]), Integer.parseInt(slot.getName().split("/")[1]), (Pokemon) chestBl.getItemAt(Integer.parseInt(slot.getName().split("/")[0]),Integer.parseInt(slot.getName().split("/")[1])));
        else
            dlg = new PokemonDlg(this, Integer.parseInt(slot.getName().split("/")[0]), Integer.parseInt(slot.getName().split("/")[1]));


        // nDlg.setVisible(true);
        // _PokemonDlg dlg = new _PokemonDlg(this, Integer.parseInt(slot.getName().split("/")[0]), Integer.parseInt(slot.getName().split("/")[1]));
        dlg.setVisible(true);

        if(dlg.isOkay())
        {
            chestBl.setItemAt(dlg.getPokemon().getX(), dlg.getPokemon().getY(), dlg.getPokemon());
            slot.setItem(dlg.getPokemon());
        }
        else if(dlg.isDelete())
        {
            chestBl.setItemAt(Integer.parseInt(slot.getName().split("/")[0]), Integer.parseInt(slot.getName().split("/")[1]), null);
            slot.setItem(null);
        }

    }

    private void onKeyPressedFrame(KeyEvent e)
    {
        if(strg)
        {
            switch(e.getKeyCode())
            {
                case 83:
                {
                    CUIDBl.getInstance().saveChestInventory(chestBl);
                    System.out.println("Save");
                }break;
                default:
                    System.out.println("no command");
            }
        }
        strg = e.getKeyCode() == 17;
        System.out.println(e.getKeyCode());
    }
}
