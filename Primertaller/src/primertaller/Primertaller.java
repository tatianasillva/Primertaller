/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primertaller;

/**
 *
 * @author Estudiantes
 */
public class Primertaller {

    protected int x;
    private int y;
    private int r;
    
    void sumar(){
    r=x+y;
    }
    
    void restar(){
    if(x<y){
        int a;
        a=x;
        x=y;
        y=a;
   
    }
    
    if (x<0){
        x=-x;
        y=-y;
    }
    
    r=x-y;
    }          
    }
   
            

