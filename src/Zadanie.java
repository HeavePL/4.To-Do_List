public class Zadanie {
    private int numer;
    private String czyZrobione = "[ ]";
    private String temat;
    private String tresc;

    public Zadanie(int numer,String temat, String tresc){
        setNumer(numer);
        setTemat(temat);
        setTresc(tresc);
    }
    public void wyswietl(){
        System.out.println(getNumer()+". "+getCzyZrobione()+" "+getTemat()+": "+getTresc());
    }
    public void zrobienie(){
        setCzyZrobione("[X]");
    }


    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setCzyZrobione(String czyZrobione) {
        this.czyZrobione = czyZrobione;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    public int getNumer() {
        return numer;
    }
    public String getTresc() {
        return tresc;
    }
    public String getCzyZrobione() {
        return czyZrobione;
    }

    public String getTemat() {
        return temat;
    }
}
