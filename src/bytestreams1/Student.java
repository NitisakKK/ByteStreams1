package bytestreams1;

import java.io.Serializable;

// เอาไว้สร้าง Object ข้อมูลไว้
// บังคับต้อง implements Serializable ก่อนที่เราจะเขียนลง file
public class Student implements Serializable {
    // 1 สร้าง attribute
    // 2 สร้าง constucter
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
