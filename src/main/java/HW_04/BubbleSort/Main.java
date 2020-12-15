package HW_04.BubbleSort;

public class Main {

    public static void main(String... args){

        SalesRepresentative firstRep = new SalesRepresentative(1,10,500);
        SalesRepresentative secondRep = new SalesRepresentative(2,7,800);
        SalesRepresentative thirdRep = new SalesRepresentative(3,8,500);
        SalesRepresentative forthRep = new SalesRepresentative(4,9,800);
        SalesRepresentative fifthRep = new SalesRepresentative(5,6,500);
        SalesRepresentative sixthRep = new SalesRepresentative(6,11,800);
        SalesRepresentative seventhRep = new SalesRepresentative(7,12,500);
        SalesRepresentative eightRep = new SalesRepresentative(8,4,800);
        SalesRepresentative ninthRep = new SalesRepresentative(9,20,400); //8000 as tenth
        SalesRepresentative tenthRep = new SalesRepresentative(10,10,800); //8000 as ninth


        SalesRepresentative[] reps = new SalesRepresentative[10];
        reps[0] = firstRep;
        reps[1] = secondRep;
        reps[2] = thirdRep;
        reps[3] = forthRep;
        reps[4] = fifthRep;
        reps[5] = sixthRep;
        reps[6] = seventhRep;
        reps[7] = eightRep;
        reps[8] = ninthRep;
        reps[9] = tenthRep;

        System.out.println("The original order is:");
        for (int i = 0; i<reps.length; i++)
        {
            System.out.println("\t"+reps[i]);
        }

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(reps);

        System.out.println("\nThe sorted order is:");
        for (int i = 0; i<reps.length; i++)
        {
            System.out.println("\t"+reps[i]);
        }


    }
}
