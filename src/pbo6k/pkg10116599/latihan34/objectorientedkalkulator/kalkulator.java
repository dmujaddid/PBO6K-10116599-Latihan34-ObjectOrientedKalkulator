/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan34.objectorientedkalkulator;

/**
 *
 * @author eka
 */
public class kalkulator {
    
    double value1;
    double value2;
  
  void isiOperan1(double x){
      value1 = x;
           
  }
  
  void isiOperan2(double y){
      value2 = y;
      
  }
    
  
  public double tambah(){
      return value1+value2;
  }
  
  public double kurang(){
      return value1 - value2;
  }
  
  public double kali(){
      return value1*value2;
  }
  
  public double bagi(){
      return value1/value2;
  }
  
  public double sisa(){
      return value1%value2;
  }
    
}
