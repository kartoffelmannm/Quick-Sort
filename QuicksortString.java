public class QuicksortString
{
    public static void main(String[] args) 
    {
        String liste[]={"q","w","e","r","t","z","u","i","o","p","a","s","d","f","g","h","j","k","l","y","x","c","v","b","n","m"};
        System.out.println("Unsortiert:"); 
        ausgeben(liste);
        System.out.println("Sortiert:");
        int von = 0;
        int bis = liste.length-1;
        quicksort(liste, von, bis);
    }   

    public static void quicksort(String liste[], int von, int bis) 
    {
        if (von < bis) 
        {
            int pivot = von;
            //pivot ist das Element, was in die Mitte gelegt wird und um das sortiert wird
            int i = von + 1;
            int j = bis;
            while(i<=j) {
                while (i < liste.length && liste[i].compareTo(liste[pivot])<0) 
                {
                    i++;
                }
                while (liste[j].compareTo(liste[pivot])>0 && j>von) 
                {     
                    j--;
                }
                if(i<=j){
                    String tmp      = liste[i];
                    liste[i]  = liste[j];
                    liste[j]  = tmp;  
                    i++;
                    j--;
                }
                ausgeben(liste);
            }  
            String tmp = liste[j];
            liste[j] = liste[pivot];
            liste[pivot] = tmp;
            ausgeben(liste);
            quicksort(liste,von, j-1);
            quicksort(liste, j+1, bis);
        }  
    }

    public static void ausgeben(String liste[])
    {
        for (int i=0; i<liste.length; i++)
        {
            System.out.print(liste[i]+" ");
        }
        System.out.println();
    } 
}