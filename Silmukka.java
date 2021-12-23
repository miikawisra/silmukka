import java.io.*;

class Silmukka {
    public static void main(String []args) {
        int n=1;
        int luku;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Anna kokonaisluku:");
            luku = Integer.parseInt(in.readLine());

            for(n = 1; n <= luku; n++)
            {System.out.println(n);} 
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
