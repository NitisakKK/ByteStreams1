package bytestreams1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab5 {
    public static void main(String[] args) {
        Student s = new Student("65130500037", "Nitisak Kangkhan");
        try { // Dec คือการเอา File + Object มาเชื่อมโยงกัน
            FileOutputStream file = new FileOutputStream("data.dat"); // เขียนข้อมูลของ file
            ObjectOutputStream output = new ObjectOutputStream(file); // เขียนข้อมูลของ object
            output.writeObject(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student s1 = (Student) input.readObject(); // แปลงเป็น Student
            System.out.println(s1.id);
            System.out.println(s1.name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
