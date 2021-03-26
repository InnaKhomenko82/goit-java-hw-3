public class ATM{

  public int countBanknotes(int sum){
  int [] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
  int i = 0; int bill = 0;
    while (sum > 0) {
      bill += sum/banknotes[i];
      sum = sum%banknotes[i];
      i++;
    }
    return bill;
  }
  
  public static void main(String[] args) {
  ATM count = new ATM();
  //System.out.println(count.countBanknotes(500));
  System.out.println(count.countBanknotes(578));
  }
}