public class Donut {
    public static void main(String[] args) throws Exception {

        // donut java for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Donut Java for loop: " + i);
        }

        // donut java while loop
        int i = 0;
        while (i < 10) {
            System.out.println("Donut Java while loop: " + i);
            i++;
        }

        // donut java do while loop
        int j = 0;
        do {
            System.out.println("Donut Java do while loop: " + j);
            j++;
        } while (j < 10);

        // donut java for each loop
        String[] donuts = { "chocolate", "glazed", "strawberry", "cinnamon" };

        for (String donut : donuts) {
            System.out.println("Donut Java for each loop: " + donut);
        }

        // donut java for loop with break
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println("Donut Java for loop with break: " + k);
        }

        // donut java for loop with continue
        for (int l = 0; l < 10; l++) {
            if (l == 5) {
                continue;
            }
            System.out.println("Donut Java for loop with continue: " + l);
        }

        // donut java for loop with labels
        outerloop: for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (n == 5) {
                    break outerloop;
                }
                System.out.println("Donut Java for loop with labels: " + n);
            }
        }

        // donut java for loop with nested loops
        for (int o = 0; o < 10; o++) {
            for (int p = 0; p < 10; p++) {
                System.out.println("Donut Java for loop with nested loops: " + p);
            }
        }

        // donut java for loop with nested loops and break
        for (int q = 0; q < 10; q++) {
            for (int r = 0; r < 10; r++) {
                if (r == 5) {
                    break;
                }
                System.out.println("Donut Java for loop with nested loops and break: " + r);
            }
        }

    }
}
