// FileEditor_1Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {
double[] energy = new double[2];
		double[] energy2 = new double[2];
		double[] energy2a = new double[2];
		
        /**
         * Run the test cases.
         */
    @Test
    public void calculateFile_1() {
            // Run tests
    	try {
            FileReader fr=new FileReader("sdfsdf");
            Reader r = fr.getReader();
            Scanner s = new Scanner(r);
    		
            while(s.hasNextLine())
                    {
                         String ss = s.nextLine();
                             
                     if(ss.length()>2 && ss.substring(0,ss.indexOf(':')).toLowerCase().equals("comp")) {
                             // Comp is written by pull_comps. 
                             
        		int num_focus;
        		
        		s.nextLine();
        		s.nextLine();
        		s.nextLine();
        		s.nextLine();
        		s.nextLine();
    				
                       num_focus = s.nextInt();
                       fr.close();
                       
                       double[] s_2 = s.readDoubleArray();
        		s.close();

        		s = new Scanner(fr);
        		
                        while(s.hasNextDouble()) {
                         
                             double[] s_3 = s.readDoubleArray();
						  
                                double[][] s_4 = s_3.clone();
                                //double[] s_res = new double[4];
                                double[][] s_res = new double[4][2];
                                int i3 = 0;			
                                for (i3 = 0; i3 < 4; i3++) {
									//double[][] s_tmp = s_res[i3].clone();
                                	 int i4 = 0; 
    				 	 
     					while(i4 < 2){  
    						s_4[i4][i3] = s_4[i4][i3] + s_res[i4][i3];  
    					i4++;  
					}
							i4 = 0;  
						}		  
							
                         if (num_focus == 2) {
                                         
                                         double energy = 0;
                                        
                                         if(ss.substring(ss.indexOf(':')+1).equals("comp")) {	
                        		      
                                                    energy = 0;
                                                
                                                    for (i3 = 0; i3 < 4; i3++){
                                                        energy += s_4[i3][2];
                                                   }
                                                
                                          } else {
                                                
                                                 double[][] s2_t = new double[1][4];
                                                              
                                                s.readDoubleArray(s2_t);
                                                for (int i3 = 0; i3 < s2_t[0].length; i3++) {
										//	  System.out.println(ss.substring(ss.charAt(ss.length()-i3))); 
										  energy += Math.pow(s[s2_t[0][i3] - 1], s2_t[1][0]); // s[s[0][i3] - 1];
									//	  s2_t[0][i3] = 0;
										  s2_t[1][0] = 0;
									}
                                    }
                                    
                                            
                                            
                                
                                            
                                }
                                return true;
                        } else if (num_focus == 3) {
    					      
                            double[][] s_res_2 = new double[4][2];
                            for (int i2 = 0; i2 < 4; i2++) {
                                    s_res_2[i2][0] = s_res_2[i2][1] = s_res_2[i2][2] = s_res_2[i2][3] = 0;
                            }
                          
								    
                            for (int i4 = 0; i4 < 2; i4++) {
                                    double sum = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                         s_res_2[i4][i3] =
                                                    Math.pow(s_res_2[i4][i3], s_res_2[i4][i3]);
                                    }
                                    
                                    for (i4 = 1; i4 < 4; i4++)
                                        sum += s_res_2[i3][i4];
                                    
                                    s_res_2[i3][1] = sum;
                                    
                                    sum = 0;
									    for (int i2 = 0; i2 < 2; i2++) {
										  s_res_2[i4][i2] =
										 	Math.pow(s_res_2[i4][i2], s_res_2[i4][i2]);									    
										  sum += s_res_2[i4][i2];
										  s_res_2[i4][i2] = 0.0;
									
									}
									
                                    
                                    
                                    
                                    
			
                                }
					
			
                                for (int i2 = 0; i2 < 4; i2++) {
									//for (int i3 = 0; i3 < 4; i3++) {
									//	  i5 = i4 * 3;
									//	  s_res_2[i2][i5] = s_res_2[i2][i5] + s_res_2[i2][i4];
									//}
									//return true;
								    
				
								    // for (int i3 = 0; i3 < 4; i3++) {
                                    
                                    
                                        double[][] s_res_2_1 = new double[4][2];
                                        for (int i4 = 0; i4 < 4; i4++) {
                                            s_res_2_1[i4][0] = s_res_2_1[i4][1] = s_res_2_1[i4][2] = s_res_2_1[i4][3] = 0;
                                            s_res_2_1[i4][2] = 0;
										   
                                        }
					
				//                double[][] s_res_2_2 = new double[4][2];
				//                for (int i4 = 0; i4 < 4; i4++) {
				//                	
									s_res_2_2[i4][0] = s_res_2_2[i4][1] = s_res_2_2[i4][2] = s_res_2_2[i4][3] = 0;
				//                }
				//                    
				//                                  
                                    int i5 = i4 * 2;
                                    s_res_2_1[i4][i5] = s_res_2_