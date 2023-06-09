package com.autentia.eris;

import com.autentia.eris.listener.EnterKeyListener;
import com.autentia.eris.service.ComponentService;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.ui.SearchTextField;
import com.intellij.ui.components.JBScrollPane;

import javax.swing.*;
import java.awt.*;

public class ErisToolWindow {

    private final JPanel contentToolWindow;

    public JComponent getContent() {
        return contentToolWindow;
    }

    public ErisToolWindow() {
        contentToolWindow = new SimpleToolWindowPanel(true, false);
        JTextArea northTextArea = new JTextArea(5, 20);
        northTextArea.setName("northArea");
        JScrollPane northScrollPane = new JBScrollPane(northTextArea);

        ComponentService applicationService = ApplicationManager.getApplication().getService(ComponentService.class);
        applicationService.addComponent("northArea", northTextArea);

        SearchTextField centerTextArea = new SearchTextField();
        centerTextArea.setName("centerText");
        JScrollPane centerScrollPane = new JBScrollPane(centerTextArea);
        centerScrollPane.setMaximumSize(new Dimension(2000, 1000));

        JTextArea southTextArea = new JTextArea(5, 20);
        southTextArea.setName("southArea");
        applicationService.addComponent("southArea", southTextArea);
        JScrollPane southScrollPane = new JBScrollPane(southTextArea);

        EnterKeyListener listener = new EnterKeyListener(northTextArea, centerTextArea, southTextArea);
        centerTextArea.addKeyboardListener(listener);
        centerTextArea.addKeyListener(listener);

        contentToolWindow.setLayout(new BoxLayout(contentToolWindow, BoxLayout.Y_AXIS));

        JPanel northPanel = new JPanel();
        northPanel.setMaximumSize(new Dimension(2000, 100));
        northPanel.add(new JLabel("Context"));
        JPanel southPanel = new JPanel();
        southPanel.setMaximumSize(new Dimension(2000, 100));
        southPanel.add(new JLabel("Answer"));

        contentToolWindow.add(northPanel);
        contentToolWindow.add(northScrollPane);
        contentToolWindow.add(centerScrollPane);
        contentToolWindow.add(southPanel);
        contentToolWindow.add(southScrollPane);
    }
}
