package �����;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// �������� �����
public class ������������� {
    public static void main(String[] args) throws IOException {
       /* Files.createFile(Path.of("readme.txt"));*/ // �������� ����� ��� 2 ������� ������ ��������� ����
        if (!(Files.exists(Path.of("readme.txt")))){   // ��������� ���� ��� ���� �� ����������
            Files.createFile(Path.of("readme.txt"));  // ����� ������� ����
        }
       /* Files.delete(Path.of("readme.txt"));    // �������� �����*/
        String str = "� ����� �����";                       //������ � ����
        File file = new File("readme.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
    }
}
