// Nandhini Natarajan

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    FacePrinter face = new FacePrinter();

    // question for user
    String hair;
    String eyes;
    String nose;
    String mouth;
    System.out.println("Hair: (straight, curly, wavy)");
    hair = scan.nextLine();

    System.out.println("Eyes: (crazy, star, excited)");
    eyes = scan.nextLine();

    System.out.println("Nose: (curved, pointy, wide)");
    nose = scan.nextLine();

    System.out.println("Mouth: (neutral, smiley, weird)");
    mouth = scan.nextLine();

    face.printFace(hair, eyes, nose, mouth);

    scan.close();

  }
}