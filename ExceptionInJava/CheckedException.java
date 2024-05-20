// Checked Exception in java 
// Checked exception is a type of exception which is checked at a compile time 
// Let us take an example in which we are opening a file which doesn't exist

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

class ExampleClass {
    public void readTheFile() throws IOException{

        // If we are handling or working with files it throws IOException
        // this code throws FileNotFoundException which is the subclass of the IOException
        try{
        FileReader file = new FileReader("sample.txt");
        BufferedReader fileinput = new BufferedReader(file);

        for(int counter=0; counter<3; counter++){
            System.out.println(fileinput.readLine());
        }

        fileinput.close();
    }
    catch(IOException e){
        System.out.println("error - IOException");
    }
    }
}

public class CheckedException{
    public static void main(String[] args) throws IOException{
        ExampleClass obj = new ExampleClass();
        obj.readTheFile();
    }
}