import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(200,200);
}
public void draw()
{
	noFill();
	noStroke();
	fill(205,133,63);	
  ellipse(100,100,100,100);//head
  ellipse(80,140,30,30);
  ellipse(120,140,30,30);//bottom 
  ellipse(140,125,30,30);
  ellipse(60,125,30,30);//second lowest
  ellipse(50,100,30,30);
  ellipse(150,100,30,30);//side
  ellipse(75,50,25,30);
  ellipse(125,50,25,30);//ears
  stroke(0,0,0);
  fill(255,255,255);
  rect(75,110,25,45);
  rect(100,110,25,45);//teeth
  fill(255,222,173);
  noStroke();
  ellipse(100,85,40,40);
  ellipse(78,95,25,40);
  ellipse(122,95,25,40);//mask thingy?
  stroke(0,0,0);
  fill(101,67,33);
  ellipse(100,115,70,40);//muzzle thingy?
  fill(255,100,100);
  ellipse(100,108,10,11);//nose
  fill(0,0,0);
  ellipse(75,90,8,10);
  ellipse(125,90,8,10);//eyes
  fill(255,255,255);
  ellipse(75,88,4,4);
  ellipse(125,88,4,4);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
