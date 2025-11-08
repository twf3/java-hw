package ru.mirea.lab16;

import java.awt.*;

public class TextEditorTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            TextEditor app = new TextEditor();
            app.setVisible(true);
        });
    }
}
