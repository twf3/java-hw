package ru.mirea.lab5;
import javax.swing.*;
import java.awt.*;

public class ImageDisplay extends JPanel {
    private Image image;

    public ImageDisplay(String imagePath) {
        image = new ImageIcon(imagePath).getImage();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к фото");
            return;
        }

        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        ImageDisplay imagePanel = new ImageDisplay(args[0]);
        frame.add(imagePanel);

        frame.setVisible(true);
    }
}

// "C:\Users\kseni\Desktop\image1.png"