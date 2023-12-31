package Assingnment2;
/*
 * Question 2
 Alice has n candies, where the ith candy is of type candyType[i]. 
 Alice noticed that she started to gain weight, so she visited a doctor. 

 The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
 Alice likes her candies very much, and she wants to eat the maximum number of different
  types of candies while still following the doctor's advice. 

 Given the integer array candyType of length n, return the maximum number of different 
 types of candies she can eat if she only eats n / 2 of them.
 */
public class Question2 {
    public static void main(String[] args) {
        int [] a={1,1,2,2,3,3};

        int n=a.length;

        Solution(a, n);
    }

    public static void Solution(int [] a,int n){
           int Uniquecount=0;
           for(int i=0;i<n;i++){
            boolean isUnique=true;
               for(int j=i+1;j<n;j++){
                   if(a[i]==a[j]){
                       isUnique=false;
                       break;
                    }
                }
                if(isUnique){
                    Uniquecount++;
                }
            }
            System.out.println("Since there are only :"+n/2+"  types, she can eat :"+Math.min(n, Uniquecount)+"  type candies.");
    }
}
