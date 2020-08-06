PImage face; 

void setup() {
face = loadImage("face.jpg");
size(800,800);
face.resize(width, height);
image(face, 0, 0);

}
void draw() {
println(mouseX + "   " + mouseY);
fill(mouseX, mouseY, 0);
  ellipse(510, 364, 50, 32);
ellipse(287, 366, 50, 32);
fill(0,0,0);
ellipse(510, 364, 25, 16);
ellipse(287, 366, 25, 16);
}
