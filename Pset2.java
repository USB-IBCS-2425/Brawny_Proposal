public class Pset2{
	public static void main(String[] args) {
		
		String name = "Jerry Zhan";
		String date = "9/9/2024";

		System.out.println("Jerry Zhan");
		System.out.println("9/9/2024");
		System.out.println();
		System.out.println();

		int students = 8;
		System.out.println("8 students are in our class");
		System.out.println("A new student has enrolled!");
		System.out.println(students + "8 students are in our class.");

		if (students < 4) {
            System.out.println("Class is canceled.");
            } else {
            System.out.println("Class will continue.");
        }

        int students = 8;
        String firstName = "Jerry";
        int nameLength = 5;
        students -= 5;
        System.out.println("After adjusting for the length of the name, students count is: "+ "3 students");
        if (students < 4) {
            System.out.println("Class is canceled.");
            } else {
            System.out.println("Class will continue.");
        }

        boolean canDivideEqually = (students % 3 == 0);
        if (canDivideEqually) {
        	System.out.print("The class can be divided equally into " + (students/ 3) + " equal groups");
        } else {
        		int cannot = 3 - (students % 3);
        		System.out.print("You need to add" + cannot + "more students to divide the calss into equal groups of 3");
        }
	}
}