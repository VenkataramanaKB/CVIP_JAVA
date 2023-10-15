import java.util.Scanner;

class main
{
    public static void main(String args[])
    {
        Details instance = new Details();

        System.out.println("Welcome to Fees Management System");
        System.out.println("1. To add Details");
        System.out.println("2. Display Details");
        System.out.println("3. To edit Details");
        System.out.println("4. Calculate Fees amount");
        System.out.println("5. To exit");

        Scanner sc= new Scanner(System.in);
        int opt;
        opt = sc.nextInt();

        while(true)
        {
            switch(opt)
            {
                case 1:
                {
                    instance.input_details();
                    
                    System.out.println("2. Display Details");
                    System.out.println("3. To edit Details");
                    System.out.println("4. Calculate Fees amount");
                    System.out.println("5. To exit");
                    opt = sc.nextInt();

                }
                case 2:
                {
                    instance.print_details();

                    System.out.println("1. To add Details");
                    System.out.println("3. To edit Details");
                    System.out.println("4. Calculate Fees amount");
                    System.out.println("5. To exit");
                    opt= sc.nextInt();
                }
                case 3:
                {
                    instance.Edit_details();

                    System.out.println("1. To add Details");
                    System.out.println("2. Display Details");
                    System.out.println("4. Calculate Fees amount");
                    System.out.println("5. To exit");
                    opt = sc.nextInt();

                }
                case 4:
                {
                    instance.calculate_fees();
                    
                    System.out.println("1. To add Details");
                    System.out.println("2. Display Details");
                    System.out.println("3. To edit Details");
                    System.out.println("5. To exit");
                    opt = sc.nextInt();
                    
                }
                case 5:
                {
                    System.out.println("Thank you for using fees management system!");
                }
                default:
                {
                    System.out.println("Enter a valid option");
                }

            }
        }
        

    }
}
class Details
{
    String name;
    int tution_fees;
    int transport_fees;
    int hostel_fees;
    int remedial_fees;
    int development_fees;
    int total_fees;
    int num;
    int temp;
    int newtemp;
    public void Details(String name, int tution_fees, int transport_fees, int hostel_fees, int remedial_fees, int development_fees)
    {
        this.name =name;
        this.tution_fees=tution_fees;
        this.transport_fees=transport_fees;
        this.hostel_fees =hostel_fees;
        this.remedial_fees=remedial_fees;
        this.development_fees=development_fees;   

    }
    Scanner sc= new Scanner(System.in);
    public void input_details()
    {
        System.out.println("Enter Student's Name:");
        name = sc.nextLine();
        System.out.println("Enter category: ");
        System.out.println("1. Government");
        System.out.println("2. Management");
        num = sc.nextInt();
        switch(num)
        {
            case 1:
            {
                System.out.println("1. DayScholar, 2. Hosteller");
                temp = sc.nextInt();
                switch(temp)
                {
                    case 1:
                    {
                        System.out.println("Transportation: 1. College Bus 2.Others");
                        newtemp = sc.nextInt();
                        switch(newtemp)
                        {
                            case 1:
                            {
                                transport_fees= 40000;
                                tution_fees=29000;
                                remedial_fees=4500;
                                development_fees =0;
                                hostel_fees=0;
                                System.out.println("Tution fees: "+tution_fees);
                                System.out.println("Remedial fees: "+remedial_fees);
                                System.out.println("Development fees: N/A");
                                System.out.println("Transportation fees: "+transport_fees);
                                System.out.println("Hostel fees: N/A");

                                Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);
                            }
                            case 2:
                            {
                                transport_fees= 0;
                                tution_fees=29000;
                                remedial_fees=4500;
                                development_fees =0;
                                hostel_fees=0;
                                System.out.println("Tution fees: N/A");
                                System.out.println("Remedial fees: "+remedial_fees);
                                System.out.println("Development fees: N/A");
                                System.out.println("Transportation fees: "+transport_fees);
                                System.out.println("Hostel fees: N/A");

                                Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);
                            }
                            default:
                            {
                                System.out.println("Invalid option");
                            }
                        }
                    }
                    case 2:
                    {
                        transport_fees= 0;
                        tution_fees=29000;
                        remedial_fees=4500;
                        development_fees =0;
                        hostel_fees=45000;
                        System.out.println("Tution fees: N/A");
                        System.out.println("Remedial fees: "+remedial_fees);
                        System.out.println("Development fees: N/A");
                        System.out.println("Transportation fees: "+transport_fees);
                        System.out.println("Hostel fees: "+hostel_fees);
                        Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);
                    }
                    default:
                    {
                        System.out.println("Invalid Option");
                    }
                    
                }
                
            }

            case 2:
            {
                System.out.println("1. DayScholar, 2. Hosteller");
                temp = sc.nextInt();
                switch(temp)
                {
                    case 1:
                    {
                        System.out.println("Transportation: 1. College Bus 2.Others");
                        newtemp = sc.nextInt();
                        switch(newtemp)
                        {
                            case 1:
                            {
                                transport_fees= 40000;
                                tution_fees=49000;
                                remedial_fees=9000;
                                development_fees =4500;
                                hostel_fees=0;
                                System.out.println("Tution fees: "+tution_fees);
                                System.out.println("Remedial fees: "+remedial_fees);
                                System.out.println("Development fees: N/A");
                                System.out.println("Transportation fees: "+transport_fees);
                                System.out.println("Hostel fees: N/A");

                                Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);
                            }
                            case 2:
                            {
                                transport_fees= 0;
                                tution_fees=49000;
                                remedial_fees=9000;
                                development_fees =0;
                                hostel_fees=0;
                                System.out.println("Tution fees: N/A");
                                System.out.println("Remedial fees: "+remedial_fees);
                                System.out.println("Development fees: N/A");
                                System.out.println("Transportation fees: "+transport_fees);
                                System.out.println("Hostel fees: N/A");

                                Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);
                            }
                            default:
                            {
                                System.out.println("Invalid option");
                            }
                        }
                    }
                    case 2:
                    {
                        transport_fees= 0;
                        tution_fees=49000;
                        remedial_fees=9000;
                        development_fees =4500;
                        hostel_fees=90000;
                        System.out.println("Tution fees: N/A");
                        System.out.println("Remedial fees: "+remedial_fees);
                        System.out.println("Development fees: N/A");
                        System.out.println("Transportation fees: "+transport_fees);
                        System.out.println("Hostel fees: "+hostel_fees);
                        Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);
                    }
                    default:
                    {
                        System.out.println("Invalid Option");
                    }
                    
                }
                
            }



            
                    
                
                
            
            
        }


    }
    public void print_details()
    {
        System.out.println("Name: "+name);
        System.out.println("Tution Fees: "+tution_fees);
        System.out.println("Transportation Fees: "+transport_fees);
        System.out.println("Hostel Fees: "+hostel_fees);
        System.out.println("Remedial Fees: "+remedial_fees);
        System.out.println("Development Fees: "+development_fees);

    }
    public void Edit_details()
    {
        System.out.println("Edit Student Details:");
        System.out.println("1. Edit Name");
        System.out.println("2. Edit Tution fees");
        System.out.println("3. Edit Transport fees");
        System.out.println("4. Edit Development fees");
        System.out.println("5. Edit remedial fees");
        System.out.println("6. Edit Hostel fees");
        
        num=sc.nextInt();
        switch(num)
        {
            case 1:
            name= sc.nextLine();
            Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);

            case 2:
            tution_fees= sc.nextInt();
            Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);

            case 3:
            transport_fees= sc.nextInt();
            Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);

            case 4:
            development_fees= sc.nextInt();
            Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);

            case 5:
            remedial_fees= sc.nextInt();
            Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);

            case 6:
            hostel_fees= sc.nextInt();
            Details(name,tution_fees,transport_fees,hostel_fees,remedial_fees,development_fees);

        }

    }
    public void calculate_fees()
    {
        total_fees= tution_fees+transport_fees+remedial_fees+development_fees+hostel_fees;
        System.out.println("Name: "+name);
        System.out.println("Total Payable fees: "+total_fees);
    }

}