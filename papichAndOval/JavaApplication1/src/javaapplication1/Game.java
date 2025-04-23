package javaapplication1;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author admin
 */
public class Game extends JFrame{

    private static Game game_game;
    private static long last_frame_time;
    private static Image cat;
    private static Image klubok;
    private static Image end;
    
    private static float drop_left = 200;
    private static float drop_top = -100;
    private static float drop_v = 200;
    private static int score = 0;
    
    
    public static void main(String[] args) throws IOException {
        
        cat = ImageIO.read(Game.class.getResourceAsStream("/cat.png"));
        klubok = ImageIO.read(Game.class.getResourceAsStream("/klubok.png"));
        end = ImageIO.read(Game.class.getResourceAsStream("/end.png"));
        
        
        game_game = new Game();
        game_game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_game.setLocation(200, 50);
        game_game.setSize(900, 600);
        game_game.setResizable(false);
        last_frame_time = System.nanoTime();
        game_game.setVisible(true);
        GameField game_field = new GameField();
        game_field.addMouseListener(new MouseAdapter(){
            @Override
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            float drop_right = drop_left + end.getWidth(null);
            float drop_bottom = drop_top + end.getHeight(null);
            boolean is_drop = x >= drop_left && x <= drop_right && y >= drop_top && y <= drop_bottom;
            
            if(is_drop){
                drop_top = -100;
                drop_left = (int) (Math.random() * (game_field.getWidth() - end.getWidth(null)));
                drop_v = drop_v + 10;
                score++;
                game_game.setTitle("Score: " + score);
            }
         
    }
    });
        game_game.add(game_field);
        game_game.setVisible(true);
        
    }
    
    public static void onRepaint(Graphics g){
        long current_time = System.nanoTime();
        float delt_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time;
        g.drawImage(end, 10, 10, null);
        g.drawImage(cat, 0, 0, null);
        g.drawImage(klubok, (int) drop_left, (int) drop_top, null);
        //g.fillOval(10,10,200,100);
        if(drop_top > game_game.getHeight()) g.drawImage(end, 210, 150, null);
        
    }
    
    public static class GameField extends JPanel{
        
        
        @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
            onRepaint(g);
            
    
    }
    
    
}
}

