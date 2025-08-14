public class Book {
    private String name;
     private int code;
    private int numCopies;

    public Book(String name , int code , int numCopies) {
        this.name = name;
        this.code = code;
        this.numCopies = numCopies;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }
}
