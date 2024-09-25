import processing.core.*;

public class App extends PApplet{
    
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        size(800, 600); // Set the window size
    }

    public void draw() {
        background(mouseX, mouseY); // Set background to light gray
        
        // Set stroke and fill
        stroke(255, 0, 0);
        strokeWeight(5); // Set stroke color to black
        fill(150, 0, 255); // Set fill color to purple
        
        // Draw a triangle with vertices at (100, 100), (200, 300), and (300, 100)
        triangle(100, 100, 200, 300, 300, 300);

        stroke(0, 0, 255);
        strokeWeight(50); // Set stroke color to black
        fill(255, 0, 255);
        rect(500, 50, 300, 300);

        strokeWeight(20);
        line(300, 300, 500, 300);

    }


    


}
