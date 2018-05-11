package com.weather_viewer.gui.previews.start;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.weather_viewer.functional_layer.services.delayed_task.IPreview;
import com.weather_viewer.gui.general.General;

import javax.swing.*;
import java.awt.*;

import static java.awt.GraphicsDevice.WindowTranslucency.*;

public class StartPreview extends JFrame implements IPreview {
    private JPanel rootPanel;

    public StartPreview() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        boolean isPerPixelTranslucencySupported = gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);

        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.rootPanel);
        this.setUndecorated(true);

        if (isPerPixelTranslucencySupported) this.setBackground(new Color(0, 0, 0, 0));
        this.setIconImage(new ImageIcon(General.class.getResource("/images/PartlyCloudy.png")).getImage());

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.setDoubleBuffered(true);
        rootPanel.setName("");
        rootPanel.setOpaque(false);
        rootPanel.setPreferredSize(new Dimension(256, 256));
        final JLabel label1 = new JLabel();
        label1.setDoubleBuffered(true);
        label1.setIcon(new ImageIcon(getClass().getResource("/gifs/loading.gif")));
        label1.setText("");
        rootPanel.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
