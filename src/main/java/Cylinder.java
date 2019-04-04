class Cylinder {
    static double getVolume(int radius, int height){
        double baseArea = getBassArea(radius);

        double perimeter = getPerimeter(radius);

        return perimeter * height + 2 * baseArea;
    }

    private static double getPerimeter(int radius) {

        return 2 * Math.PI * radius;
    }

    private static double getBassArea(int radius) {

        return Math.PI * radius * radius;
    }
}
