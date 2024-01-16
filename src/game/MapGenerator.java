package game;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;


public class MapGenerator {
    public int map[][];
    public int bricksWidth;
    public int bricksHeight;


    public MapGenerator(int row , int col){
        map = new int[row][col];
        for (int[] map1 : map) {
            for (int j = 0; j < map[0].length; j++) {
                map1[j] = 1;
            }
        }
        bricksWidth = 540/col;
        bricksHeight = 150/row;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    getRandomColor(g);
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.pink);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                }
            }

        }
    }
    public void getRandomColor(Graphics2D g){
         Random r = new Random();
         int x = r.nextInt(7);
         switch (x) {
             case 1:
                 g.setColor(Color.GREEN);
             case 2:
                 g.setColor(Color.cyan);
             case 3:
                 g.setColor(Color.orange);
             case 4:
                 g.setColor(Color.MAGENTA);
             case 5:
                 g.setColor(Color.gray);
             case 6:
                 g.setColor(Color.YELLOW);
             default:
                 g.setColor(Color.BLACK);
         }
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }
}