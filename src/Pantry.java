public class Pantry {

    //Variable Declarations
    Jam jam1, jam2, jam3;
    public Jam userJam;
    
    //Constructor for making pantry object
    public Pantry(Jam jar1, Jam jar2, Jam jar3){
        jam1 = jar1;
        jam2 = jar2;
        jam3 = jar3;
    }

    //Method for the user's jam choice
    public void jamChoice(Jam choice){
        userJam = choice;
    }
    
    //Method for determining the amount left after spreading
    public void spread(double amount) {
        userJam.remove(amount);
    }
    
    //Method for displaying contents in the pantry
    public void displayPantry(){
        jam1.displayJam();
        jam2.displayJam();
        jam3.displayJam();
        
    }
    
    
    
}
