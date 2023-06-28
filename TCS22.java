import java.util.Scanner;

class TCS22 {
    public static void main(String[] args) {
        int path[] = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        String route[] = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the starting stop:");
        String start = sc.nextLine();
        System.out.println("Enter the name of the destination stop:");
        String des = sc.nextLine();

        int ini_index = 0;
        int des_index = 0;
        for (int i = 0; i < route.length; i++) {
            if (route[i].equalsIgnoreCase(start)) { // here we use .equals also for string..
                ini_index = i;
            }
            if (route[i].equalsIgnoreCase(des)) {
                des_index = i;
            }
        }

        if (ini_index == -1 || des_index == -1) {
            System.out.println("Invalid input");
            return;
        }

        int distance = 0;
        int fair = 0;
        if (ini_index < des_index) {
            for (int i = ini_index; i < des_index; i++) {
                distance += path[i];
                fair += Math.ceil((double) path[i] / 1000) * 5;
            }
        } else {
            for (int i = ini_index; i < route.length; i++) {
                distance += path[i];
                fair += Math.ceil((double) path[i] / 1000) * 5;
            }
            for (int i = 0; i < des_index; i++) {
                distance += path[i];
                fair += Math.ceil((double) path[i] / 1000) * 5;
            }
        }

        System.out.println("Distance: " + distance + " meters");
        System.out.println("Travel Fare: " + fair + " INR");
    }
}
