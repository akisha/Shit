package src;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseMatrix {

    public String inF;


    public SparseMatrix(String in) {
        inF = in;
    }

    public String Test() {
        return inF;
    }

    public int CountRow(String fileName) {
        int m = 0;
        try {
            FileReader fs = new FileReader(fileName);
            BufferedReader bfs = new BufferedReader(fs);
            while (bfs.readLine() != null) {
                m++;
            }
            fs.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }

    public int nRow = CountRow(inF);
}