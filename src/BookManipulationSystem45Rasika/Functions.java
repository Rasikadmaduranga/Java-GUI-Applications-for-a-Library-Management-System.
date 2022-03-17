
package BookManipulationSystem45Rasika;

/**
 *
 * @author Anonymous
 */
public class Functions {
    public String[] ISBN = new String[10000];
    public String[] Name =new String[10000];
    public String[] Edition =new String[10000];
    public String[] Author = new String[10000];
    public double[] Price = new double[10000];
    public int elements=0;

    public void Add(String I,String N,String E,String A,double P){
        ISBN[elements] = I;
        Name[elements] = N;
        Edition[elements] = E;
        Author[elements] = A;
        Price[elements] = P;
        elements++;
    }

    public int Data(String MS){
        int i;
        for(i=0; i<elements; i++ ){
            if(ISBN[i].equals(MS))
                break;
            }
            return i;
        }
     public int getElements(){
         return elements;
     }    

    public boolean Update(String I,String N,String E,String A,double P){
        int i = Data(N);
            if(i==elements){
                return false;
            }else{
                ISBN[i]=I;
                Name[i]=N;
                Edition[i]=E;
                Author[i]=A;
                Price[i]=P;
                elements++;
                return true;
            }
        }

    public boolean Delete(String MS){
        int i = Data(MS);
            if(i==elements){
                return false;
            }else{
                for(int x=i; x<elements-1; x++ ){
                    ISBN[x]=ISBN[x+1];
                    Name[x]=Name[x+1];
                    Edition[x]=Edition[x+1];
                    Author[x]=Author[x+1];
                    Price[x]=Price[x+1];
                }
                elements--;
                return true;
            }
        }    

    public String Display(){
        String result="";
        for(int i=0; i<elements;i++){
            result +=ISBN[i] + ",";
            result +=Name[i] + ",";
            result +=Edition[i] + ",";
            result +=Author[i] + ",";
            result +=Price[i] +"\n";
        }
        return result;
    }

    public String Find(String I,String N,String A){
        int i;
        String result ="";
        for(i=0; i<elements; i++ ){
            if(ISBN[i].equals(I)||Name[i].equalsIgnoreCase(N)||
                    Author[i].equalsIgnoreCase(A)){
                result +=ISBN[i] + ",";
                result +=Name[i] + ",";
                result +=Edition[i] + ",";
                result +=Author[i] + ",";
                result +=Price[i] +"\n";
                break;
         }
        }
        return result;
    }
 
     public boolean FindDuplicate(String MS){
         int dup = 0;
         for(int i=0; i<elements; i++ ){
             if(ISBN[i].equals(MS))
                 dup ++;
         }
         if(dup==0){
             return false;
         }else{
             return true;
         }
     }
     
     public void AscendingOrder(){
      double a;
      String I; String N; String E; String A;
      int x;
      for(int i=1; i<elements; i++){
          a = Price[i];          
          I = ISBN[i];
          N = Name[i];
          E = Edition[i];
          A = Author[i];        
          x=i;
          while(x>0 && Price[x-1]>=a){
                ISBN[x]=ISBN[x-1];
                Name[x]=Name[x-1];
                Edition[x]=Edition[x-1];
                Author[x]=Author[x-1];
                Price[x]=Price[x-1];                
                --x;
          }
          ISBN[x] = I;
          Name[x] = N;
          Edition[x] = E;
          Author[x] = A;          
          Price[x] = a;
      }
    }
   
    public void DescendingOrder(){
      double d;
      String I; String N; String E; String A;      
      int x;
      for(int i=1; i<elements; i++){
          d = Price[i];
          I = ISBN[i];
          N = Name[i];
          E = Edition[i];
          A = Author[i];           
          x=  (int) d;
          while(x>0 && Price[x-1]<=d){
                ISBN[x]=ISBN[x-1];
                Name[x]=Name[x-1];
                Edition[x]=Edition[x-1];
                Author[x]=Author[x-1];              
                Price[x]=Price[x-1];
                --x;
          }
          ISBN[x] = I;
          Name[x] = N;
          Edition[x] = E;
          Author[x] = A;           
          Price[x] = d;
      }
    }    
     public boolean isEmpty(){
          return(elements==0);
      }
      
      public boolean isFull(){
          return(elements==10000);
      }
}
