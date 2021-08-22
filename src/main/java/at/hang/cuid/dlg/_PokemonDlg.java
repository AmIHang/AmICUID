
package at.hang.cuid.dlg;

import at.hang.cuid.data.Pokemon;
import at.hang.cuid.data.PokemonEnum;
import at.hang.cuid.util.AmIUtils;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;


public class _PokemonDlg extends JDialog {

    @Getter
    private Pokemon pokemon;
    private PokemonEnum[] pkmEnum;
    private int posX,  posY;
    @Getter
    private boolean okay = false, delete = false;


    private JTextField tfSearch = new JTextField();
    private JComboBox cbSelectedPokemon = new JComboBox();

    private JTextArea taLore = new JTextArea();

    private JCheckBox cbOveride = new JCheckBox();
    private JCheckBox cbGerman = new JCheckBox();
    private JTextField tfDisplayName = new JTextField();
    private JTextField tfIdentiefier = new JTextField();
    private JComboBox cbForm = new JComboBox();
    private JCheckBox cbShiny = new JCheckBox();
    private JCheckBox cbKeepOpen = new JCheckBox();


    public _PokemonDlg(int x, int y)
    {
        System.out.println("Only for testing. remove before release!");
        posX = x;
        posY = y;

        init();
    }

    //Fresh dialog
    public _PokemonDlg(Frame owner, int x, int y)
    {
        super(owner, true);
        posX = x;
        posY = y;

        init();
    }

    //Dialog for editing
    public _PokemonDlg(Frame owner, Pokemon pkm)
    {
        super(owner, true);
        System.out.println("Not implemnted yet");
    }

