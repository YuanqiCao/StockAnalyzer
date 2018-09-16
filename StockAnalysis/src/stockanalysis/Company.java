/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockanalysis;

/**
 *
 * @author Al
 */
public class Company{
    public String companyName;
    public double range;
    public double dividend;
    public double ROE;
    public double profitMargin;
    public double DE;
    public double value;

    public Company(String companyName, double range,double dividend,double ROE,double profitMargin,double DE){
        this.range = range;
        this.dividend = dividend;
        this.ROE = ROE;
        this.profitMargin = profitMargin;
        this.DE = DE;
        this.companyName = companyName;
        this.value = this.computeEvaluation();
    }
    
    
    


    //Alphabet.value();
    //Alphabet.value;

    public double computeEvaluation(){ // calculates pro, given a specific company's dividend, PE, profitMargin
        double value = 0;
        
        if (dividend>3)
        {
        value += 1;
        }

        else if (dividend>2 && dividend<=3)
                {
                     value +=0.8;
                }
        else if (dividend> 0 && dividend <1)
        {
            value +=0.5;
        }
         if ( ROE >= 40 ){

             value +=2.2;  
         }
         else if (ROE<30 && ROE>=20)
         {
             value +=1.2;
         }

         else if (ROE <20 && ROE>=10)
         {
             value +=0.8;
         }
         else if (ROE <10 && ROE >0)
         {
             value +=0;
         }
         
         else if (ROE <30)
         {
             value -=2.2;
         }
         

         if ( profitMargin >=20 ){

             value +=1.8;  
         }
         else if (profitMargin <20 && profitMargin>=10)
         {
             value +=0.8;
         }
         else if (profitMargin <10 && profitMargin >=0)
         {
             value +=0;
         }
         
         else if (profitMargin <0)
         {
             value -=1.5;
         }
         
         if ( DE >= 200 ){

             value -=1.5;  
         }
         else if (DE<200 && DE>=100)
         {
             value -= 1.1;
         }

         else if (DE<100 && DE>=50)
         {
             value -=0.7;
         }
         else if (DE<=50 && DE>0)
         {
             value -=0.3;
         }

         else if (DE==0)
         {
             value +=0.5;
         }
         return value;
    }
    public double getValue()
    {
        return value;
    }
    
    public double getRange()
    {
        return range;
    }

    void add(Company Tesla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
