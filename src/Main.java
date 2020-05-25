import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n,a,b;
        Scanner sc = new Scanner(System.in);

        String scString = sc.nextLine();

        String[] scStrings = scString.split(" ");
        int[] scNumbers = new int[scStrings.length];

        for (int i = 0; i < scStrings.length; i++) {
            scNumbers[i] = Integer.parseInt(scStrings[i]);
        }
        if(scNumbers[0]>=scNumbers[1]){
            if(scNumbers[0]>=scNumbers[2]){
                int arraySize = scNumbers[0];
                int[] array = new int[arraySize];
                for(int i = 0; i < array.length; i++){
                    array[i] = sc.nextInt();
                }
                n = arraySize;
                a = scNumbers[1];
                b = scNumbers[2];
                for(int i = 0; i < array.length; i++){
                    int t=array[a];
                    array[a]=array[b];
                    array[b]=t;
                }
                System.out.println();
                for(int el : array){
                    System.out.println(el);
                }
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}
