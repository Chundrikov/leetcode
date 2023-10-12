package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Legerdemain {

    public int searchForlegerdemain() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        int k = Integer.parseInt(reader.readLine()) * 2; //так как игроков двое
        for (int i = 0; i < 4; i++) {
            String numbers = reader2.readLine().replaceAll(".", "");
        }

        for (int j = 1; j < 10; j++) {
            int currentSecond = j;
            // считаем, сколько цифр равных текущему времени в строке

        }
    }
}

