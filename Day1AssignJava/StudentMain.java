class Student{
		int roll;
		String name;
		float marks;
	void input(int roll, String name, float marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		
	}
    void display(){
        System.out.println("Display method :");
        System.out.println("Roll :"+roll);
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }
}   
 class StudentMain{
     public static void main(String[] args) {
         Student s1=new Student();
         s1.input(101, "Amit", 90.0f);
         
         Student s2=new Student();
         s2.input(102, "Hitesh", 88.2f);
         
         s1.display();
         s2.display();
         
     }
 }   