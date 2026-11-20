public class Game {
   
   //instance variables
   private String name;
   private String category;
   private String description;
   private double gamePrice;
   private double gameSizeGB;
   private String review;
   
   
   
   //constructors
   public Game() {
      name = "Rainbow Six Siege";
      category = "tactical team shooter";
      gamePrice = 29.99; 
      description = "Rainbow Six Siege is an elite, tactical team-based shooter where superior planning and execution triumph.";
      gameSizeGB = 89.9;
      review = "";
   }
   public Game(String name, String category, String description, double gamePrice, double gameSizeGB) {
      this.name = name;
      this.category = category;
      this.gamePrice = gamePrice;
      this.description = description;
      this.gameSizeGB = gameSizeGB;
   }
   public String buy() {
      String returnString = name + " purchased!";
      return returnString;
   
   }
   public void leaveReview(String rev) {
    review = rev;
   
   
   } 
   public void open() {
   //open game
   }
   public void close() {
   //close game
   }
   public void download() {
   //download game
   } 
}  