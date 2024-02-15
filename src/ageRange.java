package src;

public class ageRange {
    public static void datingRange(int age) {

        int min;
        int max1;
        int max;

        if(age<=14){
            System.out.println("Don't date yet");
        } else {
            min = (age / 2 + 7);
            max1 = (age - 7);
            max = max1 * 2;

            System.out.println("Your age: " + age + "\nMinimum age: " + min + " and " + "Max age: " + max);
        }
    }
}

//age = 27   =>   20-40
//age = 5    =>   Cant date yet
//age = 17   =>   15-20