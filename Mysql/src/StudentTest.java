public class StudentTest {
    
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);  
        Student stu3 = new Student(3,"wangwu",25);

        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;

        Student stu4 = new Student(4,"zhaoliu",26);

        boolean flag = contains(arr,stu4.getId());

        public static boolean contains(Student[] arr,int id) {
            for (int i = 0; i < arr.length; i++) {
                Student stu=arr[i];
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
            return false;
        }
    }
}
