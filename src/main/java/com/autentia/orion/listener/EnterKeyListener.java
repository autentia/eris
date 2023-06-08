package com.autentia.orion.listener;

import com.autentia.orion.service.ApiService;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.ui.SearchTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Listener action that is fired when enter key is pressed in the prompt text. This fires API integration.
 */
public class EnterKeyListener implements ActionListener, KeyListener {

    private final JTextArea contextInput;
    private final SearchTextField promptInput;
    private final JTextArea resultInput;

    public EnterKeyListener(final JTextArea contextInput,
                            final SearchTextField promptInput,
                            final JTextArea resultInput) {
        this.contextInput = contextInput;
        this.promptInput = promptInput;
        this.resultInput = resultInput;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        // not needed action
    }

    @Override
    public void keyTyped(final KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            String context = contextInput.getText();
            String promptText = context + " " + promptInput.getText();

            resultInput.setText("WAITING RESPONSE...");

            ApiService applicationService = ApplicationManager.getApplication().getService(ApiService.class);
            resultInput.setText(applicationService.aiRequest(promptText));

        }
    }

    @Override
    public void keyPressed(final KeyEvent e) {
        // not needed action
    }

    @Override
    public void keyReleased(final KeyEvent e) {
        // not needed action
    }
}
