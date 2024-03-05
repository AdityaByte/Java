// Save this file as Test.java

 // 1) Sentence detection using java
public class Test{
    public static void main(String[] args) {
        String str1 = "Hey aditya.what are you doing?" + "is there any problem?hurrah!";
        String symbol = "[.?!]";
        String[] splitString = (str1.split(symbol));
        for(String string : splitString){
            System.out.println(string);
        }
    }
}

// for using this code comment out the upper one

// 2) Sentence Detection using OpenNLP ->

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test{
    public static void main(String[] args) throws Exception{
        String sentence = "Hi. How are you? What are you doing? "
                + "Hey this is my github page! Wanna to acquire someinfo about new libraries.";

        InputStream inputStream = new FileInputStream("--path of the en-sent.bin file");
        SentenceModel model = new SentenceModel(inputStream);

        SentenceDetectorME detector = new SentenceDetectorME(model);

        String[] sentences = detector.sentDetect(sentence);

        for(String sen : sentences){
            System.out.println(sen);
        }
    }
}

