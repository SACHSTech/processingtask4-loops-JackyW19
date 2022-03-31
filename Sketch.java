import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
   // quadrant one
   
   for (int lineX = 20; lineX <= 199; lineX += 20){
    strokeWeight(2);
    line(lineX, 0, lineX, 200);

   }
     
   for (int lineY = 20; lineY <= 200; lineY += 20){
     line(0, lineY, 200, lineY);
    }

 // quadrant two
   for (int circleX = 230; circleX <= 390; circleX += 35){
     for (int circleY = 30; circleY <= 190; circleY += 35){
       strokeWeight(1);
       fill(255, 20, 147);
       ellipse(circleX, circleY, 23, 23);
       }
     }

 // quadrant three
   for (int line = 0; line <= (width/2); line+=1){
     for (int i = 0; i<width/2; i++){
       stroke(i, i, i);
       line(i, 0+height/2, i, height);
        } 
     }

 // quadrant four
   int petal = 0;

   translate(height / 1.3f, width / 1.3f);
   for (petal = 0; petal < 8; petal += 1) {
     rotate(TWO_PI / 8);
     fill(0, 100, 0);
    ellipse(0, 0, height / 12, width / 12);
     fill(252, 111, 3);
     stroke(1);
     ellipse(0, 0, height / 3, width / 24);
     fill(0, 100, 0);
     ellipse(0, 0, height / 12, width / 12);
   } 
 }
}