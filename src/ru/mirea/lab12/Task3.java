package ru.mirea.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс окна для анимации, наследуемый от JFrame
class SimpleAnimation extends JFrame {
    private int redX = 50, redY = 70;    // Позиция красного круга
    private int blueX = 50, blueY = 170; // Позиция синего круга
    private int greenX = 150, greenY = 150; // Позиция зеленого круга
    private int orangeX = 250, orangeY = 150; // Позиция оранжевого круга

    private int redDir = 1;    // Направление красного круга
    private int blueDir = 1;   // Направление синего круга
    private int greenDir = -1; // Направление зеленого круга
    private int orangeDir = 1; // Направление оранжевого круга

    public SimpleAnimation() {
        super("Анимация");
        setLayout(new FlowLayout());

        JButton startButton = new JButton("Старт");
        JButton stopButton = new JButton("Стоп");

        // обработчики событий
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startAnimation();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopAnimation();
            }
        });

        add(startButton);
        add(stopButton);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // actionPerformed выполняется каждые 50 мс
    Timer timer = new Timer(50, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // горизонтальное
            redX += 3 * redDir;
            // меняем направление
            if (redX > 300 || redX < 50) {
                redDir *= -1;
            }

            // вертикально
            blueY += 1 * blueDir;
            if (blueY > 200 || blueY < 50) {
                blueDir *= -1;
            }

            // по диагонали
            greenX += 4 * greenDir;
            greenY += 2 * greenDir;
            if (greenX > 300 || greenX < 50) {
                greenDir *= -1;
            }
            if (greenY > 200 || greenY < 50) {
                greenDir *= -1;
            }

            orangeX = 200 + (int)(70 * Math.cos(System.currentTimeMillis() / 200.0));
            orangeY = 200 + (int)(70 * Math.sin(System.currentTimeMillis() / 200.0));

            // перерисовываем окно
            repaint();
        }
    });

    private void startAnimation() {
        timer.start();
    }

    private void stopAnimation() {
        timer.stop();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.fillOval(redX, redY, 50, 50);

        g.setColor(Color.BLUE);
        g.fillOval(blueX, blueY, 40, 40);

        g.setColor(Color.GREEN);
        g.fillOval(greenX, greenY, 60, 60);

        g.setColor(Color.ORANGE);
        g.fillOval(orangeX, orangeY, 20, 20);
    }

    public static void main(String[] args) {
        new SimpleAnimation().setVisible(true);
    }
}