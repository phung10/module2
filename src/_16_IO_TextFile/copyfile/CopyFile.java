package _16_IO_TextFile.copyfile;
import java.io.*;
public class CopyFile {
    public static void CopyFileText(String File, String File1) {
        try {
            // Đọc file theo đường dẫn
            File file = new File(File);

            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(File));
            BufferedWriter wr = new BufferedWriter(new FileWriter(File1, true));
            String line = "";
            String input;
            while ((line = br.readLine()) != null) {
                wr.write(line);
                wr.newLine();

            }
            br.close();
            wr.close();

        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        CopyFileText("D:\\moudle2\\src\\_16_IO_TextFile\\copyfile\\test.txt","D:\\moudle2\\src\\_16_IO_TextFile\\copyfile\\text1.txt");
    }


}
