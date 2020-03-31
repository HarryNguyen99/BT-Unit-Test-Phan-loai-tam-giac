public class TriangleClassifier {

    public static boolean triangLe (int side1, int side2, int side3){
      return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 < side1);
    }


    public static boolean triangLeThuong(int side1, int side2, int side3) {

        return (side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1);

    }

    public static boolean triangLeCan(int side1, int side2, int side3) {
        return (side1 == side2) || (side2 == side3) || (side3 == side1);
    }

    public static boolean triangLeDeu(int side1, int side2, int side3) {
        return (side1 ==side2)&&(side2 ==side3)&&(side3 ==side1);
    }


}



