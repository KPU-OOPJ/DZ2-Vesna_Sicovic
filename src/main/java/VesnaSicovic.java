package DZ2v;

public class VesnaSicovic {
    private String s;

    public VesnaSicovic(String s) {
        this.s = s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void okreni(){
        System.out.println("String u obrnutom redosledu glasi:\n");
        for (int i = s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
        System.out.println("\n");
    }
    
}