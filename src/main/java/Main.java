import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\user\\Desktop\\Cutting 2.1.53";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));
    }

    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }
}