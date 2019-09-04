import java.io.*;
import java.util.ArrayList;

public class SecondSymbol {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        while (fileReader.ready()){
            int data = fileReader.read();
            list.add(data);
        }

        for (int s = 1; s < list.size(); s+=2){
            fileWriter.write(list.get(s));

        }

        fileReader.close();
        fileWriter.close();
        reader.close();

    }
}
