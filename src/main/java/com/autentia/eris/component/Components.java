package com.autentia.eris.component;

public enum Components {
    CONTEXT_TEXT_AREA("contextTextArea"),
    PROMPT_TEXT_AREA("promptTextField"),
    ANSWER_TEXT_AREA("answerTextArea"),
    CONTEXT_PANEL("contextPanel"),
    ANSWER_PANEL("answerPanel"),
    ;

    public final String component;

    Components(String label) {
        this.component = label;
    }
}