    private void init()
    {

        this.setLayout(new BorderLayout());

        JPanel plMainDisplay = new JPanel();
        plMainDisplay.setLayout(new GridLayout(1,2));

        JPanel plLeft = new JPanel();
        plLeft.setLayout(new GridLayout(8,2,2,2));

        JButton btOkay = new JButton("Okay");
        JButton btDelete = new JButton("Delete");
        JButton btCancel = new JButton("Cancel");

        taLore.setBorder(BorderFactory.createTitledBorder("Lore"));
        tfSearch.setBorder(BorderFactory.createTitledBorder("Search"));
        cbSelectedPokemon.setBorder(BorderFactory.createTitledBorder("Selected Pokemon"));
        cbOveride.setHorizontalAlignment(SwingConstants.CENTER);
        cbShiny.setHorizontalAlignment(SwingConstants.LEFT);
        cbKeepOpen.setHorizontalAlignment(SwingConstants.LEFT);

        cbKeepOpen.setSelected(true);

        addRow(plLeft, tfSearch);
        addRow(plLeft, cbSelectedPokemon);
        addRow(plLeft, new AmIDesc("Override Generated Data"), cbOveride, new AmIDesc("German"), cbGerman);
        addRow(plLeft, new AmIDesc("Identifier"), tfIdentiefier);
        addRow(plLeft, new AmIDesc("Name"), tfDisplayName);
        addRow(plLeft, new AmIDesc("Form"), cbForm);
        addRow(plLeft, new AmIDesc("Shiny"), cbShiny, new AmIDesc("Keep Open"),cbKeepOpen);

        addRow(plLeft, btOkay, btDelete, btCancel);




        plMainDisplay.add(plLeft);
        plMainDisplay.add(new JScrollPane(taLore));
        this.add(plMainDisplay, BorderLayout.CENTER);
        this.pack();

        tfSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyTyped(e);
                onTfSearchKeyTyped(e);
            }
        });

        cbSelectedPokemon.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                fillCbForm();
                System.out.println(cbForm.getSelectedItem());

            }
        });

        cbOveride.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOverrideStatus(cbOveride.isSelected());
            }
        });

        cbGerman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateGeneratedData();
            }
        });

        cbForm.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(cbForm.getSelectedItem() != null)
                    updateGeneratedData();
            }
        });

        btOkay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okay = true;

                pokemon = new Pokemon((PokemonEnum) cbSelectedPokemon.getSelectedItem(), posX, posY);

                if(cbOveride.isSelected())
                {
                    pokemon.setDisplayName(tfDisplayName.getText());
                    pokemon.setIdentifier(tfIdentiefier.getText());

                    if(cbShiny.isSelected())
                        pokemon.setUnsafeData(pokemon.getUnsafeData()+"-s".toLowerCase(Locale.ROOT));

                    if(!cbForm.getSelectedItem().equals("default"))
                        pokemon.setUnsafeData(pokemon.getUnsafeData()+"-"+cbForm.getSelectedItem().toString().toLowerCase(Locale.ROOT));
                }
                dispose();
            }
        });

        btDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete = true;
                dispose();
            }
        });

        btCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        pkmEnum = PokemonEnum.values();
        fillCbSelectedPokemon();
        updateOverrideStatus(false);
    }

    private void addRow(JPanel panel, Component... comps)
    {
        JPanel plRow = new JPanel();
        plRow.setLayout(new GridLayout(1, comps.length));

        for(int i = 0; i < comps.length; i++)
            plRow.add(comps[i]);

        panel.add(plRow);
    }

    private void onTfSearchKeyTyped(KeyEvent e)
    {
        String in = tfSearch.getText().trim();

        //try parse
        try
        {
            pkmEnum = new PokemonEnum[]{PokemonEnum.getPokemonByID(Integer.parseInt(in))};
        }
        catch(NumberFormatException nfe)
        {
            pkmEnum = PokemonEnum.getPokemonThatContains(in);
        }

        fillCbSelectedPokemon();
    }

    private void fillCbSelectedPokemon()
    {
        cbSelectedPokemon.removeAllItems();

        for(int i = 0; i < pkmEnum.length; i++)
            cbSelectedPokemon.addItem(pkmEnum[i]);

    }

    private void fillCbForm()
    {
        cbForm.removeAllItems();
        if(cbSelectedPokemon.getSelectedItem() != null)
        {
            cbForm.addItem("default");

            PokemonEnum pkm = (PokemonEnum)cbSelectedPokemon.getSelectedItem();
            for(String f : pkm.getForm())
                cbForm.addItem(f);
        }

        updateGeneratedData();

    }

    private void updateGeneratedData()
    {
        if(cbSelectedPokemon.getSelectedItem() != null) {
            if (cbGerman.isSelected()) {
                tfIdentiefier.setText(((PokemonEnum) cbSelectedPokemon.getSelectedItem()).getNameDe().toLowerCase(Locale.ROOT) + (cbForm.getSelectedItem().equals("default") ? "" : "-" + cbForm.getSelectedItem()));
                tfDisplayName.setText(AmIUtils.toFancyString(((PokemonEnum) cbSelectedPokemon.getSelectedItem()).getNameDe() + (cbForm.getSelectedItem().equals("default") ? "" : "-" + cbForm.getSelectedItem())));
            } else {
                tfIdentiefier.setText(((PokemonEnum) cbSelectedPokemon.getSelectedItem()).getName().toLowerCase(Locale.ROOT) + (cbForm.getSelectedItem().equals("default") ? "" : "-" + cbForm.getSelectedItem()));
                tfDisplayName.setText(AmIUtils.toFancyString(((PokemonEnum) cbSelectedPokemon.getSelectedItem()).getName() + (cbForm.getSelectedItem().equals("default") ? "" : "-" + cbForm.getSelectedItem())));

            }
        }
    }

    private void updateOverrideStatus(boolean status)
    {
        tfIdentiefier.setEnabled(status);
        tfDisplayName.setEnabled(status);
        cbForm.setEnabled(status);
        cbShiny.setEnabled(status);
        cbKeepOpen.setEnabled(status);
    }

    private class AmIDesc extends JLabel
    {
        public AmIDesc(String text)
        {
            this.setText(text+": ");
        }
    }


}