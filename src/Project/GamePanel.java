package Project;

import abstraction.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
public class GamePanel extends JPanel implements ActionListener {
    private final int B_WIDTH=600;
    private final int B_HEIGHT=600;
    private final int DOT_SIZE=25;
    private final int GAME_UNIT=(B_WIDTH*B_HEIGHT)/DOT_SIZE;
    private final int DELAY=75;
    private final int x[]=new int[GAME_UNIT];
    private final int y[]=new int[GAME_UNIT];


    int bodyParts=4;
    int applesEaten;
    int apple_x;
    int apple_y;
    char direction ='R';
    boolean running = false;
    Timer timer;
    Random random;
    GamePanel(){
        random=new Random();
        this.setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }
    private void startGame() {
        newApple();
        running=true;
        timer = new Timer(DELAY,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    private void draw(Graphics g) {
        if (running){
        for (int i = 0; i < B_HEIGHT / DOT_SIZE; i++) {
            g.drawLine(i * DOT_SIZE, 0, i * DOT_SIZE, B_HEIGHT);
            g.drawLine(0, i * DOT_SIZE, B_WIDTH, i * DOT_SIZE);
        }
        g.setColor(Color.red);
        g.fillOval(apple_x, apple_y, DOT_SIZE, DOT_SIZE);
        for (int i = 0; i < bodyParts; i++) {
            if (i == 0) {
                g.setColor(Color.green);
                g.fillRect(x[i], y[i], DOT_SIZE, DOT_SIZE);
            } else {
                g.setColor(new Color(45, 100, 0));
                g.fillRect(x[i], y[i], DOT_SIZE, DOT_SIZE);
            }
          }
        }
        else {
            gameOver(g);
        }
    }
    private void newApple() {
        apple_x=random.nextInt((int)(B_WIDTH/DOT_SIZE))*DOT_SIZE;
        apple_x=random.nextInt((int)(B_HEIGHT/DOT_SIZE))*DOT_SIZE;

    }
    private void move() {
        for (int z = bodyParts; z > 0; z--) {
            x[z] = x[z - 1];
            y[z] = y[z - 1];

        }
        switch (direction) {
            case 'U':
                y[0] = y[0] - DOT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + DOT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - DOT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + DOT_SIZE;
                break;
        }
    }
    private void checkApple() {
        if((x[0] == apple_x) && (y[0] == apple_y)){
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    private void checkCollection() {
        // checks if head collides with body
        for (int i=bodyParts;i>0;i--){
            if ((x[0] == x[i] && y[0] == y[i])){
                running = false;
            }
        }
        //check touches if head left border
        if(x[0]<0){
            running = false;
        }
        //check touches if head left border
        if(x[0]>B_WIDTH){
            running = false;
        }
        //check touches if head top border
        if(y[0]<0){
            running = false;
        }
        //check touches if head bottom border
        if(y[0]>B_HEIGHT){
            running = false;
        }
        if (!running){
            timer.stop();
        }
    }
    private void gameOver(Graphics g) {
        //game over text

        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Score: "+applesEaten,(B_WIDTH - metrics.stringWidth("Score:"+applesEaten))/2,g.getFont().getSize());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(running){
           move();
           checkApple();
           checkCollection();

       }
       repaint();
    }
    private class MyKeyAdapter extends KeyAdapter{
               @Override
                    public void keyPressed(KeyEvent e) {
                   switch (e.getKeyCode()) {
                       case KeyEvent.VK_LEFT:
                           if (direction != 'R') {
                               direction = 'L';
                           }
                           break;
                       case KeyEvent.VK_RIGHT:
                           if (direction != 'L') {
                               direction = 'R';
                           }
                           break;
                       case KeyEvent.VK_UP:
                           if (direction != 'D') {
                               direction = 'U';
                           }
                           break;
                       case KeyEvent.VK_DOWN:
                           if (direction != 'U') {
                               direction = 'D';
                           }
                           break;
                   }

               }
    }
}
