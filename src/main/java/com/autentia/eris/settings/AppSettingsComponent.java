package com.autentia.eris.settings;

import com.intellij.ui.components.JBLabel;
import com.intellij.ui.components.JBTextField;
import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

public class AppSettingsComponent {

    private final JPanel myMainPanel;
    private final JBTextField apiKeyText = new JBTextField();

    public AppSettingsComponent() {
        myMainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent(
                        new JBLabel("Enter your OpenAI key: "), apiKeyText, 1, false)
                .addComponentFillVertically(new JPanel(), 0)
                .getPanel();

    }

    public JPanel getPanel() {
        return myMainPanel;
    }

    public JComponent getPreferredFocusedComponent() {
        return apiKeyText;
    }

    public String getApiKey() {
        return apiKeyText.getText();
    }

    public void setApiKey(final String newText) {
        apiKeyText.setText(newText);
    }
}
