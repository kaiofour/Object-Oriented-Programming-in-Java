package version3;

public class Name {
    private String fname;
    private String lname;
    private String mname;
    
    public Name() {}
    
    public Name(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
        this.mname = "";
    }
    
    public Name(String fname, String lname, String MI) {
        this.fname = fname;
        this.lname = lname;
        this.mname = MI;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMI() {
        return mname;
    }

    public void setMI(String MI) {
        this.mname = MI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name:");
        sb.append("\nfname: ").append(fname);
        sb.append("\nlname: ").append(lname);
        sb.append("\nMI: ").append(mname);     
        return sb.toString();
    }
    
    // public void display(){
    //     System.out.printf("%s, %s ", this.lname, this.fname);
    //     if (!this.mname.equals("")){
    //         System.out.printf(" %c.",this.mname.charAt(0));
    //     }
    //     System.out.printf(" - ");
    // }

}
