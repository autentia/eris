package com.autentia.orion.service;

import com.intellij.openapi.components.Service;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Component related service. Stores Swing components for a better access
 */
@Service
public final class ComponentService {

    private Map<String, JComponent> components;

    public void addComponent(final String componentName, final JComponent component) {
        if (components == null) {
            components = new HashMap<>();
        }
        components.put(componentName, component);
    }

    public JComponent getComponentByName(final String componentName) {
        return components.get(componentName);
    }
}
