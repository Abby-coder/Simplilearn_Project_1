package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockedMeOperations  {
    public void retrieveFile() {
        File file = new File("D:\\Java\\Simplilearn Project 1\\LockedMeFiles");
        List listFile = Arrays.asList(file.list());
        Collections.sort(listFile);
        for (Object filename : listFile) {
            System.out.println(filename);
        }
    }

    public void addFile() {
        boolean addingafile;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the file name to add");
            String fileName = sc.nextLine();
            File file = new File("D:\\Java\\Simplilearn Project 1\\LockedMeFiles"); //initialize File object and passing path as argument
            File fullPath = new File(file, fileName.concat(".txt"));
            addingafile = fullPath.createNewFile();  //creates a new file
            if (addingafile)      // test if successfully created a new file
            {
                System.out.println("Adding a file.....");
                System.out.println("File added successfully" + file.getCanonicalPath()); //returns the path string
            } else {
                System.out.println("File already exists at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();    //prints exception if any
        }
    }

    public void deleteFile() {
        try {
            File file = new File("D:\\Java\\Simplilearn Project 1\\LockedMeFiles");
            List listFile = Arrays.asList(file.list());
            Collections.sort(listFile);
            for (Object filename : listFile) {
                System.out.println(filename);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Pick a file name from the list to delete");
            String fileName = sc.nextLine();
            String format = fileName.concat(".txt");
            if (listFile.contains(format))
            {

                File file1 = new File("D:\\Java\\Simplilearn Project 1\\LockedMeFiles"); //initialize File object and passing path as argument
                File fullPath = new File(file1, format);
                fullPath.delete();
                System.out.println("Deleted successfully!!!");
            } else {
                System.out.println("Filename not found!!!");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        public void searchFile()  {
            File fileSearch = new File("D:\\Java\\Simplilearn Project 1\\LockedMeFiles");
            List flist = Arrays.asList(fileSearch.list());
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the file name to be searched.. ");
            String name1 = scan.next();
            String fin = name1.concat(".txt");
            try {

                if (flist != null) {

                        if (flist.contains(fin)) {

                            System.out.println("Searching successful....");
                            System.out.println("File Name " + fin + " is found in " + fileSearch.getCanonicalPath());
                        }
                    else if (!flist.equals(fin)){
                        System.out.println("File not found in " +fileSearch.getCanonicalPath());
                    }
                    }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
                public void closeApp () {
                    System.out.println("Closed the application successfully!!");
                    }
                }





