public class CreditCard{

  private String name;
  private String creditCardNumber;
  private String expirationDate;
  private int cvv;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }
  
// 1. Create the remaining getters and setters
public void setcreditCardNumber(String creditCardNumber){
    this.creditCardNumber = creditCardNumber;
  }

  public String getcreditCardNumber(){
    return creditCardNumber;
  }

    public void setexpirationDate(String expirationDate){
    this.expirationDate = expirationDate;
  }

  public String getexpirationDate(){
    return expirationDate;
  }

  public void setcvv(int cvv){
    this.cvv = cvv;
  }

  public int getcvv(){
    return cvv;
  }
}