import java.util.Scanner; 
public class QSORT { 
    String names[]; 
    int length; 
    public static void main(String[] args){ 
      QSORT obj = new QSORT(); 
      System.out.println("Enter the number of names");  
      Scanner obj1=new Scanner(System.in); 
      int n= obj1.nextInt(); 
      
      String[] stringsList=new String[n];  
      System.out.println("Enter the Names");  
      for(int i=0;i<n;i++) 
      { 
        stringsList[i]=obj1.next(); 
      } 
      obj.sort(stringsList); 
      System.out.println("The sorted names are:"); 
      for(String i : stringsList){ 
        System.out.println(i); 
       
      } 
    } 
    void sort(String array[]){ 
        if(array == null||array.length==0){ 
            return; 
        } 
        this.names=array; 
        this.length=array.length; 
        quickSort(0,length-1); 
    } 
    void quickSort(int lowI,int higI){ 
        int i = lowI; 
        int j = higI; 
        String pivot = this.names[lowI+(higI-lowI)/2]; 
        while (i<=j) { 
            while (this.names[i].compareToIgnoreCase(pivot)<0) { 
                i++; 
            } 
            while (this.names[j].compareToIgnoreCase(pivot)>0) { 
                j--; 
            } 
            if (i<=j) { 
                exchangeNames(i,j); 
                i++; 
                j--; 
            } 
        } 
        if (lowI<j) { 
            quickSort(lowI, j); 
        } 
        if (i<higI) { 
            quickSort(i, higI); 
        } 
} 
void exchangeNames(int i,int j){ 
String temp = this.names[i]; 
this.names[i]=this.names[j]; 
this.names[j]=temp;         
} 
}