public class Quicksort01MAINMETHODE
{
    public static void main(String[] args) 
    {
        int liste[]={4,1,8,5,6,12,1,3,1,44,2};
        System.out.println("Unsortiert:"); 
        ausgeben(liste);
        System.out.println("Sortiert:");
        int von = 0;
        int bis = liste.length-1;
        quicksort(liste, von, bis);
    }   

    public static void quicksort(int liste[], int von, int bis) 
    {
        if (von < bis) 
        {
            int pivot = von;
            //pivot ist das Element, was in die Mitte gelegt wird und um das sortiert wird geil
            int i = von + 1;
            int j = bis;
            while(i<=j) {
                while (i < liste.length && liste[i] < liste[pivot]) 
                {
                    i++;
                }
                while (liste[j] > liste[pivot] && j>von) 
                {     
                    j--;
                }
                if(i<=j){
                    int tmp      = liste[i];
                    liste[i]  = liste[j];
                    liste[j]  = tmp;  
                    i++;
                    j--;
                }
                ausgeben(liste);
            }  
            int tmp = liste[j];
            liste[j] = liste[pivot];
            liste[pivot] = tmp;
            ausgeben(liste);
            quicksort(liste,von, j-1);
            quicksort(liste, j+1, bis);
        }  
    }

    public static void ausgeben(int liste[])
    {
        for (int i=0; i<liste.length; i++)
        {
            System.out.print(liste[i]+" ");
        }
        System.out.println();
    } 
}