package at.hang.cuid.dlg;

import at.hang.cuid.data.Pokemon;
import at.hang.cuid.data.PokemonEnum;
import at.hang.cuid.util.AmIUtils;
import lombok.Getter;

import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

/**
 *
 * @author User
 */
public class PokemonDlg extends javax.swing.JDialog {

    /**
     * Creates new form PokemonDlg
     */
    private int posX;
    private int posY;

    @Getter
    private Pokemon pokemon;

    @Getter
    private boolean okay = false;
    @Getter
    private boolean delete = false;

    //Vars for dragging window
    private boolean drag = false;
    private int dragX;
    private int dragY;

    public PokemonDlg(Frame owner, int x, int y)
    {
        super(owner, true);
        initComponents();

        this.posX = x;
        this.posY = y;
    }

    public PokemonDlg(Frame owner, int x, int y, Pokemon pokemon)
    {
        super(owner, true);
        initComponents();

        this.posX = x;
        this.posY = y;

        String id = pokemon.getUnsafeData().split("/")[2].split("-")[0];
        tfSearch.setText(id);

        tfIdentifier.setText(pokemon.getIdentifier());
        tfDisplayname.setText(pokemon.getDisplayName());
        onSearchPokemon(null);

        boolean first = true;
        for(String str : pokemon.getLore()) {
            if(!first)
                taLore.append("\n");
            taLore.append(str);

            first = false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        plDisplay = new javax.swing.JPanel();
        lbSearchPokemon = new javax.swing.JLabel();
        cbOverrideData = new javax.swing.JCheckBox();
        lbLine1 = new javax.swing.JLabel();
        lbForm = new javax.swing.JLabel();
        lbDisplayname = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        cbShiny = new javax.swing.JCheckBox();
        cbKeepOpen = new javax.swing.JCheckBox();
        lbLore = new javax.swing.JLabel();
        lbCurrentPokemon = new javax.swing.JLabel();
        lbLine2 = new javax.swing.JLabel();
        btOkay = new javax.swing.JButton();
        btClearLore = new javax.swing.JButton();
        btCancle = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        plSearchbar = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        lbSearchIcon = new javax.swing.JLabel();
        plDecoration = new javax.swing.JPanel();
        lbClose = new javax.swing.JLabel();
        lbIdentifier = new javax.swing.JPanel();
        tfIdentifier = new javax.swing.JTextField();
        plDisplayname = new javax.swing.JPanel();
        tfDisplayname = new javax.swing.JTextField();
        plSelectedPokemon = new javax.swing.JPanel();
        cbSelectedPokemon = new javax.swing.JComboBox<>();
        plForm = new javax.swing.JPanel();
        cbForm = new javax.swing.JComboBox<>();
        lbLine3 = new javax.swing.JLabel();
        plLore = new javax.swing.JPanel();
        spLore = new javax.swing.JScrollPane();
        taLore = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        plDisplay.setBackground(new java.awt.Color(18, 18, 18));
        plDisplay.setForeground(new java.awt.Color(148, 148, 148));
        plDisplay.setMaximumSize(new java.awt.Dimension(32767, 440));

        lbSearchPokemon.setForeground(new java.awt.Color(148, 148, 148));
        lbSearchPokemon.setText("Search for Pokemon");

        cbOverrideData.setBackground(new java.awt.Color(18, 18, 18));
        cbOverrideData.setForeground(new java.awt.Color(218, 218, 218));
        cbOverrideData.setText("Override generated data");
        cbOverrideData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOverrideDataActionPerformed(evt);
            }
        });

        lbLine1.setBackground(new java.awt.Color(83, 83, 83));
        lbLine1.setMaximumSize(new java.awt.Dimension(0, 3));
        lbLine1.setOpaque(true);
        lbLine1.setPreferredSize(new java.awt.Dimension(4, 1));

        lbForm.setForeground(new java.awt.Color(148, 148, 148));
        lbForm.setText("Form");
        lbForm.setToolTipText("");

        lbDisplayname.setForeground(new java.awt.Color(148, 148, 148));
        lbDisplayname.setText("Displayname");
        lbDisplayname.setToolTipText("");

        lbId.setForeground(new java.awt.Color(148, 148, 148));
        lbId.setText("Identifier");
        lbId.setToolTipText("");

        cbShiny.setBackground(new java.awt.Color(18, 18, 18));
        cbShiny.setForeground(new java.awt.Color(148, 148, 148));
        cbShiny.setText("Shiny");
        cbShiny.setEnabled(false);

        cbKeepOpen.setBackground(new java.awt.Color(18, 18, 18));
        cbKeepOpen.setForeground(new java.awt.Color(148, 148, 148));
        cbKeepOpen.setSelected(true);
        cbKeepOpen.setText("Keep-Open");
        cbKeepOpen.setToolTipText("");
        cbKeepOpen.setEnabled(false);

        lbLore.setForeground(new java.awt.Color(148, 148, 148));
        lbLore.setText("Lore");

        lbCurrentPokemon.setForeground(new java.awt.Color(148, 148, 148));
        lbCurrentPokemon.setText("Current Pokemon");

        lbLine2.setBackground(new java.awt.Color(83, 83, 83));
        lbLine2.setText("f");
        lbLine2.setOpaque(true);

        btOkay.setBackground(new java.awt.Color(46, 46, 46));
        btOkay.setForeground(new java.awt.Color(148, 148, 148));
        btOkay.setText("Okay");
        btOkay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btOkay.setContentAreaFilled(false);
        btOkay.setFocusPainted(false);
        btOkay.setOpaque(true);
        btOkay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOkay(evt);
            }
        });

        btClearLore.setBackground(new java.awt.Color(46, 46, 46));
        btClearLore.setForeground(new java.awt.Color(148, 148, 148));
        btClearLore.setText("Clear Lore");
        btClearLore.setBorder(null);
        btClearLore.setContentAreaFilled(false);
        btClearLore.setFocusPainted(false);
        btClearLore.setOpaque(true);
        btClearLore.setPreferredSize(new java.awt.Dimension(41, 24));
        btClearLore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLore();
            }
        });

        btCancle.setBackground(new java.awt.Color(46, 46, 46));
        btCancle.setForeground(new java.awt.Color(148, 148, 148));
        btCancle.setText("Cancle");
        btCancle.setBorder(null);
        btCancle.setContentAreaFilled(false);
        btCancle.setFocusPainted(false);
        btCancle.setOpaque(true);
        btCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancle();
            }
        });

        btDelete.setBackground(new java.awt.Color(46, 46, 46));
        btDelete.setForeground(new java.awt.Color(148, 148, 148));
        btDelete.setText("Delete");
        btDelete.setBorder(null);
        btDelete.setContentAreaFilled(false);
        btDelete.setFocusPainted(false);
        btDelete.setOpaque(true);
        btDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDelete();
            }
        });

        plSearchbar.setBackground(new java.awt.Color(46, 46, 46));

        tfSearch.setBackground(new java.awt.Color(46, 46, 46));
        tfSearch.setForeground(new java.awt.Color(225, 225, 225));
        tfSearch.setBorder(null);
        tfSearch.setCaretColor(new java.awt.Color(225, 225, 225));
        tfSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                onSearchPokemon(e);
            }
        });


        lbSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_search_32px_1.png"))); // NOI18N

        javax.swing.GroupLayout plSearchbarLayout = new javax.swing.GroupLayout(plSearchbar);
        plSearchbar.setLayout(plSearchbarLayout);
        plSearchbarLayout.setHorizontalGroup(
                plSearchbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plSearchbarLayout.createSequentialGroup()
                                .addComponent(lbSearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plSearchbarLayout.setVerticalGroup(
                plSearchbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfSearch)
                        .addComponent(lbSearchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        plDecoration.setBackground(new java.awt.Color(187, 134, 252));
        plDecoration.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                onMenuDragged(evt);
            }
        });
        plDecoration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onMenuPressed(evt);
            }
        });

        lbClose.setBackground(new java.awt.Color(187, 134, 252));
        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_window.png"))); // NOI18N
        //lbClose.setText("jLabel1");
        lbClose.setOpaque(true);
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClickClose(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onMouseEnteredClose(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                onMouseExitedClose(evt);
            }
        });

        javax.swing.GroupLayout plDecorationLayout = new javax.swing.GroupLayout(plDecoration);
        plDecoration.setLayout(plDecorationLayout);
        plDecorationLayout.setHorizontalGroup(
                plDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDecorationLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        plDecorationLayout.setVerticalGroup(
                plDecorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lbIdentifier.setBackground(new java.awt.Color(46, 46, 46));
        lbIdentifier.setPreferredSize(new java.awt.Dimension(222, 25));

        tfIdentifier.setBackground(new java.awt.Color(46, 46, 46));
        tfIdentifier.setForeground(new java.awt.Color(225, 225, 225));
        tfIdentifier.setBorder(null);
        tfIdentifier.setCaretColor(new java.awt.Color(225, 225, 225));
        tfIdentifier.setEnabled(false);

        javax.swing.GroupLayout lbIdentifierLayout = new javax.swing.GroupLayout(lbIdentifier);
        lbIdentifier.setLayout(lbIdentifierLayout);
        lbIdentifierLayout.setHorizontalGroup(
                lbIdentifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbIdentifierLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfIdentifier, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );
        lbIdentifierLayout.setVerticalGroup(
                lbIdentifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfIdentifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        plDisplayname.setBackground(new java.awt.Color(46, 46, 46));

        tfDisplayname.setBackground(new java.awt.Color(46, 46, 46));
        tfDisplayname.setForeground(new java.awt.Color(225, 225, 225));
        tfDisplayname.setBorder(null);
        tfDisplayname.setCaretColor(new java.awt.Color(225, 225, 225));
        tfDisplayname.setEnabled(false);

        javax.swing.GroupLayout plDisplaynameLayout = new javax.swing.GroupLayout(plDisplayname);
        plDisplayname.setLayout(plDisplaynameLayout);
        plDisplaynameLayout.setHorizontalGroup(
                plDisplaynameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDisplaynameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfDisplayname))
        );
        plDisplaynameLayout.setVerticalGroup(
                plDisplaynameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plDisplaynameLayout.createSequentialGroup()
                                .addComponent(tfDisplayname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        plSelectedPokemon.setBackground(new java.awt.Color(46, 46, 46));

        cbSelectedPokemon.setBackground(new java.awt.Color(46, 46, 46));
        cbSelectedPokemon.setForeground(new java.awt.Color(225, 225, 225));
        cbSelectedPokemon.setBorder(null);

        PokemonEnum[] pkms = PokemonEnum.values();
        for(int i = 0; i < pkms.length; i++)
            cbSelectedPokemon.addItem(pkms[i]);

        if(cbSelectedPokemon.getSelectedItem() != null)
        {
            tfIdentifier.setText(((PokemonEnum)cbSelectedPokemon.getSelectedItem()).getName().toLowerCase(Locale.ROOT));
            tfDisplayname.setText(AmIUtils.toFancyString(((PokemonEnum)cbSelectedPokemon.getSelectedItem()).getName()));
        }

        cbSelectedPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCbForm(e);
            }
        });

        javax.swing.GroupLayout plSelectedPokemonLayout = new javax.swing.GroupLayout(plSelectedPokemon);
        plSelectedPokemon.setLayout(plSelectedPokemonLayout);
        plSelectedPokemonLayout.setHorizontalGroup(
                plSelectedPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plSelectedPokemonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbSelectedPokemon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plSelectedPokemonLayout.setVerticalGroup(
                plSelectedPokemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbSelectedPokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        plForm.setBackground(new java.awt.Color(46, 46, 46));

        cbForm.setBackground(new java.awt.Color(46, 46, 46));
        cbForm.setForeground(new java.awt.Color(225, 225, 225));
        cbForm.setBorder(null);
        cbForm.setOpaque(false);


        javax.swing.GroupLayout plFormLayout = new javax.swing.GroupLayout(plForm);
        plForm.setLayout(plFormLayout);
        plFormLayout.setHorizontalGroup(
                plFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbForm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plFormLayout.setVerticalGroup(
                plFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plFormLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbForm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbLine3.setBackground(new java.awt.Color(83, 83, 83));
        lbLine3.setOpaque(true);

        plLore.setBackground(new java.awt.Color(46, 46, 46));

        spLore.setBorder(null);
        spLore.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spLore.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taLore.setBackground(new java.awt.Color(46, 46, 46));
        taLore.setColumns(20);
        taLore.setForeground(new java.awt.Color(225, 225, 225));
        taLore.setRows(5);
        taLore.setBorder(null);
        taLore.setCaretColor(new java.awt.Color(225, 225, 225));
        spLore.setViewportView(taLore);

        javax.swing.GroupLayout plLoreLayout = new javax.swing.GroupLayout(plLore);
        plLore.setLayout(plLoreLayout);
        plLoreLayout.setHorizontalGroup(
                plLoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plLoreLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(spLore, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
        );
        plLoreLayout.setVerticalGroup(
                plLoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plLoreLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(spLore))
        );

        javax.swing.GroupLayout plDisplayLayout = new javax.swing.GroupLayout(plDisplay);
        plDisplay.setLayout(plDisplayLayout);
        plDisplayLayout.setHorizontalGroup(
                plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plDisplayLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCurrentPokemon)
                                        .addComponent(lbSearchPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDisplayLayout.createSequentialGroup()
                                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                                .addComponent(btOkay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(22, 22, 22)
                                                                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(plForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(plDisplayname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                                .addComponent(lbForm, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18))
                                                                        .addComponent(plSelectedPokemon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lbLine3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(cbOverrideData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lbDisplayname, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(plDisplayLayout.createSequentialGroup()
                                                                                        .addComponent(cbShiny)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(cbKeepOpen))
                                                                                .addComponent(lbId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addComponent(lbIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(19, 19, 19)))
                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(lbLore, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btClearLore, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(plLore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(plSearchbar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(plDisplayLayout.createSequentialGroup()
                                .addComponent(plDecoration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        plDisplayLayout.setVerticalGroup(
                plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plDisplayLayout.createSequentialGroup()
                                .addComponent(plDecoration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSearchPokemon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbLine3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbCurrentPokemon)
                                                        .addComponent(lbLore))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                .addComponent(plLore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btClearLore, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(plDisplayLayout.createSequentialGroup()
                                                                .addComponent(plSelectedPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(cbOverrideData)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(lbId)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)
                                                                .addComponent(lbDisplayname)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(plDisplayname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbForm)
                                                                .addGap(1, 1, 1)
                                                                .addComponent(plForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(cbShiny, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cbKeepOpen))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(plDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btOkay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cbForm.addItem("default");

        PokemonEnum pkm = (PokemonEnum) cbSelectedPokemon.getSelectedItem();
        for(String f : pkm.getForm())
            cbForm.addItem(f);

        pack();
    }// </editor-fold>


    private void onSearchPokemon(KeyEvent e)
    {
        if(!tfSearch.getText().isBlank())
        {
            cbSelectedPokemon.removeAllItems();
            try
            {
                cbSelectedPokemon.addItem(PokemonEnum.getPokemonByID(Integer.parseInt(tfSearch.getText())));


            }
            catch(NumberFormatException nfe)
            {
                PokemonEnum[] pkms = PokemonEnum.getPokemonThatContains(tfSearch.getText().trim());
                for (int i = 0; i < pkms.length; i++)
                    cbSelectedPokemon.addItem(pkms[i]);
            }
        }

    }

    private void updateCbForm(ActionEvent e)
    {
        System.out.println("update");
        cbForm.removeAllItems();
        if(cbSelectedPokemon.getSelectedItem() != null)
        {
            cbForm.addItem("default");

            PokemonEnum pkm = (PokemonEnum) cbSelectedPokemon.getSelectedItem();
            for(String f : pkm.getForm())
                cbForm.addItem(f);

        }

        if(cbSelectedPokemon.getSelectedItem() != null)
        {
            tfIdentifier.setText(((PokemonEnum)cbSelectedPokemon.getSelectedItem()).getName().toLowerCase(Locale.ROOT));
            tfDisplayname.setText(AmIUtils.toFancyString(((PokemonEnum)cbSelectedPokemon.getSelectedItem()).getName()));
        }
    }

    private void cbOverrideDataActionPerformed(java.awt.event.ActionEvent evt) {
        tfIdentifier.setEnabled(cbOverrideData.isSelected());
        tfDisplayname.setEnabled(cbOverrideData.isSelected());
        cbShiny.setEnabled(cbOverrideData.isSelected());
        cbKeepOpen.setEnabled(cbOverrideData.isSelected());
    }

    private void onClickClose(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void onMouseEnteredClose(java.awt.event.MouseEvent evt) {
        lbClose.setBackground(new Color(232,17,35));
        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_window_hover.png")));
    }

    private void onMouseExitedClose(java.awt.event.MouseEvent evt) {
        lbClose.setBackground(new Color(187,134,252));
        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_window.png")));
    }

    private void onMenuPressed(java.awt.event.MouseEvent evt) {
        dragX = evt.getX();
        dragY = evt.getY();
    }

    private void onMenuDragged(java.awt.event.MouseEvent evt) {
        this.setLocation(this.getLocation().x + evt.getX() - dragX,
                this.getLocation().y + evt.getY() - dragY);
    }

    private void onOkay(java.awt.event.ActionEvent evt) {
        okay = true;

        if(cbSelectedPokemon.getSelectedItem() != null)
        {
            pokemon = new Pokemon((PokemonEnum) cbSelectedPokemon.getSelectedItem(), posX, posY);

            if(cbOverrideData.isSelected())
            {
                pokemon.setDisplayName(tfDisplayname.getText());
                pokemon.setIdentifier(tfIdentifier.getText());

                if(cbShiny.isSelected())
                    pokemon.setUnsafeData(pokemon.getUnsafeData()+"-s");

                if(!cbForm.getSelectedItem().toString().equals("default"))
                    pokemon.setUnsafeData(pokemon.getUnsafeData()+"-"+cbForm.getSelectedItem().toString().toLowerCase(Locale.ROOT));
            }

            if(!taLore.getText().isBlank())
                pokemon.setLore(taLore.getText().split("\n"));

        }

        this.dispose();
    }

    private void onDelete()
    {
        delete = true;
        this.dispose();
    }

    private void onCancle()
    {
        this.dispose();
    }

    private void clearLore()
    {
        taLore.setText("");
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btCancle;
    private javax.swing.JButton btClearLore;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btOkay;
    private javax.swing.JComboBox<String> cbForm;
    private javax.swing.JCheckBox cbKeepOpen;
    private javax.swing.JCheckBox cbOverrideData;
    private javax.swing.JComboBox<PokemonEnum> cbSelectedPokemon;
    private javax.swing.JCheckBox cbShiny;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbCurrentPokemon;
    private javax.swing.JLabel lbDisplayname;
    private javax.swing.JLabel lbForm;
    private javax.swing.JLabel lbId;
    private javax.swing.JPanel lbIdentifier;
    private javax.swing.JLabel lbLine1;
    private javax.swing.JLabel lbLine2;
    private javax.swing.JLabel lbLine3;
    private javax.swing.JLabel lbLore;
    private javax.swing.JLabel lbSearchIcon;
    private javax.swing.JLabel lbSearchPokemon;
    private javax.swing.JPanel plDecoration;
    private javax.swing.JPanel plDisplay;
    private javax.swing.JPanel plDisplayname;
    private javax.swing.JPanel plForm;
    private javax.swing.JPanel plLore;
    private javax.swing.JPanel plSearchbar;
    private javax.swing.JPanel plSelectedPokemon;
    private javax.swing.JScrollPane spLore;
    private javax.swing.JTextArea taLore;
    private javax.swing.JTextField tfDisplayname;
    private javax.swing.JTextField tfIdentifier;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration
}
