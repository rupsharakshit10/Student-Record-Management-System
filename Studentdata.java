import java.util.Scanner;

class Studentdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option,i, num;
        System.out.println("Enter number of students:");
                        num = sc.nextInt();
                        sc.nextLine(); 

                        int marks[] = new int[num];
                        String name[] = new String[num];
                        while(true){
            System.out.println("\n_____MENU_____");
            System.out.println("ENTER 1 FOR ENTER STUDENT DATA\nENTER 2 TO CHECK  STUDENT RESULT WITH GRADE\nENTER 3 TO CHECK WHO GOT HIGHEST\nENTER 4 TO CHECK WHO GOT LOWEST\nENTER 5 TO CHECK AVERAGE MARKS\nENTER 6 TO EXIT");
                option =sc.nextInt();
                switch (option) {
                        case 1 :
                        
                        for(i = 0; i < num; i++) {
                        System.out.println("Enter name of student " + (i+1) + ":");
                        name[i] = sc.nextLine();
                            sc.nextLine(); 
                        System.out.println("Enter student total marks " + (i+1) + ":");
                        marks[i] = sc.nextInt();
                        sc.nextLine(); 
                        }
                        break;
                        case 2:
                            System.out.println("\nStudent Details:");
                            for(i = 0; i < num; i++) {
                            System.out.println(name[i] + " " + marks[i]+" Grade: "+grade(marks[i]));
                            }
                        break;
                        case 3:
                            int max = maximum(marks);
                            System.out.println("The student who got highest marks is : " +name[max]+" and his/her marks is :"+marks[max]);
                        break;
                        case 4:
                            int min = minimum(marks);
                            System.out.println("The student who got lowest marks is : "+name[min]+" and his/her marks is :"+marks[min]);
                        break;
                        case 5:
                            double average = Avarage(marks, num);
                            System.out.printf("Avarage marks of the class : %.3f",average);
                        break;
                        case 6:
                        System.out.println("Exiting program...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Choice");
                    }
                }
    }
    public static String grade(int number) {
        if(number>90)
        return"O";
        else if(90>=number&& number>80)
        return "E";
        else if(80>=number&& number>70)
        return"A";
        else if(70>=number&& number>60)
        return"B";
        else if(60>=number&& number>50)
        return"C";
        else if(50>=number&& number>=40)
        return"D";
        else if(number<40)
        return"F";
        
        return "invalid";
    }    
    public static int maximum(int marks[]) {
        int maxi=marks[0];
        int countmax=0;
        int j=1;
        while(j<marks.length){
            if(maxi<marks[j])
            {
                maxi=marks[j];
                countmax=j;
            }
            j++;
        }
        return countmax;
    }
    public static int minimum(int marks[]) {
        int minim=marks[0];
        int countmin=0;
        int j=1;
        while(j<marks.length){
            if(minim>marks[j])
            {
                minim=marks[j];
                countmin=j;
            }
            j++;
        }
        return countmin;
    }
    public static double Avarage(int marks[],int num){
        double total =0.00;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        double avg =(total/num);
        return avg;
    }
}
