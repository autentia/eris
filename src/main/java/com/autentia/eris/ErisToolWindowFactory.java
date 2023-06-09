package com.autentia.eris;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class ErisToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull final Project project, final @NotNull ToolWindow toolWindow) {
        ErisToolWindow myToolWindow = new ErisToolWindow();
        ContentFactory contentFactory = ContentFactory.getInstance();
        Content content = contentFactory.createContent(myToolWindow.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
