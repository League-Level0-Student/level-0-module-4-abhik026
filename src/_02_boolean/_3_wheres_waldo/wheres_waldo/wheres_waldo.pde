
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = true;
boolean waldoX = false;
boolean waldoY = false;
PImage waldo;
void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  PImage waldo = loadImage("waldo.jpg"); // Change this to match your file name.
  size(1590, 981); 
 waldo.resize(width,height);
  // Resize your waldo picture to the same size as the sketch
  
  // Make the waldo image your sketch background
background(waldo);
}

void draw() {
if(mousePressed){
  if(mouseX >= 1267 && mouseX<=1283){
  waldoX =true;
}
   
 if(mouseY >=79 && mouseY<= 1283){
waldoY = true;
 }// If the user presses the mouse .......

 if(waldoX && waldoY){
   textSize(100);
   fill(#FFFFFF);
   rect(430, 350, 800,200);
   fill(0,0,0);
   text("Waldo Found", width/2 - 280,height/2);
   
 }
  else{
   textSize(100);
   fill(#FFFFFF);
   rect(430, 350, 800,200);
   fill(0,0,0);
    text("Not Here",width/2 -280,height/2);
    
}
}      // Use this print statement to help you find the location of Waldo to use in the code below
          // println("X: " + mouseX + " Y: " + mouseY); 
    
          // Check if the location of the mouse is anywhere on the image of Waldo.
          // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.
          
                if (canPlaySounds) {
                    // Use the playWhoohoo() method below. You can change the sound if you want 
              // playWoohoo();
              } 
    
          // However, if the mouse is not on Waldo, print "Not here!" 
          // Use the text() command to write it on the sketch. 
          
                if (canPlaySounds) {
                    // Use the playDoh() method below. You can change the sound if you want 
              //  playDoh();
              }       
                
}

/*********************  This code is needed to play sounds. ********************
              Remove the comment markers below, but DON'T CHANGE THE CODE */
              

/*
import ddf.minim.*;
Minim minim = new Minim(this); 

AudioSample woohoo;
void playWoohoo() {
     if (woohoo == null) 
         woohoo = minim.loadSample("homer-woohoo.wav");
     woohoo.stop();
     woohoo.trigger();
}

AudioSample doh;
void playDoh() {
     if (doh == null)
         doh = minim.loadSample("homer-doh.wav"); 
     doh.stop();
     doh.trigger();
}
*/
