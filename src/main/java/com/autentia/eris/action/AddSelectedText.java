package com.autentia.eris.action;

import com.autentia.eris.service.ComponentService;
import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.DumbAwareAction;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Objects;

import static com.autentia.eris.component.Components.CONTEXT_TEXT_AREA;

/**
 * Action that adds selected text into the plugin upper text area
 */
public class AddSelectedText extends DumbAwareAction {
    @Override
    public void actionPerformed(@NotNull final AnActionEvent event) {
        Editor ediTorRequiredData = event.getRequiredData(CommonDataKeys.EDITOR);
        CaretModel caretModel = ediTorRequiredData.getCaretModel();
        String selectedText = caretModel.getCurrentCaret().getSelectedText();

        ToolWindow toolWindow = ToolWindowManager.getInstance(Objects.requireNonNull(event.getProject())).getToolWindow("Eris");
        if (toolWindow != null) {
            toolWindow.show();
        }

        ComponentService applicationService = ApplicationManager.getApplication().getService(ComponentService.class);
        JTextArea contextTextArea = (JTextArea) applicationService.getComponentByName(CONTEXT_TEXT_AREA.component);
        contextTextArea.setText(selectedText);
    }

    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.EDT;
    }

    @Override
    public void update(@NotNull final AnActionEvent event) {
        Editor editor = event.getRequiredData(CommonDataKeys.EDITOR);
        CaretModel caretModel = editor.getCaretModel();
        String selectedText = caretModel.getCurrentCaret().getSelectedText();
        event.getPresentation().setVisible(selectedText != null && !selectedText.isEmpty());
    }

}
