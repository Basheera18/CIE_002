public class Student {
    public void Stud_det()
    {
        String name = "Basheera M";
        String prg = "BCA";
        String dept = "MCA";
        String[] course={"DevOps","Machine Learning","C#"};
        System.out.println("Name of the student is = "+name);
        System.out.println("Program of the student is = "+prg);
        System.out.println("Department of the student is = "+dept);
        for (int i=0;i<course.length;i++){

            System.out.println(course[i]);
        }
 
         }
         public static void main(String args[])
    {
        Stud_Course sc = new Stud_Course();
        sc.Stud_det();
        sc.course();
        
    }
}

    



