
import java.util.Scanner;


class TaxDetails  {
    
    
    //objclsFee is object of calculus fee
    // CalculateFee objclsFee = new CalculateFee();
    
    // on the TOF is 10 percent tax
    static int GET_Registration_Tax(){
        return 45;
    }

    // public static void main(String[] args) {
    //     System.out.println(TaxTOFFee());        
    // }

    static int GET_TAX_onwnershipment_Feee(){
        return 50;
    }

    static int GET_Invoice_TAX(){
        return 70;
    }
    static int GET_Filer_Tax(){
        return 60;
    }
    static int GET_NonFiler_fee(){
        return 55;
    }
    public String Get_Tax_Details(){

        String str = "Filer Fee Tax is " + GET_Filer_Tax() + "\n" + "Non Filer Tax is " + GET_NonFiler_fee() +  "\n" + "Ownership Tax is "+ GET_TAX_onwnershipment_Feee() + "\n" +  "InVoice Tax is " + GET_Invoice_TAX() + "\n" +  "Transfer Order Tax is " + GET_Registration_Tax();
        System.out.println(str);
        return str;

    }
}


public class CalculateFee extends TaxDetails {

    public int typeVehicle;
     

    public int GetregistrationFee(){
        Scanner myobj = new Scanner(System.in);
        // reuturn the fee according the Vehicle 
        System.out.println("                     Enter The Type of Vehicle \n Press 1 for Under Four Wheel  \n Press 2 for above four wheel                        ");

    

        typeVehicle = myobj.nextInt();
        

        if (typeVehicle ==1){
            return 200;
        }
        else{
            return 400;
        }

        // System.out.println(typeVehicle);

    }
    public int Get_Ownership_Fee(){
        return 300+Get_Ownership_Fee();
    }
    public int Get_TOF_fee(){
        return 300+ GET_Registration_Tax();
    }
    public int GetInvoiceFee(){

        return 300 + GET_Invoice_TAX();
    }
    public int GetFilerfee(){
        
        return 300+ GET_Filer_Tax();
    }
    public int GetNonFilerFee(){
        return 500 + GET_TAX_onwnershipment_Feee();
    }

    

    
}

