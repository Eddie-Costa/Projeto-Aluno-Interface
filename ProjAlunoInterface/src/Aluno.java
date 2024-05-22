public class Aluno {
    public String nome;
    public int RGM;
    private int telefone;
    private double vl_mens;
    
    public int GetTelefone(){
        return this.telefone;
    }
    
    public void SetTelefone(int tel){
        this.telefone = tel;
    }
    
    public double GetValorm(){
        return this.vl_mens;
    }
    
    public void SetValorm(double vlmen){
        this.vl_mens = vlmen;
    }
    
    public double Desconto(){
        double valor = this.GetValorm();
        double desc = valor - (valor * 0.1);
        return desc;
    }
}
