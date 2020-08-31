/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
  public void plantCross() {
  moveTo();
  threeCombo();
  hop();
  turn(RIGHT);
  plant();
  hop();
  threeCombo();
  turn(LEFT);
  twoCombo();
  turn(LEFT);
  turning();
  threeCombo();
  turn(LEFT);
  twoCombo();
  turn(LEFT);
  turning();
  threeCombo();
  turn(LEFT);
  twoCombo();
  turn(LEFT);
  turning();
  threeCombo();
  turn(LEFT);
  twoCombo();
  hop();
    }
    // Put any helpermethods here
  public void moveTo(){
  hop(6);
  turn(RIGHT);
  hop(3);
}

public void threeCombo(){
  plant();
  hop();
  plant();
  hop();
  plant();
}

public void twoCombo(){
  hop();
  plant();
  hop();
  plant();
}

public void turning(){
  hop();
  threeCombo();
  turn(RIGHT);
  hop();
}
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
