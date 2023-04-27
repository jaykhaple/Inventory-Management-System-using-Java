import java.io.*;

public class file {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            File file2 = new File("example2.txt");
            FileWriter writer = new FileWriter(file);


            writer.write("my name is hacker");
            writer.close();
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);


            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            // String line2;
            // while ((line2 = buffer2.readLine()) != null) {
            //     System.out.println(line2);
            // }

            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



// try
//     {
//         File file_a = new File("Army.txt");
//         FileReader reader_a = new FileReader(file_a);
//         BufferedReader buffer_a = new BufferedReader(reader_a);
//             String line;
//             while((line = buffer_a.readLine())!=null)
//             {
//                 System.out.println(line);
//             }
//         buffer_a.close();
//         reader_a.close();
//     }
//     catch(IOException e)
//     {
//         System.out.println("Error: " + e.getMessage());
//     }