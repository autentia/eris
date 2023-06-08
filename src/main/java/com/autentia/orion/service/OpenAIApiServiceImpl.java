package com.autentia.orion.service;

import com.autentia.orion.settings.AppSettingsState;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

/**
 * OpenAI ChatGPT api integration implementation.
 */
public class OpenAIApiServiceImpl implements ApiService {
    @Override
    public String aiRequest(final String prompt) {
        OpenAiService service = new OpenAiService(AppSettingsState.getInstance().getOpenAIKey());
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .model("text-davinci-003")
                .echo(false)
                .maxTokens(1500)
                .temperature(0.7)
                .build();

        return service.createCompletion(completionRequest).getChoices().get(0).getText();
    }
}
