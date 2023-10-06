import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        calculate_BMI instance = new calculate_BMI();
        instance.get_Input();

    }
}
class calculate_BMI
{
    public void get_Input()
    {
        String Name;
        int weight;
        int height;

            Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        Name = sc.nextLine();
        System.out.println("Hey, "+Name+" let's calculate your BMI!!");
        System.out.println("Enter your weight in Kgs: ");
        weight=sc.nextInt();
        System.out.println("Enter your height in cms: ");
        height=sc.nextInt();
        sc.close();
        calculate(Name,weight,height);
    }
    public void calculate(String Name, int weight, int height)
    {
        double height_in_metres= height*0.01;
        double BMI = weight/(height_in_metres*height_in_metres);
        if(BMI<18.5)
        {
            System.out.println("Hey, "+Name+" you're underweight!!");
            System.out.println("Your BMI is: "+BMI);
            System.out.println("INFERENCE: UNDERWEIGHT");
        }
        else if(BMI>18.5 && BMI<24.9)
        {
            System.out.println("Hey, "+Name+" your weight is Normal!!");
            System.out.println("Your BMI is: "+BMI);
            System.out.println("INFERENCE: NORMAL");
        }
        else if(BMI>25 && BMI<29.9)
        {
            System.out.println("Hey, "+Name+" you're Overweight!!");
            System.out.println("Your BMI is: "+BMI);
            System.out.println("INFERENCE: OVERWEIGHT");
        }
        else
        {
            System.out.println("Hey, "+Name+" you're obese!!");
            System.out.println("Your BMI is: "+BMI);
            System.out.println("INFERENCE: OBESE");
        }

    }
}
