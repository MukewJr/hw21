import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fileWriter("abc","A a \nB b \nC c \nD d \nE e \nF f \nG g \nH h \nI i \nJ j \nK k \nL l \nM m \nN n \nO o \nP p \nQ q \nR r \nS s \nT t \nU u \nV v \nW w \nX x \nY y \nZ z \n0 \n1 \n2 \n3 \n4 \n5 \n6 \n7 \n8 \n9 ");
        fileReader("abc");
    }
    public static void fileWriter(String fileName, String text)
    {
        try (FileWriter writer=new FileWriter(fileName)){
            writer.write(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileReader(String fileName)
    {
        try(FileReader reader=new FileReader(fileName)) {
            Scanner scan=new Scanner(reader);
            while (scan.hasNext())
            {
                System.out.println(scan.nextLine());
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}