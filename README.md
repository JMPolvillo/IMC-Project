For this project, I have structured the objectives in the following way:

1. I need the program to display a message for the user to enter weight and height..
2. The program should calculate the BMI and display it.
3. Based on the BMI, the program should indicate the user's weight category according to the table.

To build it in Java, I followed these steps:

1. I included a package, an import for the scanner, and named the project "impcproject" with a public class.
2. I started a main method with "public static void main(String[] args) {"
3. To use the scanner, I needed an instance of the scanner class with: "Scanner scanner = new Scanner(System.in);"
4. From lines 8 to 14, I used println to prompt the user to enter their weight and height.
5. I used float to store the values entered by the user as variables "weight" and "height". I preferred to use "float" over "double" because we don't need as many digits to store.
6. To calculate the BMI, I used a "float" again. The weight is divided by the the height raised to two, and to calculate the height raised to two, I used the command "math.pow".
7. For the rest of the code, I used println to indicate the weight category based on the BMI. For this, I used the "if" and "else if" conditional commands. Since the values in the table include brackets and parentheses, I used "greater than" and "equal to" for values starting with "[" and "less than" for values with ")".
