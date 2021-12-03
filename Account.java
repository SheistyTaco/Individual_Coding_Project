package account;
public class Account {
	private double total;
    private String name;
    private String[] history = new String[5];
    public Account(String name, double total){
        this.name = name;
        this.total = total;
        this.history = history;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setTotal(double total) {
    	this.total = total;
    }
    public double getTotal() {
    	return total;
    }
    public String[] getHistory() {
    	return history;
    }
}
