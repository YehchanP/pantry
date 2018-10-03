public class Jam {

    private String content;
    private String date;
    private double size;

    public Jam(String c, String d, double s) {//Constructs a jam jar
        content = c;
        date = d;
        size = s;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    public boolean emptyCheck() {
        if (this.size > 0) {//If it has anything in the jar left
            return false;   //Returns false
        } else {
            return true;//Returns true if it is less than 0
        }
        
    }

    public void remove(double amount) {
        if (amount > this.size) {//Check if amount is over 0
            System.out.println("Spreading " + this.size + " fluid ounces of " + this.content+"\n");//If so spreads all that is in the jar
            this.size = 0;//Jar is empty since everything was spread
        } else {//If there would be left over
            System.out.println("Spreading " + amount + " fluid ounces of " + this.content+"\n");//Says it spreads the amount wanted
            this.size -= amount;//Subtracts it from the jar
        }
        if (emptyCheck()){//Check if jar is empty
            System.out.println("No jam in the jar!\n");//If true it outputs this
        }
    }

    public void displayJam() {
        System.out.println(this.content + "     " + this.date + "     " + this.size + " fl. oz.");//Displays parts of jam
    }

}
