import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();




/*


//Encryption and decryption messages using shift values


        String correctUser = "admin";
        String correctPass = "1234";

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if ( !username.equals(correctUser) || !password.equals(correctPass) ) {
            System.out.println("Access Denied");
            return; // Exit if credentials are incorrect
        }



        System.out.print("Enter message: ");
        String message = scanner.nextLine(); // User enters message
        System.out.print("Enter shift value: ");

        int shift = scanner.nextInt(); // User enters shift value
        scanner.nextLine(); // Consume newline

        StringBuilder encrypted = new StringBuilder();


        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + shift));
        }

        StringBuilder decrypted = new StringBuilder();


        for (char c : encrypted.toString().toCharArray()) {
            decrypted.append((char) (c - shift));
        }


        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        scanner.close();



*/









/*

        //Loop Through a Multi-Dimensional Array


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.print(myNumbers[i][j] + " ");
            }

            System.out.println(); // Move to the next line after each row
        }


        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print new line after each row


*/

/*



                //Matrix Addition


            int[][] matrixA = { {1, 2}, {3, 4} };
            int[][] matrixB = { {5, 6}, {7, 8} };
            int[][] sumMatrix = new int[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                } }

            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();











                //Matrix Multiplication


                int[][] resultMatrix = new int[2][2];
                for (int t = 0; t < 2; t++) {
                    for (int j = 0; j < 2; j++) {
                        resultMatrix[t][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            resultMatrix[t][j] += matrixA[t][k] * matrixB[k][j];
                        }} }
                System.out.println("Product of the two matrices:");
                for (int t = 0; t < 2; t++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                    }
                    System.out.println(); }}


*/







/*




        //Loop Through an ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }


        //ArrayList with the for-each loop
        for (String u : cars) {
            System.out.println(u);
        }







        //Store numbers with ArrayList
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (int p : myNumbers) {
            System.out.println(p);
        }

        //Sort an ArrayList of Integers
        Collections.sort(myNumbers);
        for (int o : myNumbers) {
            System.out.println(o);
        }




        //Sort an ArrayList of Strings
        Collections.sort(cars);

        for(String z : cars){
            System.out.println(z);
        }


        //Reverse the Order with Strings
        Collections.sort(cars, Collections.reverseOrder());

        for (String a : cars){
            System.out.println(a);
        }



*/





































/*
        //Methods
        info("Hello");
        String java = "Java";
        info(java);
        info("");

        */
/*

        short num = 7;
        int result = sum((short) 4,num);

        short num2 = 9;
        int result2 = sum((short) 5,num);
        info(String.valueOf(result2));
*/



/*

        byte[] num1 = new byte[]{
                5, 6, 8
        };

        int sum1 = sumArray(num1);
        System.out.println("Сумма1: " + sum1);



        byte[] num2 = new byte[]{
                5, 6, 8, 12, 23, 23, 44, 5
        };

        int sum2 = sumArray(num2);
        System.out.println("Сумма2: " + sum2);

*/










        //OOP
        Transport bmw = new Transport();
        bmw.speed = 400.13f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new byte[]{ 0, 0, 0};


        Transport truck = new Transport();
        truck.speed = 150.50f;
        truck.weight = 5000;
        truck.color = "Green";
        truck.coordinate = new byte[]{ 100, 0, 100};


        System.out.println("Truck speed: " + truck.speed + "\nBMW speed: " + bmw.speed);










    }





    public static int sumArray(byte[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++ )
            sum += arr[i];

        return sum;
    }












    public static int sum(short a, short b){
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
        return res;
    }




    public static void info(String word){
        System.out.print(word);
        System.out.println("!");
    }


















}





















