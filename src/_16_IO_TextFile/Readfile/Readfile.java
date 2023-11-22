package _16_IO_TextFile.Readfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Readfile {
    public static final String file = "D:\\moudle2\\src\\_16_IO_TextFile\\Readfile\\textfile.csv";
    public static List<country> readCSV() throws IOException {
        List<country> CoutryList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);

        String line;
        String Array[];
        country coutry;
        while ((line = buffer.readLine()) != null){
            Array = line.split(",");
            int id = Integer.parseInt(Array[0]);
            String code = Array[1];
            String name = Array[2];

            coutry = new country(id,code,name);
            CoutryList.add(coutry);
        }
        buffer.close();
        return CoutryList;
    }

    public static void main(String[] args) throws IOException {
        List<country> coutryList = readCSV();
        for (country coutry : coutryList){
            System.out.println(coutry);
        }
    }
}
