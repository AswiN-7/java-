import java.util.*;
class matrix
{
   public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int choice,row,column,row2,column2;
    int[][] mat1=new int[5][5];
    int[][] mat2=new int[5][5];
    int[][] mat3=new int[5][5];
    mat3[0][0]=0;
    System.out.println("matrix addition-1\nmatrix subraction-2\nmatrix multiplication-3 ");
    System.out.print("enter choice: ");
     choice=s.nextInt(); 
    System.out.print("enter row : ");
    row=s.nextInt();
    System.out.print("enter column : ");
    column=s.nextInt();
    System.out.println("for matrix 1 : ");
    input(row,column,mat1,s);
     if(choice==1||choice==2)
     {
       System.out.println("for matrix 2 : ");
    input(row,column,mat2,s);
    if(choice==1)
      add(mat1,mat2,mat3,row,column);
    else if(choice==2)
     sub(mat1,mat2,mat3,row,column);
     output(row,column,mat3);
    }
   else if(choice==3)
    {  while(1>0)
      {
        System.out.println("for matrix 2 : ");
        System.out.print("enter row : ");
        row2=s.nextInt();
        System.out.print("enter coulmn : ");
        column2=s.nextInt();
        if(column!=row2)
          System.out.println("first matrix column is not matched with second row so enter correctly ");
        else
          break; 
      }
      input(row2,column2,mat2,s);
      multiplication(mat1,mat2,mat3,row,column,column2);
      output(row,column2,mat3);
      
   }
    else
      System.out.println("enter correct choice");
    
    

     }
static void input(int row,int column,int mat[][],Scanner s)
    {
      int i,j;
      for(i=0;i<row;i++)
        for(j=0;j<column;j++)
          {
            System.out.print("enter ["+i+"]["+j+"]  :");
            mat[i][j]=s.nextInt();
          }
    }

 
static void output(int row,int column,int mat[][])
   {
    int i,j;
    for(i=0;i<row;i++)
    {
     for(j=0;j<column;j++)
       {
        System.out.print(mat[i][j]+"  "   );
       }
        System.out.print("\n");
    }

   }
static void add(int mat1[][],int mat2[][],int mat3[][],int row,int column)
   {int i,j;
    for(i=0;i<row;i++)
     {
      for(j=0;j<column;j++)
        { 
          mat3[i][j]=mat1[i][j]+mat2[i][j];
        }
    
     }
   }
static void sub(int mat1[][],int mat2[][],int mat3[][],int row,int column)
   {int i,j;
    for(i=0;i<row;i++)
     {
      for(j=0;j<column;j++)
        { 
          mat3[i][j]=mat1[i][j]-mat2[i][j];
        }
    
     }
   }
   static void multiplication(int mat1[][],int mat2[][],int mat3[][],int row,int column,int column2)
   {int i,j,k;
    for(i=0;i<row;i++)
     {
      for(j=0;j<column2;j++)
        for(k=0;k<column;k++)
        { 
          mat3[i][j]+=mat1[i][k]*mat2[k][j];
        }
    
     }
   }


}

/*
SAMPLE I/O:
aswin@aswin-HP-Pavilion-Laptop-15-cs2xxx:~/Desktop/java/programs/1b$ java matrix
matrix addition-1
matrix subraction-2
matrix multiplication-3 
enter choice: 3
enter row : 2
enter column : 3
for matrix 1 : 
enter [0][0]  :1
enter [0][1]  :2
enter [0][2]  :3
enter [1][0]  :4
enter [1][1]  :5
enter [1][2]  :6
for matrix 2 : 
enter row : 3
enter coulmn : 3
enter [0][0]  :1
enter [0][1]  :2
enter [0][2]  :3
enter [1][0]  :4
enter [1][1]  :5
enter [1][2]  :6
enter [2][0]  :7
enter [2][1]  :8
enter [2][2]  :9
30  36  42  
66  81  96  


 
*/
