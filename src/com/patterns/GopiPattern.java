package com.patterns;



import java.util.*;



public class GopiPattern {
	
	public static void RightAngledTrianglePattern(int a) {
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=i-1;j++)
				System.out.print("*");
			System.out.println();
			}	
	}
	
	public static void ReverseRightAngledTrianglePattern(int a) {
		for(int i=0;i<=a;i++) {
			for(int j=a-i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<=i-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	public static void BottomMirrorViewOfRATPattern(int a) {
		for(int i=0;i<=a;i++) {
			for(int j=a-i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
	
	}
	public static void BottomMirrorViewOfRRATPattern(int a) {
		for (int i=0;i<=a;i++) {
			for(int k=i;k>0;k--)
				System.out.print(" ");
			for(int j=a-i;j>0;j--)
				System.out.print("*");
			System.out.println();
			
		}
		
	}
	
	public static void EqualateralTriangle(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void BottomViewOfEqualateralTriangle(int a) {
		
		for(int i=a;i>0;i--) {
			for(int k=1;k<=a-i;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
			
		}
	}
	
	public static void SqurePattern(int a) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++)
				System.out.print("*");
			System.out.println();
		  
		}
	}
	
	public static void DiamondPattern(int a) {
		EqualateralTriangle(a);
		int b=a-1;
		for(int i=b;i>0;i--) { 
			System.out.print(" ");
			for(int k=1;k<=b-i;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
	}
	
	public static void Parallelogram1(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=a-i;j>0;j--)
				System.out.print(" ");
			for(int k=1;k<=a;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void Parallelogram2(int a) {
		for(int i=0;i<a;i++) {
			for(int j=i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<a;k++)
				System.out.print("*");
			System.out.println();
		}
		}
	
	public static void OuterLineSqure(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i==1||j==1||i==a||j==a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void RightAngledTriangleOuterLine(int a){
		for(int i=1;i<=a;i++) {
			for(int j=i;j>0;j--) {
				if(j==i||j==1||i==a)
					System.out.print("*");
				else
					System.out.print(" ");
			   
			}
			System.out.println();
		}
		
	}
	
	
	 public static void RightMirrorViewOFRightAngledTrianglePatternOuterLine(int a){
		for(int i=1;i<=a;i++) {
			for(int j=a-i;j>0;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++) {
				if(k==i||i==a||k==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
	 
	 public static void BottomMirrorViewOfRightAngleTriangleOuterLine(int a){
		 for(int i=a;i>0;i--) {
			 for(int j=i;j>0;j--) {
				 if(i==a||j==1||j==i) 
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 }
			 System.out.println();
			 
		 }
	 }
	 
	 public static void MirrorViewOfBottomMirrorViewOfRightAngleTriangleOuterLine(int a){
		 for(int i=a;i>0;i--) {
			 for(int j=a-i;j>0;j--)
				 System.out.print(" ");
			 for(int j=i;j>0;j--) {
				 if(i==a||j==1||j==i) 
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 }
			 System.out.println();
			 
		 }
		 
	 }
	 
	public static void parallelogrmOuterline1(int a) {
		for(int i=a;i>0;i--) {
			for(int j=i-1;j>0;j--)
				System.out.print(" ");
			for(int k=a;k>0;k--) {
				if(i==1||k==a||k==1||i==a)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
				
		}
		
	}

	
	public static void parallelogrmOuterline2(int a) {
		for(int i=0;i<a;i++) {
			for(int k=i;k>0;k--)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||i==a-1||j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	public static void EqualateralTriangleOuterlinePattern(int a){
		for(int i=1;i<=a;i++) {
			for(int k=a-i;k>0;k--)
				System.out.print(" ");
			for(int j=2*i-1;j>0;j--) {
				 if(j==1||j==2*i-1||i==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void BottomMirrorViewEqualateralTriangleOuterlinePattern(int a){
		for(int i=0;i<a;i++) {
			for(int j=i;j>0;j--)
				System.out.print(" ");
			for(int k=2*(a-i)-1;k>0;k--) {
				if(i==0||k==1||k==2*(a-i)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
			
		}
	}
	
	
	 public static void DiamondOuterLine(int a) {
	 
		for(int i=1;i<=a;i++) {
			for(int j=a-i;j>0;j--)
				System.out.print(" ");
			for(int k=2*i-1;k>0;k--) {
				if(k==2*i-1||k==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		int b=a-1;
		for(int m=b;m>0;m--) {
			for(int p=a-m;p>0;p--)
				System.out.print(" ");
			for(int q=2*m-1;q>0;q--) {
				if(q==2*m-1||q==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	 
	 public static void X_pattern(int a) {
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<a;j++) {
				 if(j==i||j==a-i-1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	
	 public static void Z_pattern(int a) {
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<a;j++) {
				 if(i==0||i==a-1||j==a-i-1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void Reverse_Z_pattern(int a) {
		 for(int i=0;i<=a;i++) {
			 for(int j=0;j<a;j++) {
				 if(i==0||i==a-1||j==i)
					 System.out.print("*");
				 else
					 System.out.print(" ");
						 
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void Y_Pattern(int a){
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<a;j++) {
				 if(j==a-i-1||(i==j&& j<=a/2))
						 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void Reverse_Y_pattern(int a) {
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<a;j++) {
				 if(i==j||(j==a-i-1 && j>=a/2))
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void MirrorViewOf_Y_pattern(int a) {
		 for(int i=0;i<=a;i++) {
			 for(int j=0;j<a;j++) {
				 if(j==a-i-1||(j==i&&j>=a/2))
					 System.out.print("*");
				 else
					 System.out.print(" ");

			 }
			 System.out.println();
		 }
	 }
	 
	 public static void Lamda_pattern(int a) {
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<=a;j++) {
				 if(i==j||(j==a-i-1&&j<=a/2))
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void L_pattern(int a) {
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++) {
				if(j==0||i==a-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	 }
	 
	 
	 public static void S_pattern(int a) {
		 for(int i=0;i<a;i++) {
			 for(int j=0;j<a;j++) {
				 if(i==0||(j==0 && i<=a/2)||i==a/2||(j==a-1 && i>=a/2)||i==a-1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 //************************************************ while loop *********************************************************************
	
	 public static void Reverse_S_Pattern(int a){
	        int i=1;
	        while(i<=a){
	            int j=1;
	            while(j<=a){
	                if(i==1||i==(a/2)+1||i==a||(j==1&&i>a/2)||(j==a&&i<=a/2))
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	                j++;
	            }
	            i++;
	            System.out.println();
	        }
	    }
	 
	 public static void slash_in_square(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||j==1||i==a||j==a||i==j)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void BackSlash_in_Square(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||j==1||i==a||j==a||j==a-i+1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void E_pattern(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||i==(a/2)+1||i==a||j==1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void E_pattern2(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(j==1||j==(a/2)+1||j==a||i==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void E_pattern3(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||i==(a/2)+1||i==a||j==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 
	 public static void E_pattern4(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||j==1||j==(a/2)+1||j==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	
	 public static void U_pattern(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==a||j==1||j==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void Reverse_Upattern(int a) {
		 int i=1;
		 while(i<=a){
			 int j=1;
			 while(j<=a) {
				 if(i==1||j==1||j==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
				 
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void open_SquareBracket(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||j==1||i==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 
	 public static void Close_SquareBracket(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==a||j==a||i==1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void X_in_Box(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||j==1||i==a||j==a||i==j||j==a-i+1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 
	 public static void N_pattern(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(j==1||i==j||j==a)
					System.out.print("*");
				 else
					System.out.print(" "); 
				 j++;
				 }
			 i++;
			 System.out.println();
			 }
		 }
	 
	 public static void Two_horijontal_box_pattern(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||i==(a/2)+1||j==1||j==a||i==a)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	 public static void two_Vertical_Box_pattern(int a) {
		 int i=1;
		 while(i<=a) {
			 int j=1;
			 while(j<=a) {
				 if(i==1||i==a||j==1||j==a||j==(a/2)+1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
				 j++;
					 
			 }
			 i++;
			 System.out.println();
		 }
	 }
	 
	public static void F_pattern(int a) {
		int i=1;
		while(i<=a) {
			int j=1;
			while(j<=a) {
				if(i==1||j==1||(i==(a/2)+1&&j<=(a/2)+1))
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
	public static void G_pattern(int a) {
		int i=1;
		while(i<=a) {
			int j=1;
			while(j<=a) {
				if(i==1||j==1||(i==a&&j<=(a/2)+1)||(j==(a/2)+1&&i>=(a/2)+1)||(i==(a/2)+1&&j>=(a/2)+1)||(j==a&&i>=(a/2)+1))
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
				
			}
			i++;
			System.out.println();
		}
		
	}
	
	
	public static void H_pattern(int a) {
		int i=1;
		while(i<=a) {
			int j=1;
			while(j<=a) {
				if(i==(a/2)+1||j==1||j==a)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			i++;
			System.out.println();
			
		}
	}
	
	//********************************************* do while loop ********************************************************
	public static void I_pattern(int a) {
		int i=0;
		do {
			int j=0;
			do{
				if(i==0||i==a-1||j==(a/2))
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}while(j<a);
			i++;
			System.out.println();
			
		}while(i<a);
		
	}
	
	public static void J_pattern(int a) {
		int i=0;
		do {
			int j=0;
			do {
				if(i==0||j==a/2||(i==a-1&&j<=a/2))
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}while(j<a);
			
			i++;
			System.out.println();
		}while(i<a);
		
	}
	
	 
	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		
	    //RightAngledTrianglePattern(n);
	    /*
		output pattern
		 
		*
		**
		***
		****
		*****
		******
		
		*/
	    
		//ReverseRightAngledTrianglePattern(n);
		/*
		 output pattern
		      
		     	*
		 	   **
		 	  ***
		 	 ****
		 	*****

		 */
		//BottomMirrorViewOfRATPattern(n);
		/*
		 OUTPUT PATTERN
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		//BottomMirrorViewOfRRATPattern(n);
		/*
		 output pattern 
		 
		 *****
		  ****
		   ***
		    **
		     *
		 
		 */
		//EqualateralTriangle(n);
		/*
		     *
		    ***
		   *****
		  *******
		 *********
		 
		 */
		//BottomViewOfEqualateralTriangle(n);
		/*
		********* 
		 *******
		  *****
		   ***
		    *
		 */
		
		//SqurePattern(n);
		
		/*
		 *****
		 *****
		 *****
		 *****
		 *****
		 */
		
		//DiamondPattern(n);
		
		/*
		 diamond pattern
		 
		     *
		    ***
		   *****
		  *******
		 *********
		  *******
		   *****
		    ***
		     *
		     
		     
		 */
		
		// Parallelogram1(n);
		/*
		 parallelogram pattern
		 
		     *****
		    *****
		   *****
		  *****
		 *****
		 
		 */
		// Parallelogram2(n);
		/*
		parallelogram pattern  
		  
		 *****
		  *****
		   *****
		    *****
		     *****
		 */
		
		//OuterLineSqure(n);
		
		/*
		 pattern 
		 
		 *****
		 *   *
		 *   *
		 *   *
		 *****	
		 
		 
		 */
		
		
		// RightAngledTriangleOuterLine(n);
		/*
		 pattern
		 
		 *
		 **
		 * *
		 *  *
		 *****
		 
		 
		 */
		
		// RightMirrorViewOFRightAngledTrianglePatternOuterLine(n);
		
		/*
		 pattern
		 
		     *
		    **
		   * *
          *  *
         *****
         
         
		 */
		
		//BottomMirrorViewOfRightAngleTriangleOuterLine(n);
		
		/*
		 pattern:
		 
		 
		 *****
		 *  *
		 * *
		 **
		 *
		 
		 */
		//MirrorViewOfBottomMirrorViewOfRightAngleTriangleOuterLine(n);
		
		/*
		 pattern
		 
		 *****
		  *  *
  		   * *
   		    **
    	     *
    
		 */
		
		// parallelogrmOuterline1(n);
		
		/*
		 pattern
		 
		      *****
		     *   *
            *   *
           *   *
          *****
		 
		 */
		
		// parallelogrmOuterline2(n);
		
		/*
		 pattern
		 
		 *****
		  *   *
           *   *
            *   *
             *****
		 */
		
		
		// EqualateralTriangleOuterlinePattern(n);
		
		/*
		 pattern
		 
		     *
            * *
           *   *
          *     *
         *********
		 
		 */
		
		// BottomMirrorViewEqualateralTriangleOuterlinePattern(n);
		
		/*
		 pattern
		 
		 *********
		  *     *
		   *   *
            * *
             *
		 
		 
		 */
		
		// DiamondOuterLine(n);
		
		/*
		 pattern
		 
		     *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *
		 
		 */
		
		
		// X_pattern(n);
		
		/*
		 pattern
		 
		 *   *
          * * 
           *  
          * * 
         *   *
		 
		 
		 */
		
		// Z_pattern(n);
		/*
		 pattern
		 
		  *****
		 	 * 
		    *  
           *   
          *****
		 
		 */
		
		// Reverse_Z_pattern(n);
		
		/*
		 pattern
		 
		 *****
          *   
           *  
            * 
         *****
		 
		 
		 */
		
		// Y_Pattern(n);
		
		/*
		 pattern
		 
		 *   *
		  * * 
           *  
          *   
         * 
         
         
		 */
		
		// Reverse_Y_pattern(n);
		
		/*
		 pattern
		 
		 *   *
 		  * * 
           *  
            * 
             *
		 
		 
		 */
		
		// MirrorViewOf_Y_pattern(n);
		/*
		 pattern
		 
		    *
           * 
   		  *  
  		 * * 
 		*   *

		 
		*/
		//Lamda_pattern(n);
		
		/*
		 pattern
		 
		 *     
          *    
           *   
          * *  
         *   * 
		 
		 
		 */
		
		//L_pattern(n);
		
		/*
		 L_pattern
		 
		 
		 *    
		 *    
		 *    
		 *    
		 *****
		 
		 
		 */
		
		// S_pattern(n);
		/*
		 S pattern
		 
		 *****
		 *    
		 *****
		 	 *
		 *****
		 
		 */
		
		//**************************************************( Using While loop)**********************************************************
		 
		
		// Reverse_S_Pattern(n);
		
		/*
		 pattern
		
		
		 *****
		 	 *
		 *****
		 *    
		 *****
  
		 */
		
		// slash_in_square(n);
		
		/*
		 pattern
		 
		 *****
		 **  *
		 * * *
		 *  **
		 *****
		 
		 
		 */
		
		// BackSlash_in_Square(n);
		/*
		 
		 *****
		 *  **
		 * * *
		 **  *
		 *****
		 
		 
		 */
		
		// E_pattern(n);
		
		/*
		 pattern
		 
		 *****
		 *    
		 *****
		 *    
		 *****
		 
		 */
		
		// E_pattern2(n);
		
		/*
		 pattern
		 
		 * * *
		 * * *
		 * * *
		 * * *
		 *****
		 
		 
		 */
		
		// E_pattern3(n);
		
		/*
		 pattern
		 
		 *****
		 	 *
		 *****
		 	 *
		 *****

		 
		 */
		
		//E_pattern4(n);
		
		/*
		 
		 *****
		 * * *
		 * * *
		 * * *
		 * * *
		 
		 */
		
		// U_pattern(n);
		
		/*
		 
		 *   *
		 *   *
		 *   *
		 *   *
		 *****

		 
		 
		 */
		// Reverse_Upattern(n);
		
		/*
		 
		 
		 *****
		 *   *
		 *   *
		 *   *
		 *   *
		 
		 */
		
		// open_SquareBracket(n);
		
		/*
		 
		 *****
		 *    
		 *    
		 *    
		 *****
		 
		 */
		// Close_SquareBracket(n);
		
		/*
		 
		 *****
		 	 *
		 	 *
		 	 *
		 *****
		 
		 
		 */
		
		//X_in_Box(n);
		
		/*
		 
		 *****
		 ** **
		 * * *
		 ** **
		 *****
		 
		 
		 */
		
		// N_pattern(n);
		/*
		 
		 *   *
		 **  *
		 * * *
		 *  **
		 *   *
		 
		 */
		
		//Two_horijontal_box_pattern(n);
		
		/*
		 
		 *****
		 *   *
		 *****
		 *   *
		 *****
		 
		 
		 */
		
		//two_Vertical_Box_pattern(n);
		
		/*
		 
		 *****
		 * * *
		 * * *
		 * * *
		 *****
		 
		 */
		
		
		// F_pattern(n);
		/*
		 
		 *****
		 *    
		 ***  
		 *    
		 *   
		 
		 */
		
		
		//G_pattern(n);
		/*
		 
		 *****
		 *    
		 * ***
		 * * *
		 *** *
		 
		 */
		
		
		// H_pattern(n);
		
		/*
		 
		 *   *
		 *   *
		 *****
		 *   *
		 *   *
		 
		 */
		//****************************************   do-while  loop ********************************************************************
		
		//I_pattern(n);
		
		
		
		/*
		 
		 *****
		   *  
		   *  
		   *  
		 *****
		 
		 
		 */
		
		J_pattern(n);
		
		/*
		 
		 *****
		   *  
		   *  
		   *  
		 *** 
		 
		 */
		
	 
		
		
		
		
		read.close();
	}

}




