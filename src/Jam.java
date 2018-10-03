public class Jam {

    private String content;
    private String date;
    private double size;

    public Jam(String c, String d, double s) {
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
        if (this.size > 0) {
            return false;
        } else {
            return true;
        }
        
    }

    public void remove(double amount) {
        if (amount > this.size) {//Check if over 0
            System.out.println("Spreading " + this.size + " fluid ounces of " + this.content+"\n");
            this.size = 0;
        } else {
            System.out.println("Spreading " + amount + " fluid ounces of " + this.content+"\n");
            this.size -= amount;
        }
        if (emptyCheck()){
            System.out.println("No jam in the jar!\n");
        }
    }

    public void displayJam() {
        System.out.println(this.content + "     " + this.date + "     " + this.size + " fl. oz.");
    }

}
