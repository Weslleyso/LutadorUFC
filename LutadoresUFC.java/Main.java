public class Main {
    public static void main (String[] args){
        Lutador c = new Lutador();
        c.setNome("Charles Oliveira");
        c.setNacionalidade("Brasil");
        c.setIdade(33);
        c.setAltura(1.78);
        c.setPeso(70);
        c.setCategoria("Leves");
        c.setVitorias(34);
        c.setDerrotas(9);
        c.setEmpates(0);
       
       
        //c.ganharLuta();
       // c.ganharLuta();
       // c.perderLuta();
        //c.empatarLuta();
        
        
        
        
        
        c.apresentar();
        c.status();
        

        
        
    }
    
}
