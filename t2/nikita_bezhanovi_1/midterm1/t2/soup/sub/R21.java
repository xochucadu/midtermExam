package t2.nikita_bezhanovi_1.midterm1.t2.soup.sub;

import t2.nikita_bezhanovi_1.midterm1.t2.soup.A21;
import t2.nikita_bezhanovi_1.midterm1.t2.spoon.tenor.A22; // Assuming A22 gives a month index

public class R21 {
    public static void main(String[] args) {
        // Rectangle Area
        A21 rectangle = new A21();
        int width = rectangle.getWidth();
        int height = rectangle.getHeight();
        int area = width * height;
        System.out.println("Rectangle area: " + area);


        A22 monthObject = new A22();
        int monthIndex = monthObject.getMonth() - 1;
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        System.out.println("The selected month is: " + months[monthIndex]);
    }
}
