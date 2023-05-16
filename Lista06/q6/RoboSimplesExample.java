public class RoboSimplesExample {
  public static void main(String args[]) {
    RoboSimples robo1 = new RoboSimples("Robo A", 2, 2, "N");
    RoboSimples robo2 = new RoboSimples("Robo B");
    RoboSimples robo3 = new RoboSimples("Robo C", 5, -9, "NO");

    System.out.println(robo1.toString());
    System.out.println(robo2.toString());
    System.out.println(robo3.toString());

    robo1.move(-5);
    robo2.move(8);
    
    System.out.println("-----------------------");
    System.out.println(robo1.toString());
    System.out.println(robo2.toString());
    System.out.println("-----------------------");

    robo1.mudaDireção("S"); 
    robo2.mudaDireção("SO");

    robo1.move(-33);
    robo2.move(23);
    
    System.out.println(robo1.toString());
    System.out.println(robo2.toString());
    System.out.println("-----------------------");
  }
}
