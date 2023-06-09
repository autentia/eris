package com.autentia.eris;

import com.autentia.eris.listener.EnterKeyListener;
import com.autentia.eris.service.ComponentService;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.ui.SearchTextField;
import com.intellij.ui.components.JBScrollPane;

import javax.swing.*;
import java.awt.*;

import static com.autentia.eris.component.Components.*;

public class ErisToolWindow {

    private final JPanel contentToolWindow;

    public JComponent getContent() {
        return contentToolWindow;
    }

    public ErisToolWindow() {
        contentToolWindow = new SimpleToolWindowPanel(true, false);
        JTextArea contextTextArea = new JTextArea(5, 20);
        contextTextArea.setName(CONTEXT_TEXT_AREA.component);
        JScrollPane contextScrollPane = new JBScrollPane(contextTextArea);

        ComponentService applicationService = ApplicationManager.getApplication().getService(ComponentService.class);
        applicationService.addComponent(CONTEXT_TEXT_AREA.component, contextTextArea);

        SearchTextField promptTextField = new SearchTextField();
        promptTextField.setName(PROMPT_TEXT_AREA.component);
        JScrollPane promptScrollPane = new JBScrollPane(promptTextField);
        promptScrollPane.setMaximumSize(new Dimension(2000, 1000));

        JTextArea answerTextArea = new JTextArea(5, 20);
        answerTextArea.setName(ANSWER_TEXT_AREA.component);
        applicationService.addComponent(ANSWER_TEXT_AREA.component, answerTextArea);
        JScrollPane answerScrollPane = new JBScrollPane(answerTextArea);

        EnterKeyListener listener = new EnterKeyListener(contextTextArea, promptTextField, answerTextArea);
        promptTextField.addKeyboardListener(listener);
        promptTextField.addKeyListener(listener);

        contentToolWindow.setLayout(new BoxLayout(contentToolWindow, BoxLayout.Y_AXIS));

        JPanel contextPanel = new JPanel();
        contextPanel.setMaximumSize(new Dimension(2000, 100));
        contextPanel.add(new JLabel(CONTEXT_PANEL.component));
        JPanel answerPanel = new JPanel();
        answerPanel.setMaximumSize(new Dimension(2000, 100));
        answerPanel.add(new JLabel(ANSWER_PANEL.component));

        contentToolWindow.add(contextPanel);
        contentToolWindow.add(contextScrollPane);
        contentToolWindow.add(promptScrollPane);
        contentToolWindow.add(answerPanel);
        contentToolWindow.add(answerScrollPane);
    }
}
