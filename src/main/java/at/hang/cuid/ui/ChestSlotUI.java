package at.hang.cuid.ui;

import at.hang.cuid.data.BaseItem;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class ChestSlotUI extends JPanel {


    @Getter @Setter
    private BaseItem item = null;
    private JLabel lbText = new JLabel();

    public ChestSlotUI()
    {
        init();
    }

    public ChestSlotUI(BaseItem item)
    {
        this.item = item;
        init();
    }

    private void init()
    {
        super.setOpaque(true);
        super.setBackground(new Color(139, 139,139));
        super.setPreferredSize(new Dimension(50,50));
        super.setMinimumSize(new Dimension(50,50));

        lbText.setHorizontalAlignment(0);

        this.setLayout(new BorderLayout());
        this.add(lbText);

        updateText();

    }

    public void setItem(BaseItem item)
    {
        this.item = item;
        updateText();

    }

    private void updateText()
    {
        lbText.setText(item != null ? item.getDisplayName() : "");
    }
}
