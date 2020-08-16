import java.util.LinkedList; 
import java.util.Queue; 
  
public class RotOrange  
{ 
      
   
    static class Pair 
    { 
        int x = 0; 
        int y = 0; 
        Pair(int x,int y) 
        { 
            this.x = x; 
            this.y = y; 
        } 
    } 
      
    static boolean isValid(int i, int j) 
    { 
        return (i >= 0 && j >= 0 && i < R && j < C); 
    } 
      
  
     
    
    static boolean isDelim(Pair temp) 
    { 
        return (temp.x == -1 && temp.y == -1); 
    } 
      
    
    static boolean checkAll(int grid[][]) 
    { 
         for (int i=0; i<R; i++) 
               for (int j=0; j<C; j++) 
                  if (grid[i][j] == 1) 
                     return true; 
         return false; 
    } 
      
    
    static int rotOranges(int grid[][]) 
    { 
    
        Queue<Pair> Q=new LinkedList<>(); 
        int R = grid.length;
        int C = grid[0].length;
        Pair temp;  
        int ans = 0; 
    
        for (int i=0; i < R; i++) 
           for (int j=0; j < C; j++) 
               if (grid[i][j] == 2) 
                   Q.add(new Pair(i,j));                 
    
        Q.add(new Pair(-1,-1)); 
                  
        while(!Q.isEmpty()) 
        {  
            boolean flag = false; 
              
           
            while(!isDelim(Q.peek())) 
            { 
                temp = Q.peek(); 
                  
          
                if(isValid(temp.x+1, temp.y) && grid[temp.x+1][temp.y] == 1) 
                { 
                    if(!flag) 
                    { 
          
                        ans++; 
                        flag = true; 
                    } 
          
                    grid[temp.x+1][temp.y] = 2; 
                      
          
                    temp.x++; 
                    Q.add(new Pair(temp.x,temp.y)); 
                      
          
                    temp.x--; 
                } 
                  
          
                if (isValid(temp.x-1, temp.y) && grid[temp.x-1][temp.y] == 1) 
                 { 
                        if (!flag) 
                        { 
                            ans++; 
                            flag = true; 
                        } 
                        grid[temp.x-1][temp.y] = 2; 
                        temp.x--; 
                        Q.add(new Pair(temp.x,temp.y));
                        temp.x++; 
                 } 
                  
                
                 if (isValid(temp.x, temp.y+1) && grid[temp.x][temp.y+1] == 1) { 
                        if(!flag) 
                        { 
                            ans++; 
                            flag = true; 
                        } 
                        grid[temp.x][temp.y+1] = 2; 
                        temp.y++; 
                        Q.add(new Pair(temp.x,temp.y));
                        temp.y--; 
                    } 
                   
                 
                 if (isValid(temp.x, temp.y-1) && grid[temp.x][temp.y-1] == 1)  
                 { 
                        if (!flag) 
                        { 
                            ans++; 
                            flag = true; 
                        } 
                        grid[temp.x][temp.y-1] = 2; 
                        temp.y--; 
                        Q.add(new Pair(temp.x,temp.y));
                 } 
                 Q.remove(); 
                   
            } 
            
            Q.remove(); 
              
            
            if (!Q.isEmpty())  
            { 
                Q.add(new Pair(-1,-1)); 
            } 
              
            
        } 
          
        
        return (checkAll(grid))? -1: ans; 
          
    } 
      
    
    public static void main(String[] args)  
    { 
        int grid[][] = { {2, 1, 1}, 
                        {1, 1, 0}, 
                        {0, 1, 1}
                    }; 
        System.out.println(rotOranges(grid));      
    } 
  
} 