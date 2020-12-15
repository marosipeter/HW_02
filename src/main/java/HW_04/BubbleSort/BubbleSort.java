package HW_04.BubbleSort;
//based on https://www.geeksforgeeks.org/bubble-sort/

public class BubbleSort {

    void bubbleSort(SalesRepresentative arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getSales()*arr[j].getQuota() < arr[j+1].getSales()*arr[j+1].getQuota())
                {
                    // swap arr[j+1] and arr[j]
                    SalesRepresentative temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }



}
