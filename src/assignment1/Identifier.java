package setCalculator;

public class Identifier implements IdentifierInterface {
	
	private StringBuffer name;
	
	public Identifier() {
    	name = new StringBuffer("a");
    }

    public Identifier(Identifier identifier) {
    	this.name = identifier.name;
    }

    public Identifier init(char c) {
        name = new StringBuffer();
        name.append(c);
        return this;
    }

    public String getName(){
        return name.toString();
    }

    public void setName(String name){
        this.name = new StringBuffer(name);
    }

    public void addChar(char c) {
        name.append(c);
    }

    public char getChar(int position) {
        return name.charAt(position);
    }

    public int length() {
        return name.length();
    }

    public boolean equals(Identifier identifier) {
        return this.name.toString().equals(identifier.name.toString());
    }

}