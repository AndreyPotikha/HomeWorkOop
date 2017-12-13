package startOop.oop.workWithFile;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class MainFile {



    public static void main(String[] args) throws IOException {

        File f = new File("d://book");
        File[] files = f.listFiles();
        String dir = "d://book";
        String ext = ".txt";

//       System.out.println(f.getPath()); // Запросить путь к файлу
        String path = f.getPath(); // путь к файлу
        String listFilesArray = Arrays.toString(files); // все файлы которые есть у нас в этой папке


//Создание файла dyrectory.txt и запись в него строк
        FileWriter fileWriter = new FileWriter("d://book//dyrectory.txt", true);
        fileWriter.write(path + " \n 0");
        fileWriter.write(listFilesArray + " \n");
        fileWriter.write("222");





       /* findFiles(dir, ext); // Поиск всех файлов в формате .txt*/


      /*  System.out.println(Arrays.toString(files));
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separatorChar);
        if (f.isDirectory()) {
            System.out.println("Это директория");
        }
        if (!f.exists()) {
            f.createNewFile();
        }*/

      fileWriter.close();
    }

    private static void findFiles(String dir, String ext) {
        File file = new File(dir);
        if(!file.exists()) System.out.println(dir + " папка не существует");
        File[] listFiles = file.listFiles(new MyFileNameFilter(ext));
        if(listFiles.length == 0){
            System.out.println(dir + " не содержит файлов с расширением " + ext);
        }else{
            for(File f : listFiles)
                System.out.println("Файл: " + dir + File.separator + f.getName());
        }
    }

    public static class MyFileNameFilter implements FilenameFilter{

        private String ext;

        public MyFileNameFilter(String ext){
            this.ext = ext.toLowerCase();
        }
        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(ext);
        }
    }
}
