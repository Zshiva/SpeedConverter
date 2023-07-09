public class speedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        long miles = 0;
        if(kilometersPerHour >= 0){
            miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printConversion(75.114);
    }
}