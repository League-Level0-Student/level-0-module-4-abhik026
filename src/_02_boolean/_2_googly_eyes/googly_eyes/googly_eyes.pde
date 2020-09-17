PImage face;
void setup() {
size(800,800);
face = loadImage("face1.png"); 
face.resize(width,height);
}

void draw() {
background(face);  
fill(#FFFFFF);
ellipse(220,185,330,320);
ellipse(570,165, 335,320);

System.out.println(mouseY);
if(mouseX>300 || mouseX<130){
mouseX = 215;
}

if(mouseY>150 || mouseY<60){
mouseY = 112;
}
fill(0,0,0);
ellipse(mouseX,mouseY+75,100,200);
ellipse(mouseX + 350, mouseY+75-20, 100,200);
}
